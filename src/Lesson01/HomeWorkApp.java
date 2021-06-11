package Lesson01;

/** комментарий ява
 *
 */
/**Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
 Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
 _Orange
 _ Banana
 _ Apple

 Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
 Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
 то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;

 Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
 Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
 если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
 если больше 100 (100 исключительно) - “Зеленый”;

 Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
 и инициализируйте их любыми значениями, которыми захотите.
 Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;

 Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают.
 */

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println("***********************");
        if (checkSumSignU( 10, 15)) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        };
        System.out.println("*************");
        checkSumSign();
        System.out.println("****************************");
        printColor();
        System.out.println("*************");
        System.out.println(printColorU(100));
        System.out.println(printColorU(-100));
        System.out.println(printColorU(50));
        System.out.println("*************************");
        compareNumbers();
        System.out.println("*************");
        System.out.println(compareNumbersU( 15, 10));
        System.out.println("*************************");
    }
    public static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //Универсальное решение:
    public static boolean checkSumSignU(int a, int b) {
        return (a + b) >= 0;
                }
    public static void checkSumSign() {
        int a = 3, b = -100;
        int summ = a + b;
        System.out.println("Сумма " + summ);
        if (summ >= 0) {
            System.out.println("Сумма положительная");
        }
        else  {
            System.out.println("Сумма отрицательная");

        }
    }
    public static void printColor() {
        int value = 70;
        if (value <= 0) {
            System.out.println("“Красный”");}
        else if (value < 100 ) {
                System.out.println("“Желтый”");}
        if (value > 100) {
                    System.out.println("“Зеленый”");}
    }
    // универсальное решение
    public static String printColorU(int value) {
        if (value <= 0) {
            return "“Красный”";}
        else if (value > 0 && value <= 100) {
            return "“Желтый”";}
        else {
            return "“Зеленый”";}
    }
    // универсальное решение
    public static String  compareNumbersU(int a, int b) {
        if (a >= b) {
            return "a >= b";}
        else {
            return "a < b";}
    }

    public static  void compareNumbers() {
        int a = 2, b = 3;
        if (a >= b) {
        System.out.println(" a >= b");
        }
        else { System.out.println(" a < b ");
        }
    }
 }

