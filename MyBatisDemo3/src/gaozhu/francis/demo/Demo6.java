package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.Map;

/**
 * 获取多条数据，结果为Map
 * 指定Key
 * @author FrancisGaozhu
 * 2023-11-30 19:06:44
 */
public class Demo6 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            Map<String, Object> map = accountMapper.selectAllMap2();
            for (Map.Entry<String, Object> stringObjectEntry : map.entrySet()) {
                System.out.println(stringObjectEntry);
            }
        }
    }
}
