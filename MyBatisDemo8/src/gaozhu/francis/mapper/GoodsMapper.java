package gaozhu.francis.mapper;

import gaozhu.francis.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author FrancisGaozhu
 * 2023-12-12 15:28:37
 */
public interface GoodsMapper {
    /**
     * 根据相似对象对应条件查询对应的数据结果
     * @param goods 相似对象
     * @return 结果集合
     */
    List<Goods> selectByCondition1(@Param("model") Goods goods);

    /**
     * 使用第二种方式 where标签，动态地组装WHERE关键字。
     * @param goods 相似对象
     * @return 结果集合
     */
    List<Goods> selectByCondition2(@Param("model") Goods goods);

    /**
     * 使用第三种方式 trim 标签
     * @param goods 相似对象
     * @return 结果集合
     */
    List<Goods> selectByCondition3(@Param("model") Goods goods);

    /**
     * 测试choose when otherwise
     * @param goods 相似对象
     * @return 结果集合
     */
    List<Goods> selectByCondition4(@Param("model") Goods goods);

    /**
     * 根据给出的ID查找多个信息
     * @param ids ID值数组
     * @return 结果集合
     */
    List<Goods> selectByIds1(@Param("ids") long...ids);

     /**
     * 根据给出的ID查找多个信息
     * @param ids ID值数组
     * @return 结果集合
     */
    List<Goods> selectByIds2(@Param("ids") long...ids);

    /**
     * 添加多个商品信息
     * @return 数据库受影响数据行数
     */
    int insertAll(@Param("goods") List<Goods> goods);

}
