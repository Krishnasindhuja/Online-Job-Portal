package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import beans.DomainBean;
import beans.JobBean;
import beans.RegistrationBean;
import services.AdminService;

public class AdminController extends MultiActionController{

	AdminService service;
	DomainBean domainBean;
	JobBean jobBean;
	
	public DomainBean getDomainBean() {
		return domainBean;
	}

	public void setDomainBean(DomainBean domainBean) {
		this.domainBean = domainBean;
	}

	public JobBean getJobBean() {
		return jobBean;
	}

	public void setJobBean(JobBean jobBean) {
		this.jobBean = jobBean;
	}

	public AdminService getService() {
		return service;
	}

	public void setService(AdminService service) {
		this.service = service;
	}
	
	public ModelAndView display1(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ArrayList<RegistrationBean> userList=service.viewUser();
		ModelAndView model = new ModelAndView(); 
		model.addObject(userList);
		return new ModelAndView("viewUsers", "userList",userList);
	}

	
	public ModelAndView display2(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ArrayList<JobBean> jobList=(ArrayList<JobBean>)service.viewJobTable();
		ModelAndView model = new ModelAndView(); 
		model.addObject(jobList);
		
		jobBean.setCompanyName(request.getParameter("companyName"));
		jobBean.setPost(request.getParameter("post"));
		jobBean.setRequiredQualification(request.getParameter("requiredQualification"));
		jobBean.setRequiredExperience(Integer.parseInt(request.getParameter("workEx")));
		jobBean.setLocation(request.getParameter("workLocation"));
		
		service.addJob(jobBean);
		return new ModelAndView("uploadJob", "msg","display3() method");
	}

	public ModelAndView display3(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		domainBean.setDomainName(request.getParameter("enterDomain"));
		service.addDomain(domainBean);
		return new ModelAndView("addDomain", "msg","display4() method");
	}
	
}
