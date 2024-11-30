package ua.edu.ucu.apps.Task2;

public class AuthorizationAdapter extends Autorization {
    public boolean authorize(БазаДаних db) {
        return super.авторизуватися(db);
    }
}
