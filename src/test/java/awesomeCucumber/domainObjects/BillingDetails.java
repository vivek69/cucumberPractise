package awesomeCucumber.domainObjects;

public class BillingDetails {
	public BillingDetails(String billingFirstName, String billingLastName, String billingAddress,
			String billingCity,String billingZip, String billingEmail) {
		super();
		this.billingFirstName = billingFirstName;
		this.billingLastName = billingLastName;
		this.billingAddress = billingAddress;
		this.billingCity = billingCity;
		this.billingZip = billingZip;
		this.billingEmail = billingEmail;
	}
	private String billingFirstName;
	private String billingLastName;
	private String billingAddress;
	private String billingCity;
	private String billingZip;
	private String billingEmail;
	public String getBillingFirstName() {
		return billingFirstName;
	}
	public void setBillingFirstName(String billingFirstName) {
		this.billingFirstName = billingFirstName;
	}
	public String getBillingLastName() {
		return billingLastName;
	}
	public void setBillingLastName(String billingLastName) {
		this.billingLastName = billingLastName;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getBillingCity() {
		return billingCity;
	}
	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}
	public String getBillingZip() {
		return billingZip;
	}
	public void setBillingZip(String billingZip) {
		this.billingZip = billingZip;
	}
	public String getBillingEmail() {
		return billingEmail;
	}
	public void setBillingEmail(String billingEmail) {
		this.billingEmail = billingEmail;
	}
}
