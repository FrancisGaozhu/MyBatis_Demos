package gaozhu.francis.demo;

import gaozhu.francis.mapper.GoodsMapper;
import gaozhu.francis.pojo.Goods;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author FrancisGaozhu
 * 2023-12-12 15:29:04
 */
public class Demo3 {
    public static void main(String[] args) {
        Goods model = new Goods();
        model.setId(1L);
        model.setBrand("旺旺");
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);
            List<Goods> goodsList = goodsMapper.selectByCondition3(model);
            for (Goods goods : goodsList) {
                System.out.println(goods);
            }
        }
    }
}
