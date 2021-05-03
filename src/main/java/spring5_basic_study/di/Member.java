package spring5_basic_study.di;

import java.time.LocalDate;

public class Member {
	private long id;
	private	String email;
	private String password;
	private String name;
	private LocalDate registerDateTime;
	public Member(String email, String password, String name, LocalDate registerDateTime) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDateTime = registerDateTime;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getRegisterDateTime() {
		return registerDateTime;
	}
	public void setRegisterDateTime(LocalDate registerDateTime) {
		this.registerDateTime = registerDateTime;
	}
	
	public void changePassword(String oldPassword,String newPassword) {
		if(!password.equals(oldPassword))
			throw new WrongIdPasswordException();
		this.password = newPassword;
		
	}
}
