package Lesson02;

public class Lesson02 {
    public static void main(String[] args) {
        /** int a = 200;
         int b = 20;
         int result;

         if (a > b) {
         result = a;
         } else {
         result = b;
         }
         System.out.print( "Result = " + result);

         // тернарный оператор - переменные

         result = (a > b) ? a : b; // (условие) команда значение переменной, если условие выполнятеся : значение переменной, если условие не выполнятеся
         System.out.print("   ");
         System.out.print( "Result = " + result);


         public static int doSmth1() {
         ///...
         return 45;
         }

         public static int doSmth2() {
         ///...
         return 80;
         }
         // тернарный оператор - методы
         result = (a > b) ? doSmth1() : doSmth2(); // (условие) команда значение переменной, если условие выполнятеся : значение переменной, если условие не выполнятеся
         System.out.print("   ");
         System.out.print( "Result = " + result);

         String nameLetter = "Bori";
         if (nameLetter == "Olga") {
         System.out.println("Give letter to Olga");
         } else if (nameLetter == "Boris") {
         System.out.println("Give letter to Boris");
         } else if (nameLetter == "Maria") {
         System.out.println("Give letter to Maria");
         } else {
         System.out.println("Go out");
         }
         System.out.println("****************");

         // условный оператор switch, применяется, когда известно конечное число вариантов
         switch (nameLetter) {
         case "Olga" : System.out.println("Give letter to Olga");
         break;
         case "Boris" : System.out.println("Give letter to Boris");
         break;
         case "Maria" : System.out.println("Give letter to Maria");
         break;
         default: System.out.println("Go out");
         }


         for (int i = 1; i < 10; i++) //i++ -> i=i+1
         System.out.print(i + " ");

        System.out.println("result = " + myM( 2, 10));
    }
        public static int myM(int base, int signature) {
            int result = 1;
            for (int i = 1; i <= signature; i++) {
                result = result * base;
            }

            return result;
        }
        */
        table(10,10);
    }
        public static void table(int width, int heigth){
            for (int y = 1; y < heigth; y++) {  //вложенный цикл по вертикали
                for (int x = 1; x < width; x++) { //по горизонтали
                    System.out.print(y * x + "\t"); // символ табуляции
                }
                System.out.println(); //пустая строка
            }
        }

    }



