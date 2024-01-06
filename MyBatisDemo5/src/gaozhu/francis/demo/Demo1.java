package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import gaozhu.francis.pojo.Account;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.time.LocalDateTime;

/**
 *
 * @author FrancisGaozhu
 * 2023-12-04 15:17:35
 */
public class Demo1 {
    public static void main(String[] args) {
        Account newAccount1 = new Account(null, "老张", "1111", 60, '男', "17622222222", LocalDateTime.of(1968, 1, 1, 1, 1, 1)),
                newAccount2 = new Account(null, "老李", "2222", 50, '女', "00000000000", LocalDateTime.of(1970, 1, 1, 1, 1, 1));
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
            int rowCount;

            rowCount = mapper.insertNewAccountGetId(newAccount1);
            if (rowCount > 0) {
                System.out.println("第一个自增ID：" + newAccount1.getId());
            }

            rowCount = mapper.insertNewAccountGetId(newAccount2);
            if (rowCount > 0) {
                System.out.println("第二个自增ID：" + newAccount2.getId());
            }
        }
    }
}
