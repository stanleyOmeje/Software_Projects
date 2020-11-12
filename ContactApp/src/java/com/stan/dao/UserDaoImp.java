/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.dao;

import com.stan.domain.User;
import com.stan.rm.UserRowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

/**
 *
 * @author IFM-COMPLIANCE
 */
@Repository
public class UserDaoImp extends BaseDAO implements UserDao{

    @Override
    public void save(User u) {
        String query = "insert into users(name, phone, email,address,loginName,password,role,loginStatus)"
                + " values(:name, :phone, :email, :address, :loginName, :password, :role, :loginStatus)";
        Map m = new HashMap();
        m.put("name", u.getName());
        m.put("phone", u.getPhone());
        m.put("email", u.getEmail());
        m.put("address", u.getAddress());
        m.put("loginName", u.getLoginName());
        m.put("password", u.getPassword());
        m.put("role", u.getRole());
        m.put("loginStatus", u.getLoginStatus());
        
        KeyHolder kh = new GeneratedKeyHolder();
        SqlParameterSource ps = new MapSqlParameterSource(m);
        super.getNamedParameterJdbcTemplate().update(query, ps, kh);
        Integer id = kh.getKey().intValue();
        u.setUserId(id);
    }
    
    
    @Override
    public void update(User u) {
        String query ="update users set "
                + "name=:name,"
                + " phone=:phone,"
                + " email=:email,"
                + "address=:address,"
                + "role=:role,"
                + "loginStatus=:loginStatus where "
                + "userid=:userid";
        
        Map m = new HashMap();
        m.put("name", u.getName());
        m.put("phone", u.getPhone());
        m.put("email", u.getEmail());
        m.put("address", u.getAddress()); 
        m.put("role", u.getRole());
        m.put("loginStatus", u.getLoginStatus());
        m.put("userid", u.getUserId());
        getNamedParameterJdbcTemplate().update(query,m);
    }

    @Override
    public void delete(Integer userId) {
        String query = "delete from users where userid=?";
        getJdbcTemplate().update(query, userId);
    }

    @Override
    public void delete(User u) {
        this.delete(u.getUserId());
    }

    @Override
    public User findById(Integer userId)
     {
        String query = "select userid, name, phone, email, address, loginName, role, loginStatus"
                + " FROM users WHERE userid=?";
        User u = getJdbcTemplate().queryForObject(query, new UserRowMapper(), userId);
        return u;
    }

    @Override
    public List<User> findAll() {
         String query = "select userid, name, phone, email, address, loginName, role, loginStatus"
                + " FROM users ";    
   return getJdbcTemplate().query(query, new UserRowMapper());
  }

    @Override
    public List<User> findProp(String propName, Object propVal) {
        String query = "select userid, name, phone, email, address, loginName, role, loginStatus"
                + " FROM users where "+propName+" =?";    
   return getJdbcTemplate().query(query, new UserRowMapper(), propVal);
    }
}
