class Calculate{
    private int length;
    private int breath;
    private int area;

    public Calculate(int length, int breath, int area) {
        this.length = length;
        this.breath = breath;
        this.area = area;
    }

    public Calculate() {

    }

    public int getLength(int i) {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath(int i) {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public int getArea() {
        area=length*breath;
        return area;
    }

    @Override
    public String toString() {
        return "Calculate{" +
                "length=" + length +
                ", breath=" + breath +
                ", area=" + area +
                '}';
    }
}
public class Q11 {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.getLength(12);
        calculate.getBreath(34);
        calculate.getArea();



    }
}
