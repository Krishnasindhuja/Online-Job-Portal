package services;

import beans.RegistrationBean;
import daoInterfaces.LoginDao;

public class LoginService 
{
LoginDao loginDao;
	
	public LoginDao getLoginDao() {
		return loginDao;
	}
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	public RegistrationBean validateUser(RegistrationBean login) {
		
		return loginDao.validateUser(login);
	}

}
