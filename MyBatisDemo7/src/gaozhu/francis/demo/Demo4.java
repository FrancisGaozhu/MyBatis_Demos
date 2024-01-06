package gaozhu.francis.demo;

import gaozhu.francis.mapper.TopicMapper;
import gaozhu.francis.pojo.Topic;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author FrancisGaozhu
 * 2023-12-09 15:38:00
 */
public class Demo4 {
    public static void main(String[] args) {
        List<Topic> topics;
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            TopicMapper topicMapper = sqlSession.getMapper(TopicMapper.class);
            topics = topicMapper.selectTopicsWithAccount3();
            System.out.println(topics.get(1).getTitle());
        }
        System.out.println(topics.get(0).getAccount().getUserName());
    }
}
