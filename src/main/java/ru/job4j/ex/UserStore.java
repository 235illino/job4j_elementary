package ru.job4j.ex;

import java.util.Objects;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User findU = null;
        for (int i = 0; i < users.length; i++) {

            if (users[i].getUsername().equals(login)) {
                findU = users[i];
                break;
            }
        }
        if (Objects.isNull(findU)) {
            throw new UserNotFoundException("User wasn't found");
        }
        return findU;
    }


    public static boolean validate(User user) throws UserInvalidException {
        boolean val = true;
        if (user.isValid() || user.getUsername().length() < 3) {
            val = false;
            throw new UserInvalidException("User isn't valid");
        }
        return val;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = null;
        try {
            user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
