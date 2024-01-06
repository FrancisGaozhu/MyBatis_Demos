package gaozhu.francis.demo;

import gaozhu.francis.mapper.TopicMapper;
import gaozhu.francis.pojo.Topic;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author FrancisGaozhu
 * 2023-12-07 20:11:38
 */
public class Demo1 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession()) {
            TopicMapper mapper = sqlSession.getMapper(TopicMapper.class);
            List<Topic> topics = mapper.selectTopicsWithAccount1();
            for (Topic topic : topics) {
                System.out.println(topic);
            }
        }
    }
}