package apps.task1;

import java.time.LocalDate;

import apps.task1.meta.FacebookUser;
import apps.task1.myUser.MyFacebookUser;
import apps.task1.myUser.User;
import apps.task1.twitter.XCountry;
import apps.task1.twitter.XUser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        XUser xUser = new XUser("dobosevych.gmail.com", XCountry.UKRAINE, LocalDate.now());
        FacebookUser facebookUser = new FacebookUser("dobosevych.gmail.com", "XCountry.UKRAINE", LocalDate.now());
        MyFacebookUser user = new MyFacebookUser(facebookUser);
        processInformation(user);
    }


    public static void processInformation(User user) {
        System.out.println(user.getEmail());
    }
}