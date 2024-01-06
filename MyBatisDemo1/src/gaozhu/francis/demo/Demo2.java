package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * 执行数据添加
 * @author FrancisGaozhu
 * 2023-11-29 22:38:58
 */
public class Demo2 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml")).openSession(true)) {
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            int count = accountMapper.insert();
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
