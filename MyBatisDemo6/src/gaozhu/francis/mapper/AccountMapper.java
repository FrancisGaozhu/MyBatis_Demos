package gaozhu.francis.mapper;

import gaozhu.francis.pojo.Account;

import java.util.List;

/**
 * @author FrancisGaozhu
 * 2023-12-06 15:53:42
 */
public interface AccountMapper {

    /**
     * 获取全部账户信息
     * 采取命名别名的方式完成匹配内容
     * @return 结果信息集合
     */
    List<Account> selectAll1();

    /**
     * 获取全部账户信息
     * 采取自定义字段别名的方式完成匹配
     * @return 结果结合
     */
    List<Account> selectAll2();

    /**
     * 获取全部账户信息
     * 采取ResultMap的方式来实现
     * @return 结果集合
     */
    List<Account> selectAll3();
}
