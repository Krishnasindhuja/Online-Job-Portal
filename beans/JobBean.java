package beans;

public class JobBean {
	
	private int jobID;
	private String companyName;
	private int domainID;
	private String post;
	private String location;
	private String requiredQualification;
	private int requiredExperience;
	
	public JobBean() {
		super();
	}
	public int getJobID() {
		return jobID;
	}
	public void setJobID(int jobID) {
		this.jobID = jobID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getDomainID() {
		return domainID;
	}
	public void setDomainID(int domainID) {
		this.domainID = domainID;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getRequiredQualification() {
		return requiredQualification;
	}
	public void setRequiredQualification(String requiredQualification) {
		this.requiredQualification = requiredQualification;
	}
	public int getRequiredExperience() {
		return requiredExperience;
	}
	public void setRequiredExperience(int requiredExperience) {
		this.requiredExperience = requiredExperience;
	}
	
	
}
