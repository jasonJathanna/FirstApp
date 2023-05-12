package PolishPackage;

public class User {

	public String userName;
	public String id;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return userName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof User)) {
			return false;
		}

		User mdc = (User) obj;
		return mdc.userName.equals(userName);
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", id=" + id + "]";
	}

}
