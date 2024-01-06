package gaozhu.francis.demo;

import gaozhu.francis.mapper.GoodsMapper;
import gaozhu.francis.pojo.Goods;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author FrancisGaozhu
 * 2023-12-15 15:43:36
 */
public class Demo3 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);
            Goods goods = goodsMapper.selectAll().get(0);
            goods.setName("罐头");
            goodsMapper.update(goods);
            goodsMapper.selectAll();
        }
    }
}
