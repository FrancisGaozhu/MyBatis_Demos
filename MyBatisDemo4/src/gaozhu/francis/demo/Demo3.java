package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import gaozhu.francis.pojo.Account;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 模糊查询（方案3）
 * @author FrancisGaozhu
 * 2023-11-30 19:56:22
 */
public class Demo3 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            List<Account> accounts = accountMapper.selectByPartOfName3("红");
            for (Account account : accounts) {
                System.out.println(account);
            }
        }
    }
}
