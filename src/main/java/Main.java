import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 07;
        post.birthday.year = 1987;
        post.name = "Jonathan";
        post.passport = "1234 № 12345678";
        post.patronymic = "Dwight";
        post.phone = "+7 (123)-456-78-90";
        post.surname = "Jones";
        post.subscription = true;
    }
}
