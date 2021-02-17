package eh.project.l01.entity;

import javax.persistence.Embeddable;

@Embeddable
public class L10_Contact {
	
	private String contactPhoneNumber;
	private String contactEmail;
	private String contactLink;
	
	public L10_Contact() {
		// TODO Auto-generated constructor stub
	}

	public L10_Contact(String contactPhoneNumber, String contactEmail, String contactLink) {
		this.contactPhoneNumber = contactPhoneNumber;
		this.contactEmail = contactEmail;
		this.contactLink = contactLink;
	}

	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}

	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactLink() {
		return contactLink;
	}

	public void setContactLink(String contactLink) {
		this.contactLink = contactLink;
	}

	@Override
	public String toString() {
		return "Contact [contactPhoneNumber=" + contactPhoneNumber + ", contactEmail=" + contactEmail + ", contactLink="
				+ contactLink + "]";
	}
	
}
