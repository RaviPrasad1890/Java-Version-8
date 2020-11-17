package com.ravi.version_8.Predicate;

import java.util.function.Predicate;

public class UserAuthentication {
    public static void main(String[] args) {
        Predicate<User> p = usr -> ("Ravi").equals(usr.userName) && ("password".equals(usr.password));
        User userOne=new User("Ravi","password");
        System.out.println(p.test(userOne));
        User userTwo=new User("Ravi","passwords");
        System.out.println(p.test(userTwo));

    }
}
