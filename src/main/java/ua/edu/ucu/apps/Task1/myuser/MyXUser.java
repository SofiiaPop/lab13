package ua.edu.ucu.apps.Task1.myuser;

import java.time.LocalDate;

import ua.edu.ucu.apps.Task1.twitter.XUser;


public class MyXUser implements User{
    private XUser xUser;

    public MyXUser(XUser xUser) {
        this.xUser = xUser;
    }

    @Override
    public String getEmail() {
        return xUser.getEmail();
    }

    @Override
    public String getCountry() {
        return xUser.getUserCountry().name();
    }

    @Override
    public LocalDate getLocalDate() {
        return xUser.getUserActiveTime();
    }    
}
