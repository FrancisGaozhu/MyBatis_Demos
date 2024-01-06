package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import gaozhu.francis.pojo.Account;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * 多个字面量传递参数传递
 * @author FrancisGaozhu
 * 2023-11-30 15:15:57
 */
public class Demo3 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            Account account = accountMapper.selectOneByUserNameAndUserPassword1("小红", "xiaohong");
            System.out.println(account);
        }
    }
}
