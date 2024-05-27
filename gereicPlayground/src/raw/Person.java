package raw;

public class Person {
    private String socialSecurityNumber;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Person(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
