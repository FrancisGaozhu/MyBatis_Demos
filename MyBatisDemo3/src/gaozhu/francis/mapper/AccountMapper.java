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
     * 查询结果为一条数据，对应一个对象，因此我们返回值直接定义为对应对象的所属类类型即可。
     *
     * @param id 账户ID
     * @return 数据结果模型
     */
    Account selectById(@Param("id") Integer id);

    /**
     * 获取所有的数据
     * 获取多条数据的时候，数据结果为多条，因此需要封装为多个对象，则使用List集合就OK。
     *
     * @return 结果集合
     */
    List<Account> selectAll();

    /**
     * 获取记录数目
     * 结果内容为一个标量值。
     *
     * @return 记录数
     */
    int selectCount();

    /**
     * 根据ID进行数据查询家结果为map
     * 结果为1条数据，要求封装为Map形式。
     * @param id 账户ID
     * @return 结果封装为Map
     */
    Map<String, Object> selectOneByIdMap(@Param("id") Integer id);

    /**
     * 查询多条数据，结果为Map
     * 那么就再套一层List即可
     * @return 数据查询结果
     */
    List<Map<String, Object>> selectAllMap();

    /**
     * 查询多条数据，结果为Map
     * 指定key采取的字段值，则使用下面的注解即可。
     * @return 结果集合
     */
    @MapKey("a_id")
    Map<String, Object> selectAllMap2();
}
