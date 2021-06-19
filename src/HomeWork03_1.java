package Lesson03;

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 * 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
 * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
 * 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
 * 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
 * **Примеры:
 * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
 * checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
 * checkBalance([1, 1, 2, 1]) → false
 * граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
 *
 * Если выполнение задач вызывает трудности, можете обратиться к последней странице методического пособия. Для задач со * не нужно искать решение в интернете, иначе нет смысла их выполнять.
 */

public class HomeWork03_1 {
    public static void main(String[] args) {
// задание 1
        System.out.println("1 задание:");
        int[] array_1 = {0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1 };
        printArray_i( "До замены 1 на 0: ", array_1);
        System.out.println();
        zamena(array_1);
        printArray_i( "После замены 1 на 0: ", array_1);
        System.out.println();


// задание 2
        System.out.println("2 задание:");
        int[] arr_2 = new int[100];
        fill(arr_2);
        printArray_i( "Заполнить в цикле: ", arr_2);
        System.out.println();


// задание 3
        System.out.println("3 задание:");

        int[] arr_3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray_i( " До умножения: ", arr_3);
        System.out.println();
        umnoz(arr_3);
        printArray_i( " После умножения: ", arr_3);
        System.out.println();


// задание 4
        System.out.println("4 задание:");
        int a = 10;
        int [][] arr_4 = new int[a][a];
        fill4(arr_4);
        printArray_iy( "4.Заполнить диагональ в цикле: ", arr_4);
        System.out.println("+++++++++++++++");


// задание 5
        System.out.println("5 задание: Одномерный массив ");
        int [] zadanie_5 = zadanie5(5,10);
        printArray_i( " " , zadanie_5);
        System.out.println();

// задание 6
        System.out.println("6 задание: min и max ");

        int[] arr_6 = {12, 5, 3, 2, 117, 4, 5, 2, 4, 8, 9, 1};
        printArray_i( " " , arr_6);
        System.out.println();
        System.out.println( "Максимум: " + zadanie6_max(arr_6));
        System.out.println( "Минимум: " + zadanie6_min(arr_6));
            }

    public static void printArray_i(String s, int[] inArr) { // вывести одномерный массив
        System.out.print(s);
        System.out.print(s);
        for (int i = 0; i < inArr.length; i++) {
            System.out.print(inArr[i] + " ");
        }
    }

    public static void printArray_iy(String s, int[][] inArr){ // вывести двумерный массив
        for (int i = 0; i < inArr.length; i++) {
            for (int y = 0; y < inArr.length; y++) {
                System.out.print(inArr[i][y] + " ");
            }
            System.out.println();
        }
    }
    public static void zamena(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1){
                arr[i] = 0;}
            else {
                arr[i] = 1;
            }
    }
    public static void fill(int[] arr_2) {
        for (int i = 0; i < arr_2.length; i++)
            arr_2[i] = 1 + i ;
    }

    public static void umnoz(int[] arr_3){
        for (int i = 0; i < arr_3.length; i++)
            if (arr_3[i] < 6)
                arr_3[i] *= 2;
        {

        }

    }
    public static void fill4(int[][] arr_4) {
        for (int i = 0; i < arr_4.length; i++) {
            arr_4[i][i] = 1;
            arr_4[i][arr_4.length - 1 - i] = 1;
        }
    }

    public static int[] zadanie5(int len, int initialValue) {
        int[] arr_5 = new int [len];
        for (int i = 0; i < arr_5.length; i++){
            arr_5[i] = initialValue;
        }
        return arr_5;
    }
    public static int zadanie6_min(int[] arr_6) {
        int min = arr_6[0];
        for (int i = 0; i < arr_6.length; i++) {
            if (arr_6[i] < min) {
                min = arr_6[i];  // присвоить минимальному значению значение из массива, если оно меньше...
            }
        }
            return min;
        }
        public static int zadanie6_max(int[] arr_6) {
            int max = arr_6[0];
            for (int i = 0; i < arr_6.length; i++) {
                if (arr_6[i] > max) {
                    max = arr_6[i];  // присвоить максимальному значению значение из массива, если оно больше...
                }
            }
                return max;

        }
}
