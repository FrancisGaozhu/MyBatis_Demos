package gaozhu.francis.mapper;

import gaozhu.francis.pojo.Goods;

import java.util.List;

/**
 * @author FrancisGaozhu
 * 2023-12-15 19:58:23
 */
public interface GoodsMapper {

    /**
     * 获取所有的商品信息
     * @return 商品数据集合
     */
    List<Goods> selectAll();

}
