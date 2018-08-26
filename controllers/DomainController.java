package controllers;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import services.AdminService;
import beans.DomainBean;

public class DomainController implements Controller {
	
	AdminService service;
	
	public AdminService getService() {
		return service;
	}

	public void setService(AdminService service) {
		this.service = service;
	}

	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("onSubmit of domainController");
		List<DomainBean> domainList= service.viewDomainTable();
		System.out.println("onSubmit of domainController...........");
		return new ModelAndView("register","domainList",domainList);
	}
}
