package daoImplementation;

import java.util.List;
import java.util.Random;
import org.springframework.orm.hibernate3.HibernateTemplate;
import beans.DomainBean;
import beans.PaymentBean;
import beans.RegistrationBean;
import beans.UserDomainJobBean;
import daoInterfaces.RegistrationDao;

public class RegistrationDaoImplementation implements RegistrationDao{

		HibernateTemplate template;
	
		public HibernateTemplate getTemplate(){
			return template;
		}

		public void setTemplate(HibernateTemplate template){
			this.template = template;
		}

		public void registerUser(RegistrationBean register,PaymentBean payment, String[] domainName){
			
			template.save(register);
			template.save(payment);
			
			for(int i=0;i<domainName.length;i++){
			List<DomainBean> list =(List<DomainBean>)template.find(" from DomainBean where domainName = '"+domainName[i]+"'");
				
			UserDomainJobBean bean=new UserDomainJobBean();
			
			bean.setDomainID(list.get(i).getDomainID());
			bean.setEmailID(register.getEmailID());
			
			template.save(bean);	
			}
			
			register.setUserName(generateUserName(register));
			register.setPassword(generatePassword(register));
			template.save(register);
			
		}
		
		private String generateUserName(RegistrationBean register){
			int dd=register.getDateOfBirth().getDate();
			int mm=register.getDateOfBirth().getMonth();
			Random random = new Random();
			int randomNumber = random.nextInt(99999 - 10000) + 10000;
			
			String userName= ""+dd+""+mm+""+""+randomNumber+"";
			
			return userName;
		}
		
		private String generatePassword(RegistrationBean register){
			String reverse=new StringBuffer(register.getFirstName()).reverse().toString();
			return reverse;
		}
		
		
}

