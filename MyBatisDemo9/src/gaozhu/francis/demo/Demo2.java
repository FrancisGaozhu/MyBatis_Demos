package gaozhu.francis.demo;

import gaozhu.francis.mapper.GoodsMapper;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * 这里分别使用了两个不同的SQLSession来执行同一个内容，发现实际上执行了两次SQL，一级缓存失效。
 * @author FrancisGaozhu
 * 2023-12-15 15:38:33
 */
public class Demo2 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);
            goodsMapper.selectAll();
        }
         try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);
            goodsMapper.selectAll();
        }
    }
}
