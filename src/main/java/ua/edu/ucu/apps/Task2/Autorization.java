package ua.edu.ucu.apps.Task2;

public class Autorization extends Авторизація{
    public boolean getAutorization(БазаДаних db) {
        return super.авторизуватися(db);
    }

    @Override @Deprecated
    public boolean авторизуватися(БазаДаних db) {
        return super.авторизуватися(db);
    }
}
