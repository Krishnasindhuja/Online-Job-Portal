package daoImplementation;

import java.util.List;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.HibernateTemplate;

import beans.DomainBean;
import beans.JobBean;
import beans.RegistrationBean;
import daoInterfaces.AdminDao;

public class AdminDaoImplementation implements AdminDao{

		HibernateTemplate template;
	
		public HibernateTemplate getTemplate(){
			return template;
		}

		public void setTemplate(HibernateTemplate template){
			System.out.println("in side setter for template:"+template);
			
			this.template = template;
		}

		public List<RegistrationBean> viewUser(){
		
			String hql = "FROM RegistrationBean";
			Query query = (Query)template.find(hql);
			List<RegistrationBean> userList= query.list();
			return userList;
		}
		
		public List<DomainBean> viewDomainTable(){
			String hql = "FROM DomainBean";
			System.out.println("IN ADMINDAOIMPL:"+template);
			Query query = (Query)template.find(hql);
			List<DomainBean> domainList= query.list();
			return domainList;
		}

		
		public List<JobBean> viewJobTable() {
			String hql = "FROM JobBean";
			Query query = (Query)template.find(hql);
			List<JobBean> jobList= query.list();
			return jobList;
		}

		
		public void addDomain(DomainBean domain) {
			template.save(domain);
		}

		
		public void addJob(JobBean job) {
			template.save(job);
		}

}

