package eh.project.l01.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "L18_ADDRESS")
public class L18_Address {
	
	@Id
	@Column(name = "ID",unique = true,nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	
	@Column(name = "STREET")
	private String addressStreet;
	
	@Column(name = "STREET_NUMBER")
	private int addressStreetNumber;
	
	@Column(name = "DISTRICT")
	private String addressDistrict;
	
	@Column(name = "CITY")
	private String addressCity;
	
	@Column(name = "POST_CODE")
	private int addressPostCode;
	
	public L18_Address() {

	}

	public L18_Address(String addressStreet, int addressStreetNumber, String addressDistrict, String addressCity,int addressPostCode) {
		this.addressStreet = addressStreet;
		this.addressStreetNumber = addressStreetNumber;
		this.addressDistrict = addressDistrict;
		this.addressCity = addressCity;
		this.addressPostCode = addressPostCode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressStreet() {
		return addressStreet;
	}

	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}

	public int getAddressStreetNumber() {
		return addressStreetNumber;
	}

	public void setAddressStreetNumber(int addressStreetNumber) {
		this.addressStreetNumber = addressStreetNumber;
	}

	public String getAddressDistrict() {
		return addressDistrict;
	}

	public void setAddressDistrict(String addressDistrict) {
		this.addressDistrict = addressDistrict;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public int getAddressPostCode() {
		return addressPostCode;
	}

	public void setAddressPostCode(int addressPostCode) {
		this.addressPostCode = addressPostCode;
	}
	
	

}
