package ua.edu.ucu.apps.Task2;

public class Main {
    public static void main(String[] args) {
        DB db = new DB();
        System.out.println(db.отриматиДаніКористувача());
        Авторизація авторизація = new Авторизація();
        if (авторизація.авторизуватися(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
