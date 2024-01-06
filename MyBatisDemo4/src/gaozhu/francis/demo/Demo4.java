package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 统一传入多个参数的情况展示
 * @author FrancisGaozhu
 * 2023-12-01 10:28:36
 */
public class Demo4 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            List<String> namesByIds = accountMapper.getNamesByIds("1, 2");
            for (String namesById : namesByIds) {
                System.out.println(namesById);
            }
        }
    }
}
