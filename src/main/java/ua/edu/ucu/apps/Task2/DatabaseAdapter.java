package ua.edu.ucu.apps.Task2;

public class DatabaseAdapter extends БазаДаних {
    public String getUserData() {
        return super.отриматиДаніКористувача();
    }

    public String getStatisticalData() {
        return super.отриматиСтатистичніДані();
    }
}
