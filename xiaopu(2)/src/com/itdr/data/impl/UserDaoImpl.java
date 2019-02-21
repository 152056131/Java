package com.itdr.data.impl;

import com.itdr.data.UserData;
import com.itdr.domain.User;
import com.itdr.utils.JDBCUtil2;
import sun.security.x509.URIName;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @作者：AirZhang
 * @日期：2019/2/18
 * @用知识武装头脑
 */
public class UserDaoImpl implements UserData {
    @Override
    public boolean add(User u) {
        return false;
    }

    @Override
    public void deleteOne(String uname) {

    }

    @Override
    public void changeOne(String uanme) {

    }

    @Override
    public boolean selectOne(String uanme) {
        return false;
    }

    @Override
    public User selectOneUser(String uanme) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u = null;
        try {
            con = JDBCUtil2.getCon();
            String sql = "select * from user where uname = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1,uanme);
            rs = ps.executeQuery();
            while (rs.next()){
                u = new User();
                u.setUname(rs.getString("uname"));
                u.setUpassword(rs.getString("password"));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }

    @Override
    public void selectAll() {

    }
}
