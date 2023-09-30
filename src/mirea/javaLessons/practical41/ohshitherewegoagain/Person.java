package mirea.javaLessons.practical41.ohshitherewegoagain;

public class Person {
    private String fullName;
    private int age;

    public Person() {

    }

    public Person(String name, int agge) {
        this.fullName = name;
        this.age = agge;
    }

    public void Move() {
        System.out.printf("%s year old %s moves", this.age, this.fullName);
    }

    public void Talk() {
        System.out.printf("%s year old %s says", this.age, this.fullName);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
