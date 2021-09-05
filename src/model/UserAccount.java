package model;

public class UserAccount {
	
	private String username;
	private String password;
	private String photo;
	private String gender;
	private String carrer;
	private String birthday;
	private String browser;
	
	public UserAccount(String username, String password, String photo, String gender, String carrer, String birthday,
			String browser) {
		this.username = username;
		this.password = password;
		this.photo = photo;
		this.gender = gender;
		this.carrer = carrer;
		this.birthday = birthday;
		this.browser = browser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCarrer() {
		return carrer;
	}

	public void setCarrer(String carrer) {
		this.carrer = carrer;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}
	
	
	
}
