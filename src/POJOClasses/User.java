package POJOClasses;

import java.util.Objects;

public class User {
    private String firstName;
    private String secondName;
    private int age;
    private String email;
    private String mobNum;
    private String password;

    public User(String firstName, String secondName, int age, String email, String mobNum, String password) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.email = email;
        this.mobNum = mobNum;
        this.password = password;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobNum() {
        return mobNum;
    }

    public void setMobNum(String mobNum) {
        this.mobNum = mobNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && firstName.equals(user.firstName) && secondName.equals(user.secondName) && email.equals(user.email) && mobNum.equals(user.mobNum) && password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, age, email, mobNum, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", mobNum='" + mobNum + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
