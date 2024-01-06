package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import gaozhu.francis.pojo.Account;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 通过分步查询的方式查询账户信息集连到帖子信息
 * @author FrancisGaozhu
 * 2023-12-12 14:34:53
 */
public class Demo6 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            List<Account> accounts = accountMapper.selectAllWithTopics2();
            for (Account account : accounts) {
                System.out.println(account);
            }
        }
    }
}
