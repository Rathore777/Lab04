import Lab04.Person;

public class Student extends Person {
    private long uniRollNumber;
    private double currentCPI;

    public Student(String name, int age, char gender) {
        super(name, age, gender);


    }

    public long getUniRollNumber() {
        return uniRollNumber;
    }

    public double getCurrentCPI() {
        return currentCPI;
    }

}