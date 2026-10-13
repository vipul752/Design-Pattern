package prototypePattern;

public class Email implements Copyable<Email>{
    private String sender;
    private String subject;
    private String body;
    private String signature;

    Email(String sender,String subject,String body,String signature){
        this.sender = sender;
        this.subject = subject;
        this.body = body;
        this.signature = signature;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void display() {
        System.out.println("From: " + sender);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        System.out.println(signature);
        System.out.println("--------------------");
    }

    @Override
    public Email cloneObject() {
        return new Email(
                this.sender,
                this.subject,
                this.body,
                this.signature
        );
    }
}
