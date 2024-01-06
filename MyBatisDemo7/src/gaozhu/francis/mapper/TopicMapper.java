package gaozhu.francis.mapper;

import gaozhu.francis.pojo.Topic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author FrancisGaozhu
 * 2023-12-07 19:58:10
 */
public interface TopicMapper {

    List<Topic> selectTopicsWithAccount1();


    List<Topic> selectTopicsWithAccount2();


    List<Topic> selectTopicsWithAccount3();

    List<Topic> selectByAccountId(@Param("accountId") Long accountId);


}
