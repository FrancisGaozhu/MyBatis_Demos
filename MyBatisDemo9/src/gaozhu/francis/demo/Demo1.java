package gaozhu.francis.demo;

import gaozhu.francis.mapper.GoodsMapper;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author FrancisGaozhu
 * 2023-12-14 15:55:30
 */
public class Demo1 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);
            goodsMapper.selectAll();
            Thread.sleep(1000);
            goodsMapper.selectAll();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
