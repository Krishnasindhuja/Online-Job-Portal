package services;

import beans.PaymentBean;
import beans.RegistrationBean;
import daoInterfaces.RegistrationDao;

public class RegistrationService 
{
	RegistrationDao registrationDao;
	
	public RegistrationDao getRegistrationDao() {
		return registrationDao;
	}
	public void setRegistrationDao(RegistrationDao registrationDao) {
		this.registrationDao = registrationDao;
	}

	public void registerUser(RegistrationBean register,PaymentBean payment, String[] domainName) {
		System.out.println("IN REGISTRATION SERVICE...");
		registrationDao.registerUser(register,payment, domainName);
	}

}
