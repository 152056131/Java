package com.itdr.utils;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @作者：AirZhang
 * @日期：2019/2/18
 * @用知识武装头脑
 */
public class JDBCUtil2 {

    //创建私有静态变量接收参数
    private static String drivers;
    private static String url;
    private static String user;
    private static String password;
    private static Connection con;

    //通过静态代码块，在类加载的时候加载
    static {
        //创建properties对象读取配置文件中的数据
        Properties pe = new Properties();
        //通过获取到项目中文件的输入字节流，完成文件加载
        InputStream in = JDBCUtil2.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            //加载文件到properties对象
            pe.load(in);
            //调用properties对象的方法，通过键获取到对应的值
            drivers = pe.getProperty("driver");
            url = pe.getProperty("url");
            user = pe.getProperty("user");
            password = pe.getProperty("password");
            //驱动加载
            Class.forName(drivers);
            //创建连接
            con = DriverManager.getConnection(url,user,password);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    获取连接的方法
    public static Connection getCon() throws Exception {
        return con;
    }

    //    关闭资源的方法
    public static void closeAll(Connection con, PreparedStatement ps, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void closeAll(Connection con, PreparedStatement ps) {

        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void closeAll(Connection con, Statement ps, ResultSet rs) {

    }
}
