package beans;

import java.util.Date;

public class RegistrationBean 
{
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private Long contactNumber;
	private String emailID;
	private String academicQualification;
	private Float percentage;
	private int experience;
	private String skillSet;
	private int registrationDuration;
	private String userName;
	private String password;
	
	public RegistrationBean() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getAcademicQualification() {
		return academicQualification;
	}
	public void setAcademicQualification(String academicQualification) {
		this.academicQualification = academicQualification;
	}
	public Float getPercentage() {
		return percentage;
	}
	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	public int getRegistrationDuration() {
		return registrationDuration;
	}
	public void setRegistrationDuration(int registrationDuration) {
		this.registrationDuration = registrationDuration;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
