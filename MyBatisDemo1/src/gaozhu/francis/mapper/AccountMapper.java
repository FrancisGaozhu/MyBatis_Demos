package gaozhu.francis.mapper;

import gaozhu.francis.pojo.Account;

import java.util.List;

/**
 *
 * @author FrancisGaozhu
 * 2023-11-29 22:22:25
 */
public interface AccountMapper {


    List<Account> select();

    int insert();

    int delete();

    int update();

}
