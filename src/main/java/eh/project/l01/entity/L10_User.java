package eh.project.l01.entity;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class L10_User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	private String userName;
	private String userPassword;
	
	@Embedded
	private L10_Contact userContact;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date userCreateDate;
	
	public L10_User() {
		
	}

	public L10_User(String userName, String userPassword, L10_Contact userContact, Date userCreateDate) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userContact = userContact;
		this.userCreateDate = userCreateDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public L10_Contact getUserContact() {
		return userContact;
	}

	public void setUserContact(L10_Contact userContact) {
		this.userContact = userContact;
	}

	public Date getUserCreateDate() {
		return userCreateDate;
	}

	public void setUserCreateDate(Date userCreateDate) {
		this.userCreateDate = userCreateDate;
	}
	
	

}
