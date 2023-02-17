class Student{
    int id;
    String name;
    Address address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
public class Q5 {
    public static void main(String[] args) {
        Student student = new Student(1,"Lucky","chennai");
        Teacher teacher = new Teacher();

    }
}
