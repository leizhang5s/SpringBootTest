package cn.leizhang.service;

import org.springframework.stereotype.Service;

import cn.leizhang.domain.User;

public interface UserService {
	public User selectUserById(Integer id);
	
}
