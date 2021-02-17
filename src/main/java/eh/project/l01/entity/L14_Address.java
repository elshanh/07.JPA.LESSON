package eh.project.l01.entity;

import javax.persistence.Embeddable;

@Embeddable
public class L14_Address {
	
	private int postCode;
	private String street;
	private String district;
	private String city;
	
	public L14_Address() {

	}

	public L14_Address(int postCode, String street, String district, String city) {
		this.postCode = postCode;
		this.street = street;
		this.district = district;
		this.city = city;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	 
}
