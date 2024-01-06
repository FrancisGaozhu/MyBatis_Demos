package gaozhu.francis.mapper;

import gaozhu.francis.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 账户数据操作层
 * @author FrancisGaozhu
 * 2023-11-29 22:57:06
 */
public interface AccountMapper {

    /**
     * 查询所有账户信息
     * @return 账户信息集合
     */
    List<Account> selectAll();

    /**
     * 根据ID获取对应的账户信息
     * @param id 账户ID
     * @return 账户信息
     */
    Account selectOneById(Integer id);

    /**
     * 根据用户名和密码查询特定账户信息
     * @param userName 账户名称
     * @param password 账户密码
     * @return 账户结果模型
     */
    Account selectOneByUserNameAndUserPassword1(String userName, String password);

    /**
     * 根据用户名和密码查询对应的账户信息
     * @param params 用户名和密码集合
     * @return 账户信息模型
     */
    Account selectOneByUserNameAndUserPassword2(Map<String, Object> params);

    /**
     * 根据对象信息模型添加对应的数据
     * @param account 对象数据模型
     * @return 数据库受影响数据行数
     */
    int insertOne(Account account);

    /**
     * 命名参数
     * @param userName 用户名
     * @param password 密码
     * @return 账户信息结果模型
     */
    Account selectOneByUserNameAndUserPassword3(@Param("userName") String userName, @Param("password") String password);
}
