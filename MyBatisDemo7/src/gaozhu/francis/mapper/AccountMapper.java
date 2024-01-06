package gaozhu.francis.mapper;

import gaozhu.francis.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author FrancisGaozhu
 * 2023-12-09 14:48:56
 */
public interface AccountMapper {

    /**
     * 根据ID查询对应的账户信息
     * @param id 账户ID
     * @return 账户结果模型
     */
    Account selectById(@Param("accountId") Long id);

    /**
     * 获取素有的账户信息，同时获取对应的所有帖子
     * @return 账户集合
     */
    List<Account> selectAllWithTopics1();

    /**
     * 通过分步查询的方式获取所有的账户信息和对应的帖子信息
     * @return 账户集合
     */
    List<Account> selectAllWithTopics2();

}
