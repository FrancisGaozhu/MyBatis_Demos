package gaozhu.francis.demo;

import gaozhu.francis.mapper.TopicMapper;
import gaozhu.francis.pojo.Topic;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 *
 * @author FrancisGaozhu
 * 2023-12-08 19:45:26
 */
public class Demo3 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            TopicMapper topicMapper = sqlSession.getMapper(TopicMapper.class);
            List<Topic> topics = topicMapper.selectTopicsWithAccount3();
            for (Topic topic : topics) {
                System.out.println(topic);
            }
        }
    }
}
