interface  Test{
    void display();
    static int square(int number) {
        return number*number*number;
    }
}
class Arithmetic implements Test{
    public void display() {
        System.out.println("....Nothing....");
    }
}
public class Q3 {
    public static void main(String[] args) {
        Test test = new Arithmetic();
        test.display();
        System.out.println(Test.square(23));



    }
}
