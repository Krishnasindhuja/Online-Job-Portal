package services;

import java.util.ArrayList;
import java.util.List;
import beans.DomainBean;
import beans.JobBean;
import beans.RegistrationBean;
import daoInterfaces.AdminDao;

public class AdminService {

	AdminDao adminDao;
	
	public AdminDao getAdminDao() {
		return adminDao;
	}
	public void setAdminDao(AdminDao adminDao){
		this.adminDao = adminDao;
	}

	public ArrayList<RegistrationBean> viewUser() {
		return (ArrayList<RegistrationBean>)adminDao.viewUser();
	}

	public List<DomainBean> viewDomainTable(){
		return (List<DomainBean>)adminDao.viewDomainTable();
	}

	public List<JobBean> viewJobTable() {
		return (List<JobBean>)adminDao.viewJobTable();
	}

	public void addDomain(DomainBean domain) {
		adminDao.addDomain(domain);
	}

	public void addJob(JobBean job) {
		adminDao.addJob(job);
	}
}