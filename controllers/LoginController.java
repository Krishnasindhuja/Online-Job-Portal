package controllers;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import services.LoginService;
import beans.RegistrationBean;

public class LoginController extends SimpleFormController {
	
	LoginService service;
	
	public LoginService getService() {
		return service;
	}

	public void setService(LoginService service) {
		this.service = service;
	}

	public ModelAndView onSubmit(Object commandName) throws Exception{
		RegistrationBean login=(RegistrationBean)commandName;
		RegistrationBean bean=service.validateUser(login);
		if(login.getUserName().equals("Urvashi") && login.getPassword().equals("popo"))
			return new ModelAndView("adminPage");
		else if(bean.getUserName().equals(login.getUserName()) && bean.getPassword().equals(login.getPassword()))
			return new ModelAndView("jobSeekersPage");
		else 
			return new ModelAndView("invalidPage");
	}
}
