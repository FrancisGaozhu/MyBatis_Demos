package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import gaozhu.francis.pojo.Account;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * 传入一个字面量参数
 * 传入ID查询特定的一条数据
 * @author FrancisGaozhu
 * 2023-11-30 14:32:44
 */
public class Demo2 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            Account account = accountMapper.selectOneById(1);
            System.out.println(account);
        }
    }
}
