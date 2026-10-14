package BuilderPattern;

public class Main {
    public static void main(String[] args) {

        User user = new User.Builder(
                101,
                "Vipul",
                "vipul@example.com"
        )
                .age(21)
                .phone("9876543210")
                .build();

        user.display();
    }
}