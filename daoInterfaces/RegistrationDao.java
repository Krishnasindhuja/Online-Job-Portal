package daoInterfaces;

import beans.PaymentBean;
import beans.RegistrationBean;

public interface RegistrationDao {

	public void registerUser(RegistrationBean register, PaymentBean payment, String[] domainName);
}
