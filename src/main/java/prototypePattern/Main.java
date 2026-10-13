package prototypePattern;

public class Main {
    static void main(String[] args) {
        Email Prototype = new Email("sender@example.com", "Subject", "Body", "Signature");
        Email email2 = Prototype.cloneObject();
        Email email3 = Prototype.cloneObject();

        email2.setSubject("New Subject");
        email3.setBody("New Body");

        Prototype.display();
        email2.display();
        email3.display();

    }

}
