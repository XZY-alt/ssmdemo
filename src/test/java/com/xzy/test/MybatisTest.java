package com.xzy.test;

import com.xzy.dao.IUserDao;
import com.xzy.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Mybatis的入门案例
 */
public class MybatisTest {
    /**
     * 入门案例
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建sqlSessionFactory工厂。工厂内可能包含的信息——数据库配置文件、映射文件内容、对用接口的信息
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        System.out.println("运行到此处");
        SqlSessionFactory factory=builder.build(in);
        //3.使用sqlSessionFactory工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用Sqlsession创建Dao接口代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for(User user : users){
            System.out.println(user);
        }
        //6.释放资源
        session.close();
        in.close();
    }
}
