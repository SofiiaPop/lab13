package ua.edu.ucu.apps.Task1;

import java.time.LocalDate;

import ua.edu.ucu.apps.Task1.meta.FacebookUser;
import ua.edu.ucu.apps.Task1.myuser.MyFacebookUser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FacebookUser facebookUser = new FacebookUser("popeniuk.pn@ucu.edu.ua", "Ukraine", LocalDate.now());

        MyFacebookUser myFacebookUser = new MyFacebookUser(facebookUser);
        processInformation(myFacebookUser);
    }

    public static void processInformation(MyFacebookUser myFacebookUser) {
        System.out.println(myFacebookUser.getEmail());
    }
}
