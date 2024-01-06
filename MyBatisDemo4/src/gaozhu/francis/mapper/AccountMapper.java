package gaozhu.francis.mapper;

import gaozhu.francis.pojo.Account;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author FrancisGaozhu
 * 2023-11-30 19:38:30
 */
public interface AccountMapper {

    /**
     * 以名字模糊查询数据(方案1)
     * @param partOfName 名字的一部分
     * @return 结果
     */
    List<Account> selectByPartOfName1(@Param("partOfName") String partOfName);

    /**
     * 执行模糊查询(方案2)
     * @param partOfName 名字的一部分
     * @return 结果
     */
    List<Account> selectByPartOfName2(@Param("partOfName") String partOfName);

    /**
     * 执行模糊查询（方案3）
     * @param partOfName 名字的一部分
     * @return 结果
     */
    List<Account> selectByPartOfName3(@Param("partOfName") String partOfName);

    /**
     * 根据ID获取特定账户名称
     * @param ids id
     * @return 名称集合
     */
    List<String> getNamesByIds(@Param("ids") String ids);

    /**
     * 根据特定表名称查找所有的数据
     * @return Map结果
     */
    @MapKey("a_id")
    List<Account> getAllDataFromTable(@Param("tableName") String tableName);
}
