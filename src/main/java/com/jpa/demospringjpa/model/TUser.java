package com.jpa.demospringjpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
public class TUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private long userID;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "active")
	private boolean userActive;
	
	@Column(name = "encryted_password")
	private String encrytedPassword;
	
	@Column(name = "email")
	private String userEmail;
	
	@Column(name = "role_id")
	private String roleID;
	
	@Column(name = "brithday")
	private Date userBirthday;
	
	@Column(name = "gender")
	private String usergender;
	
	@Column(name = "full_name")
	private String userFullName;
	
	@Column(name = "address")
	private String userAddress;
	
	@Column(name = "phone")
	private String userPhone;
	
	@Column(name = "city")
	private String userCity;
	
	@Column(name = "country")
	private String userCountry;
	
	@Column(name = "modified_by")
	private String userModifiedBy;
	
	@Column(name = "modified_date")
	private Date userModifiedDate;
	
	@Column(name = "created_by")
	private String userCreated_by;
	
	@Column(name = "created_date")
	private Date userCreatedDate;

	public TUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isUserActive() {
		return userActive;
	}

	public void setUserActive(boolean userActive) {
		this.userActive = userActive;
	}

	public String getEncrytedPassword() {
		return encrytedPassword;
	}

	public void setEncrytedPassword(String encrytedPassword) {
		this.encrytedPassword = encrytedPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getRoleID() {
		return roleID;
	}

	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}

	public Date getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}

	public String getUsergender() {
		return usergender;
	}

	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public String getUserModifiedBy() {
		return userModifiedBy;
	}

	public void setUserModifiedBy(String userModifiedBy) {
		this.userModifiedBy = userModifiedBy;
	}

	public Date getUserModifiedDate() {
		return userModifiedDate;
	}

	public void setUserModifiedDate(Date userModifiedDate) {
		this.userModifiedDate = userModifiedDate;
	}

	public String getUserCreated_by() {
		return userCreated_by;
	}

	public void setUserCreated_by(String userCreated_by) {
		this.userCreated_by = userCreated_by;
	}

	public Date getUserCreatedDate() {
		return userCreatedDate;
	}

	public void setUserCreatedDate(Date userCreatedDate) {
		this.userCreatedDate = userCreatedDate;
	}

}
