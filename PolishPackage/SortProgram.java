package PolishPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortProgram {

	public static void main(String[] args) {

		List<User> users = new ArrayList<User>();
		List<UserFinal> usersFinal = new ArrayList<UserFinal>();

		User user = new User();
		user.setId("A1");
		user.setUserName("Ivan");
		users.add(user);

		User user1 = new User();
		user1.setId("A2");
		user1.setUserName("Jason");
		users.add(user1);

		User user2 = new User();
		user2.setId("A3");
		user2.setUserName("Ivan");
		users.add(user2);

		User user3 = new User();
		user3.setId("A4");
		user3.setUserName("Ivan");
		users.add(user3);

		User user4 = new User();
		user4.setId("A5");
		user4.setUserName("Ivan");
		users.add(user4);
		boolean hasRun = false;
		for (int i = 0; i < users.size(); i++) {
			User tempUser = users.get(i);
			hasRun = false;
			for (int j = 0; j < usersFinal.size(); j++) {

				if (tempUser.getUserName().equals(usersFinal.get(j).getUserName())) {
					usersFinal.get(j).addId(tempUser.getId());
					hasRun = true;
				}

			}
			if (hasRun == false) {
				UserFinal userAdd = new UserFinal();
				userAdd.setUserName(tempUser.getUserName());
				String s[] = { tempUser.getId() };
				ArrayList<String> id = new ArrayList(Arrays.asList(s));
				userAdd.setId(id);

				usersFinal.add(userAdd);
			}
		}
		for (int i = 0; i < usersFinal.size(); i++) {
			usersFinal.get(i).toString();
		}
	}

}
