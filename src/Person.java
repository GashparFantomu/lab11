public class Person {
    String name;
    int age;
    int phoneNumber;

    public Person(String name, int age, int phoneNumber) {
        this.name = name;
        this.age = 0;
        this.phoneNumber = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return name + " " + age + " " + phoneNumber;
    }
}
