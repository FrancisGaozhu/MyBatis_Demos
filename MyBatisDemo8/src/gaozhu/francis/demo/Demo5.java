package gaozhu.francis.demo;

import gaozhu.francis.mapper.GoodsMapper;
import gaozhu.francis.pojo.Goods;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author FrancisGaozhu
 * 2023-12-12 19:22:32
 */
public class Demo5 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);
            List<Goods> goodsList = goodsMapper.selectByIds1(1, 2);
            for (Goods goods : goodsList) {
                System.out.println(goods);
            }
        }
    }
}
