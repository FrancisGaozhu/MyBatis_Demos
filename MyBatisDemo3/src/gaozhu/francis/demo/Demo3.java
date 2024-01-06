package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * 单行单列标量值的结果获取
 * @author FrancisGaozhu
 * 2023-11-30 18:10:28
 */
public class Demo3 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            Integer i = accountMapper.selectCount();
            System.out.println(i);
        }
    }
}
