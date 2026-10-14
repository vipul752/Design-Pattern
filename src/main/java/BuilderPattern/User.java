package BuilderPattern;

public class User {
    private final int id;
    private final String name;
    private final String email;
    private final int age;
    private final String phone;
    private final String address;

    // Private constructor: only Builder can create User objects
    private User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Static nested Builder class
    public static class Builder {
        private final int id;
        private final String name;
        private final String email;

        private int age;
        private String phone;
        private String address;

        // Required fields
        public Builder(int id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }

        // Optional fields
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // Create the final object
        public User build() {
            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException(
                        "Name cannot be empty"
                );
            }

            if (email == null || email.isBlank()) {
                throw new IllegalArgumentException(
                        "Email cannot be empty"
                );
            }

            if (age < 0) {
                throw new IllegalArgumentException(
                        "Age cannot be negative"
                );
            }

            return new User(this);
        }
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }
}
