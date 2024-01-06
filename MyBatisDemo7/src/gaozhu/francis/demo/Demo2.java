package gaozhu.francis.demo;

import gaozhu.francis.mapper.TopicMapper;
import gaozhu.francis.pojo.Topic;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 处理多对一的问题方法2
 * @author FrancisGaozhu
 * 2023-12-08 17:55:16
 */
public class Demo2 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            TopicMapper topicMapper = sqlSession.getMapper(TopicMapper.class);
            List<Topic> topics = topicMapper.selectTopicsWithAccount2();
            for (Topic topic : topics) {
                System.out.println(topic);
            }
        }
    }
}
