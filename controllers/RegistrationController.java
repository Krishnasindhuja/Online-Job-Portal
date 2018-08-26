package controllers;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import beans.PaymentBean;
import beans.RegistrationBean;
import services.RegistrationService;

public class RegistrationController implements Controller {
	
	RegistrationService service;
	RegistrationBean registerBean;
	PaymentBean payBean;
	
	public RegistrationService getService() {
		return service;
	}

	public void setService(RegistrationService service) {
		this.service = service;
	}

	public RegistrationBean getRegisterBean() {
		return registerBean;
	}

	public void setRegisterBean(RegistrationBean registerBean) {
		this.registerBean = registerBean;
	}

	public PaymentBean getPayBean() {
		return payBean;
	}

	public void setPayBean(PaymentBean payBean) {
		this.payBean = payBean;
	}

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		registerBean.setFirstName(request.getParameter("firstName"));
		registerBean.setLastName(request.getParameter("lastName"));
		registerBean.setDateOfBirth(df.parse(request.getParameter("dateOfBirth")));
		registerBean.setContactNumber(Long.parseLong(request.getParameter("contactNumber")));
		registerBean.setEmailID(request.getParameter("emailID"));
		registerBean.setAcademicQualification(request.getParameter("academicQualification"));
		registerBean.setPercentage(Float.parseFloat(request.getParameter("percentage")));
		registerBean.setExperience(Integer.parseInt(request.getParameter("experience")));
		registerBean.setSkillSet(request.getParameter("skillSet"));
		registerBean.setRegistrationDuration(Integer.parseInt(request.getParameter("registrationDuration")));
		
		payBean.setDdDate(df.parse(request.getParameter("ddDate")));
		payBean.setDdNumber(request.getParameter("ddNumber"));
		payBean.setDdAmount(Integer.parseInt(request.getParameter("ddAmount")));
		payBean.setBankName(request.getParameter("bankName"));
		payBean.setBankBranch(request.getParameter("bankBranch"));
	
		String[] domainName = request.getParameterValues("domainName");

		service.registerUser(registerBean, payBean,domainName);
		
		return new ModelAndView("registrationSuccessPage");
	}

}
