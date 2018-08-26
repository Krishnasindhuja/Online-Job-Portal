package daoInterfaces;

import beans.RegistrationBean;

public interface LoginDao {

	RegistrationBean validateUser(RegistrationBean login);
}
