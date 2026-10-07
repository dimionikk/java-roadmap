public class Student {
    private String fullName;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Student(String name, int age) {
        this.fullName = name;
        this.age = age;
    }
}