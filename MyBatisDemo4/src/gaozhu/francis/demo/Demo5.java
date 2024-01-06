package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import gaozhu.francis.pojo.Account;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 动态表名称
 * @author FrancisGaozhu
 * 2023-12-04 15:07:12
 */
public class Demo5 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            List<Account> tAccount = accountMapper.getAllDataFromTable("t_account");
            for (Account account : tAccount) {
                System.out.println(account);
            }
        }
    }
}
