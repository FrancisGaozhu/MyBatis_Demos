package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * 执行删除
 * @author FrancisGaozhu
 * 2023-11-29 22:42:44
 */
public class Demo3 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml")).openSession(true)) {
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            int count = accountMapper.delete();
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
