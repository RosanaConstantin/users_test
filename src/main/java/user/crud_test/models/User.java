package user.crud_test.models;

public class User {
    private String lastName;
    private String firstName;
    private String email;
    private Integer age;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public User(String lastName, String firstName, String email, Integer age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "firtName = " + firstName + " lastName = "
                + lastName + " age = " + age + " email = " + email;
    }

    @Override
    public boolean equals(Object user) {
        if (!(user instanceof User)) return false;
        if (user == this) return true;
        if (this.email.equals(((User) user).email)) return true;
        return false;
    }
}
