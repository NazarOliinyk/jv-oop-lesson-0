package mate.academy.service;

import mate.academy.model.User;

public class UserService {
    private static final User[] users = new User[] {
            new User("bob@i.ua", "1234"),
            new User("alice@i.ua", "1234"),
            new User("john@i.ua", "1234"),
            new User("bob@i.ua", "qwerty"),
    };

    public User findByEmail(String email) {
        for (User user : users) {
            if (email.equals(user.getEmail())) {
                return user;
            }
        }
        return null;
    }
}
