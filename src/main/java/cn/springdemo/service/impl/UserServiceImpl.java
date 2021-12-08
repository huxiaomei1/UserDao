package cn.springdemo.service.impl;

import cn.springdemo.dao.UserDao;
import cn.springdemo.dao.impl.UserDaoImpl;
import cn.springdemo.entity.User;
import cn.springdemo.service.UserService;

/**
 * 用户业务类，实现对User功能的业务管理
 */
public class UserServiceImpl implements UserService {

	// 声明接口类型的引用，和具体实现类解耦合
	private UserDao dao;
	private Integer i ;

	// cn.springdemo.dao 属性的setter访问器，会被Spring调用，实现设值注入


	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public UserServiceImpl() {
	}

	public UserServiceImpl(UserDao dao) {
		this.dao = dao;
	}

	public UserServiceImpl(UserDao dao, Integer i) {
		this.dao = dao;
		this.i = i;
	}

	public void addNewUser(User user) {
		// 调用用户DAO的方法保存用户信息
		dao.save(user);
	}

}