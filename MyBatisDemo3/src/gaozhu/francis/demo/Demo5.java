package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

/**
 * 多条数据的查询结果为Map
 * @author FrancisGaozhu
 * 2023-11-30 18:49:23
 */
public class Demo5 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            List<Map<String, Object>> maps = accountMapper.selectAllMap();
            for (Map<String, Object> map : maps) {
                for (Map.Entry<String, Object> stringObjectEntry : map.entrySet()) {
                    System.out.println(stringObjectEntry);
                }
                System.out.println("-----------------------------------");
            }
        }
    }
}
