package com.im.project.service;

import com.im.project.model.User;

public interface UserService {
	/**
	 * 
	 * 
	 * @param user
	 * @return 影响的条数
	 */
	public int save(User user);
	

}
