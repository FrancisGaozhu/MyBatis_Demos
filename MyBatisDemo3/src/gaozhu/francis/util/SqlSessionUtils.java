package gaozhu.francis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * MyBatis操作封装工具类
 * @author FrancisGaozhu
 * 2023-11-30 13:57:31
 */
public class SqlSessionUtils {

    private SqlSessionUtils() {
    }

    /**
     * 获取数据库会话
     * @return SqlSession 会话对象
     */
    public static SqlSession getSqlSession() {
        try (InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml")) {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            return sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
