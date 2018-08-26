package beans;

import java.util.Date;

public class PaymentBean {

	private int paymentID;
	private String emailID;
	private String ddNumber;
	private Date ddDate;
	private int ddAmount;
	private String bankName;
	private String bankBranch;

	public PaymentBean() {
		super();
	}
	public int getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getDdNumber() {
		return ddNumber;
	}
	public void setDdNumber(String ddNumber) {
		this.ddNumber = ddNumber;
	}
	public Date getDdDate() {
		return ddDate;
	}
	public void setDdDate(Date ddDate) {
		this.ddDate = ddDate;
	}
	public int getDdAmount() {
		return ddAmount;
	}
	public void setDdAmount(int ddAmount) {
		this.ddAmount = ddAmount;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
}
