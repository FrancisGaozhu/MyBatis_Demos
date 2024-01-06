package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import gaozhu.francis.pojo.Account;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.time.LocalDateTime;

/**
 * 传递的参数为实体类类型的
 * @author FrancisGaozhu
 * 2023-11-30 15:34:28
 */
public class Demo5 {
    public static void main(String[] args) {
        Account newAccount = new Account(
                null,
                "高翥",
                "gaozhu",
                31,
                '男',
                "18846457728",
                LocalDateTime.of(1992, 4, 27, 9, 12)
        );
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            int i = accountMapper.insertOne(newAccount);
            System.out.println(i);
        }
    }
}
