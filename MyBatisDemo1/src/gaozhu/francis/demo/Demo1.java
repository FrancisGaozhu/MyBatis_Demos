package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import gaozhu.francis.pojo.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

/**
 * 执行基本查询
 * @author FrancisGaozhu
 * 2023-11-29 22:30:38
 */
public class Demo1 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml")).openSession(true)){
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            List<Account> accounts = accountMapper.select();
            for (Account account : accounts) {
                System.out.println(account);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
