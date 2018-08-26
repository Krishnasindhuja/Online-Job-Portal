package daoImplementation;

import org.springframework.orm.hibernate3.HibernateTemplate;

import beans.RegistrationBean;
import daoInterfaces.LoginDao;

public class LoginDaoImplementation implements LoginDao{

		HibernateTemplate template;
	
		public HibernateTemplate getTemplate(){
			return template;
		}

		public void setTemplate(HibernateTemplate template){
			this.template = template;
		}

		public RegistrationBean validateUser(RegistrationBean login){
			RegistrationBean bean=(RegistrationBean)template.get(RegistrationBean.class,login.getUserName());
			return bean;
		}

	

	

}

