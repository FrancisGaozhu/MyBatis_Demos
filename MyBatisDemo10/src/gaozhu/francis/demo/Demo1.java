package gaozhu.francis.demo;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import gaozhu.francis.mapper.GoodsMapper;
import gaozhu.francis.pojo.Goods;
import gaozhu.francis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author FrancisGaozhu
 * 2023-12-15 20:02:19
 */
public class Demo1 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = SqlSessionUtils.getSqlSession();
             Page<Goods> goods = PageHelper.startPage(2, 5);) {
            GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);
            goodsMapper.selectAll();
            PageInfo<Goods> pageInfo = new PageInfo<>(goods);
            for (Goods g : goods) {
                System.out.println(g);
            }
            System.out.println(pageInfo);
        }
    }
}
