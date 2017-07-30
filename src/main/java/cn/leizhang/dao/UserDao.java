package cn.leizhang.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cn.leizhang.domain.User;
@Repository
public class UserDao {
	@Autowired
    private  JdbcTemplate jdbcTemplate;
	public  User selectUserById(Integer id) {
		String sql="select * from user where id=?";
		RowMapper<User> rowMapper=new BeanPropertyRowMapper<User>(User.class);
		User user=jdbcTemplate.queryForObject(sql, rowMapper,id);
		return user;
	}

}
