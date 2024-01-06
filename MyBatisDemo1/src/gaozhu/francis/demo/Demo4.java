package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * 执行修改操作
 * @author FrancisGaozhu
 * 2023-11-29 22:45:20
 */
public class Demo4 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml")).openSession(true)) {
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            int count = accountMapper.update();
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
