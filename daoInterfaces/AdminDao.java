package daoInterfaces;

import java.util.List;

import beans.DomainBean;
import beans.JobBean;
import beans.RegistrationBean;

public interface AdminDao {

	public List<RegistrationBean> viewUser();
	public List<DomainBean> viewDomainTable();
	public List<JobBean> viewJobTable();
	public void addDomain(DomainBean domain);
	public void addJob(JobBean job);
}
