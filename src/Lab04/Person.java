package Lab04;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;


    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAge() {
        return age;

    }

    public void setAge(int name) {
        this.age = age;

    }

    public char getGender() {
        return gender;

    }

    public void setGender(char gender) {
        this.gender = gender;

    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("Name:" + getName() + "\n");
        response.append("Age" + getAge() + "\n");
        response.append("Gender" + getGender());
        return response.toString();

    }
}

