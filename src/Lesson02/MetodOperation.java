package Lesson02;

public class MetodOperation {
    public static void main(String[] args) { // возвращающий метод
// RESULT = A * B + С * В
        // A = a + b * c - d
        // B = b * c - a + d
        // C = a * b * c - d
        // D = a - b - c - d

        int result;
        result = valueA(valueA(valueA(33,34,35,36),valueB(37,38,39,40),valueC(41,42,43,44), valueD(45,46,47,48)),valueB(21,22,23,24),valueC(25,26,27,28), valueD(29,30,31,32)) *
                valueB(5,6,7,8) +
                valueC(9,10,11,12) *
                valueD(13,14,15,16);

        System.out.println("Result = " + result);
    }
    public static int valueA(int a, int b, int c, int d){
        return a + b * c - d;
    }
    public static int valueB(int a, int b, int c, int d){
        return b * c - a + d;
    }
    public static int valueC(int a, int b, int c, int d){
        return a * b * c - d;
    }
    public static int valueD(int a, int b, int c, int d){
        return a - b - c - d;
    }
}
