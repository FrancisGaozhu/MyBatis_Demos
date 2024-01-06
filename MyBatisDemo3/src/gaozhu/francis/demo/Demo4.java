package gaozhu.francis.demo;

import gaozhu.francis.mapper.AccountMapper;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.Map;

/**
 * 1条数据结果为Map集合
 * @author FrancisGaozhu
 * 2023-11-30 18:35:59
 */
public class Demo4 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            Map<String, Object> map = accountMapper.selectOneByIdMap(1);
            for (Map.Entry<String, Object> stringObjectEntry : map.entrySet()) {
                System.out.println(stringObjectEntry);
            }
        }
    }
}
