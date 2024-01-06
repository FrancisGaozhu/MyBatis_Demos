package gaozhu.francis.demo;

import gaozhu.francis.mapper.GoodsMapper;
import gaozhu.francis.pojo.Goods;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 数据批量添加的测试
 * @author FrancisGaozhu
 * 2023-12-14 14:40:41
 */
public class Demo7 {
    public static void main(String[] args) {
        List<Goods> newGoods = new ArrayList<>();
        newGoods.add(new Goods("小熊饼干", new BigDecimal("3.25"), "华丰", LocalDate.of(2023, 12, 1), "2年"));
        newGoods.add(new Goods("旺仔小馒头", new BigDecimal("12.5"), "旺仔", LocalDate.of(2023, 12, 1), "2年"));
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);
            int count = goodsMapper.insertAll(newGoods);
            System.out.println(count);
        }
    }
}
