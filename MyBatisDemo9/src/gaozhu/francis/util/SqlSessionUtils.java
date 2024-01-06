 package gaozhu.francis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * MyBatis操作封装工具类
 *
 * @author FrancisGaozhu
 * 2023-11-30 13:57:31
 */
public class SqlSessionUtils {

    private SqlSessionUtils() {
    }

    /**
     * SQLSession工厂
     */
    private static SqlSessionFactory FACTORY;

    /**
     * 获取SQLSession工厂
     * @param newFactory 是否创建新的SqlSessionFactory
     * @return 工厂对象
     */
    public static SqlSessionFactory getSqlSessionFactory(boolean newFactory) {
        if (newFactory)
            FACTORY = null;
        if (FACTORY == null) {
            try (InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml")) {
                FACTORY = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return FACTORY;
    }

    /**
     * 获取数据库会话
     * @param newFactory 是否使用新的SQLSessionFactory
     * @param autoCommit 事务是否自动提交
     * @return SqlSession 会话对象
     */
    public static SqlSession getSqlSession(boolean newFactory, boolean autoCommit) {
        return getSqlSessionFactory(newFactory).openSession(autoCommit);
    }

    /**
     * 获取一个SqlSession，事务自动提交
     * @return SqlSession会话对象
     */
    public static SqlSession getSqlSession() {
        return getSqlSession(false, true);
    }
}
