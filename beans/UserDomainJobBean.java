package beans;

public class UserDomainJobBean {

	private int udjID;
	private String emailID;
	private int domainID;
	private int jobID;
	
	public UserDomainJobBean() {
		super();
	}

	public int getUdjID() {
		return udjID;
	}

	public void setUdjID(int udjID) {
		this.udjID = udjID;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public int getDomainID() {
		return domainID;
	}

	public void setDomainID(int domainID) {
		this.domainID = domainID;
	}

	public int getJobID() {
		return jobID;
	}

	public void setJobID(int jobID) {
		this.jobID = jobID;
	}
}
