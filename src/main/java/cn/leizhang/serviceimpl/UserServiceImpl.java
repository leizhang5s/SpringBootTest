package cn.leizhang.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.leizhang.dao.UserDao;
import cn.leizhang.domain.User;
import cn.leizhang.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public User selectUserById(Integer id) {
		
		 return userDao.selectUserById(id);
	}

	
			
}
