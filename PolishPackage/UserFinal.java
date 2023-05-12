package PolishPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class UserFinal {

	public String userName;
	String s[] = { "1" };
	public ArrayList<String> id = new ArrayList(Arrays.asList(s));

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	// public ArrayList getId() {
	// return id;
	// }

	public void setId(ArrayList id) {
		this.id = id;
	}

	public void addId(String id) {
		this.id.add(id);
	}

	@Override
	public int hashCode() {
		return userName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof UserFinal)) {
			return false;
		}

		UserFinal mdc = (UserFinal) obj;
		return mdc.userName.equals(userName);
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", id=" + id + "]";
	}

}
