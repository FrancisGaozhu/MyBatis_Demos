package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import gaozhu.francis.pojo.Account;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;

/**
 * 参数为Map的情况
 * @author FrancisGaozhu
 * 2023-11-30 15:28:25
 */
public class Demo4 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("userName", "小红");
        map.put("password", "xiaohong");
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            Account account = accountMapper.selectOneByUserNameAndUserPassword2(map);
            System.out.println(account);
        }
    }
}
