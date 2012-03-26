#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.businesslogic.impl;

import ${package}.persistence.dao.IUserDao;
import ${package}.persistence.entity.User;
import ${package}.service.businesslogic.ILoginService;
import org.ploin.utils.service.ISecureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class LoginService implements ILoginService{

	private ISecureService secureService;
	private IUserDao userDao;


	@Transactional
	public User getByLoginInformation(final String username, final String password) {
		String pass = secureService.generateDigest(password, null);
		User user = userDao.getByLoginInformation(username, pass);
		return user;		
	}

	
	@Autowired
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Autowired
	public void setSecureService(ISecureService secureService) {
		this.secureService = secureService;
	}

}