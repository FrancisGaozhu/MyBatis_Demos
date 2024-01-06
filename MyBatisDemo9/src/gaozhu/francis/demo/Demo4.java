package gaozhu.francis.demo;

import gaozhu.francis.mapper.GoodsMapper;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author FrancisGaozhu
 * 2023-12-15 15:50:15
 */
public class Demo4 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);
            goodsMapper.selectById(0L);
            goodsMapper.selectById(1L);
        }
    }
}
