package gaozhu.francis.mapper;

import gaozhu.francis.pojo.Account;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 账户数据库操作接口
 * @author FrancisGaozhu
 * 2023-11-30 17:00:17
 */
public interface AccountMapper {

    /**
     * 根据ID进行查询
     * @param id 账户ID
     * @return 数据结果模型
     */
    Account selectById(@Param("id") Integer id);

    /**
     * 根据ID进行数据查询家结果为map
     * @param id 账户ID
     * @return 结果封装为Map
     */
    Map<String, Object> selectOneByIdMap(@Param("id") Integer id);

    /**
     * 查询多条数据，结果为Map
     * @return 数据查询结果
     */
    List<Map<String, Object>> selectAllMap();

    /**
     * 查询多条数据，结果为Map
     * 指定id为key
     * @return 结果集合
     */
    @MapKey("a_id")
    Map<String, Object> selectAllMap2();

    /**
     * 获取所有的数据
     * @return 结果集合
     */
    List<Account> selectAll();

    /**
     * 获取记录数目
     * @return 记录数
     */
    int selectCount();


}
