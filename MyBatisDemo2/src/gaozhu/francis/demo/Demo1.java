package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import gaozhu.francis.pojo.Account;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 查询所有数据
 * @author FrancisGaozhu
 * 2023-11-29 23:04:17
 */
public class Demo1 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            List<Account> accounts = accountMapper.selectAll();
            for (Account account : accounts) {
                System.out.println(account);
            }
        }
    }
}
