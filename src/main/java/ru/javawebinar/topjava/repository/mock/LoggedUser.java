package ru.javawebinar.topjava.repository.mock;

import ru.javawebinar.topjava.model.Role;

public class LoggedUser {
   private static int userId;

   private static Role role;

    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int userId) {
        LoggedUser.userId = userId;
    }

    public static Role getRole() {
        return role;
    }

    public static void setRole(Role role) {
        LoggedUser.role = role;
    }
}
