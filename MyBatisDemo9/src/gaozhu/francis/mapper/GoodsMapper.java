package gaozhu.francis.mapper;

import gaozhu.francis.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author FrancisGaozhu
 * 2023-12-14 15:52:48
 */
public interface GoodsMapper {

    /**
     * 查询所有商品信息
     * @return 商品信息集合
     */
    List<Goods> selectAll();

    /**
     * 更新商品数据
     * @param goods 商品数据模型
     * @return 受影响数据行数
     */
    int update(Goods goods);

    /**
     * 通过ID查找对应的商品信息
     * @param id 需要查找的商品ID
     * @return 找到的对象
     */
    Goods selectById(@Param("id") Long id);

}
