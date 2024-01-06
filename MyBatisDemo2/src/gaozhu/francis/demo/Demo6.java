package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import gaozhu.francis.pojo.Account;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * 命名参数
 * @author FrancisGaozhu
 * 2023-11-30 15:55:07
 */
public class Demo6 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            Account account = accountMapper.selectOneByUserNameAndUserPassword3("小红", "xiaohong");
            System.out.println(account);
        }
    }
}
