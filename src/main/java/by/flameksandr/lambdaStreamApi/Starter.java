package by.flameksandr.lambdaStreamApi;

public class Starter {

    public static void main(String[] args) {
        DataBase dataBase = User::new;
        User user = dataBase.create("Simon", "root");
        System.out.printf("Name: %s%nPassword: %s", user.getName(), user.getPassword());
    }
}
