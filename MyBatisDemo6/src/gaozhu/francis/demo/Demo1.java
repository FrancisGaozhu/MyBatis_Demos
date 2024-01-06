package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import gaozhu.francis.pojo.Account;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author FrancisGaozhu
 * 2023-12-06 16:00:23
 */
public class Demo1 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
            List<Account> accounts1 = mapper.selectAll1();
            for (Account account : accounts1) {
                System.out.println(account);
            }
            System.out.println("---------------------------------------------------------------------");
            List<Account> accounts2 = mapper.selectAll2();
            for (Account account : accounts2) {
                System.out.println(account);
            }
            System.out.println("---------------------------------------------------------------------");
            List<Account> accounts3 = mapper.selectAll3();
            for (Account account : accounts3) {
                System.out.println(account);
            }
        }
    }
}
