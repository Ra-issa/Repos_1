package Lesson02;

/**
 * Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
 * если да – вернуть true, в противном случае – false.
 * Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
 * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 * Написать метод, которому в качестве параметра передается целое число.
 * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
 * Написать метод, которому в качестве аргументов передается строка и число,
 * метод должен отпечатать в консоль указанную строку, указанное количество раз;
 * Написать метод, который определяет, является ли год високосным,
 * и возвращает boolean (високосный - true, не високосный - false).
 * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
public class HomeWorkV {
    public static void main(String[] args) {
        System.out.print("Задание 1 : " + summ10and20(10, 5));
        System.out.println(" ");
        System.out.println("*************");
        System.out.print("Задание 2 :  ");
        aPosNeg(-100);
        System.out.println("*************");
        System.out.print("Задание 3 :  " + (bPosNeg3(50)));
        System.out.println(" ");
        System.out.println("*************");
        System.out.print("Задание 4 :  " );
        System.out.println(" ");
        printStringNum("Строка", 10);
        System.out.println("*************");
    }


    public static boolean summ10and20(int a, int b) {
        return (a + b <= 20) && (a + b >= 10);
    }

    public static void aPosNeg(int a) {
        if (a >= 0) {
            System.out.println(a + "  положительное");
        } else {
            System.out.println(a + "  отрицательное");
        }
    }

    public static boolean bPosNeg3(int a) {
        return a >= 0;
    }

    public static void printStringNum(String s, int n){
        for (int x = 1; x < n+1; x++){
            System.out.println( "Строка N" + x + " . " + n);
        }
    };

}
