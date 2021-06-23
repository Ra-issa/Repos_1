package Lesson04;
/** 1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку.
    2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
    3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
    4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
*/
import java.util.Random;
import java.util.Scanner;

public class HomeWork04 {
    // описание поля игры: массив из ширины на длины
    public static char[][] map;
    public static int mapWidth;
    public static int mapHeight;

    // описание игроков - состояние клетки: Х / 0 / пусто
    public static char playerHuman = 'X'; // символ игрока Human
    public static char playerEnemy = 'O'; // символ игрока Enemy
    public static char emptyField = '_'; // символ пустой клетки

    // чтение входных данных
    public static Scanner scanner = new Scanner(System.in); //pencil
    public static Random random = new Random(); // создание случайного числа  - выбор координат для ИИ

    public static void main(String[] args) {


        createMap(); // создать карту
        showMap(); // создать карту

// цикл для определения конца работы программы
        while(true) { // повторять бесконечный цикл до тех пор, пока одна из проверок не вернет true
            turnPlayerHuman(); // ход игрока Human
            showMap(); // показать обновленную карту
            if (isWin(playerHuman)) { // остановить работу программы, если найден признак победы игрока
                System.out.println("Human win");
                break;
            }

            if (isDraw()) { // остановить работу программы, если все ячейки заполнены = ничья
                System.out.println("Draw");
                break;
            }

            turnPlayerEnemy(); // ход игрока Enemy
            showMap(); // показать обновленную карту
            if (isWin(playerEnemy)) { // остановить работу программы, если найден признак победы игрока
                System.out.println("PC win");
                break;
            }

            if (isDraw()) {  // остановить работу программы, если все ячейки заполнены
                System.out.println("Draw");
                break;
            }
        }
    }

    // метод для создания игрового поля
    public static void createMap() {
        mapWidth = 3;
        mapHeight = 3;
        map = new char[mapHeight][mapWidth];

        for (int y = 0; y < mapHeight; y++) { // пройти по высоте
            for (int x = 0; x < mapWidth; x++) { // пройти по ширине
                map[y][x] = emptyField; // пустая клетка в каждой ячейке карты
            }
        }
    }

    // метод для отображения карты
    public static void showMap() {
        for (int y = 0; y < mapHeight; y++) {
            System.out.print("|"); //  вывести на экран разделитель | перед каждой строкой
            for (int x = 0; x < mapWidth; x++) {
                System.out.print(map[y][x] + "|"); // вывести на экран каждый элемент, и после него - разделитель |
            }
            System.out.println();
        }
        System.out.println("------------------"); // разделение полей с ходами
    }
    // метод для описания ходов игрока  Human
    public static void turnPlayerHuman() {
        int x; // ввод координаты клетки
        int y; // ввод координаты клетки

        // цикл для введения координат до тех пор, пока не будут введены координаты, удовлятворяющие условиям isValidField и isEmptyField
        do {
            System.out.print("Please enter your coordinates: "); // сообщение игроку
            x = scanner.nextInt() - 1; // чтение значения координаты х и перевод системы координат пользователя [1:1] в систему координат массива [0:0]
            y = scanner.nextInt() - 1; // чтение значения координаты y и перевод системы координат пользователя [1:1] в систему координат массива [0:0]
        } while (!isValidField(y, x) || !isEmptyField(y, x)); // если введены координаты , не удовлетворяющие условиям (сначала - в пределы поля или (затем) - правильное ли значение), то предложение ввести данные еще раз

        map[y][x] = playerHuman; // ячейке с указанными координатами присвоить значение символа игрока
        System.out.println("Human turn in [" + (x + 1) + ":" + (y + 1) + "]"); // сообщение о ходе игрока: координаты с началом в 1:1
    }

    // метод для описания ходов игрока  Enemy
    public static void turnPlayerEnemy() {
        int x; // ввод координаты клетки
        int y; // ввод координаты клетки

        do {
            x = random.nextInt(mapWidth); // присвоить координате х значение, которое не превышает значения ширины (от 0 до значения ширины)
            y = random.nextInt(mapHeight); // присвоить координате х значение, которое не превышает значения длины (от 0 до значения длины)
        } while (!isEmptyField(y, x)); // поиск координат до тех пор, пока они не удовлетворяют условию "пустая клетка"

        map[y][x] = playerEnemy; // ячейке с указанными координатами присвоить значение символа игрока
        System.out.println("Enemy turn in [" + (x + 1) + ":" + (y + 1) + "]"); // сообщение о ходе игрока: координаты с началом в 1:1
    }
 // метод для определения заполнения карты - да/нет
    public static boolean isDraw() {
        for (int y = 0; y < mapHeight; y++) { // пройти по высоте
            for (int x = 0; x < mapWidth; x++) { // пройти по ширине
                if (map[y][x] == emptyField) { // если есть значение "пустая ячейка", возврат false
                    return false;
                }
            }
        }
        return true;
    }

    // метод для определения выигравшего игрока - да/нет
    /** public static boolean isWin(char player) {

        if (map[0][0] == player && map[0][1] == player && map[0][2] == player) return true; // проверка на равентство значений по горизонтали 1
        if (map[1][0] == player && map[1][1] == player && map[1][2] == player) return true; // проверка на равентство значений по горизонтали 2
        if (map[2][0] == player && map[2][1] == player && map[2][2] == player) return true; // проверка на равентство значений по горизонтали 3

        if (map[0][0] == player && map[1][0] == player && map[2][0] == player) return true; // проверка на равентство значений по вертикали 1
        if (map[0][1] == player && map[1][1] == player && map[2][1] == player) return true; // проверка на равентство значений по вертикали 2
        if (map[0][2] == player && map[1][2] == player && map[2][2] == player) return true; // проверка на равентство значений по вертикали 3

        if (map[0][0] == player && map[1][1] == player && map[2][2] == player) return true; // проверка на равентство значений по диагонали
        if (map[0][2] == player && map[1][1] == player && map[2][0] == player) return true; // проверка на равентство значений по диагонали

        return false;
    }
     */
 // ДЗ к уроку 4  проверка на 3 одинаковых символа

    public static boolean isWin(char player) {
            for (int x = 0; x < 3; x++)
                // проверка вертикали и горизонтали
            if ((map[x][0] == player && map[x][1] == player && map[x][2] == player) || // если значение по всем 3 столбцам равно или
               (map[0][x] == player && map[1][x] == player && map[2][x] == player)) // если значение по всем 3 строкам равно
                return true;// вернуть true
        // проверка диагоналей
            if ((map[0][0] == player && map[1][1] == player && map[2][2] == player) ||
                (map[2][0] == player && map[1][1] == player && map[0][2] == player))
            return true;
        return false;
    }

        

    // метод для определения пуста ли клетка
    public static boolean isEmptyField(int y, int x) { // передать внутрь метода x и y
        return map[y][x] == emptyField; // если клетка пустая, то true
    }
    // метод для определения предельных значений координат
    public static boolean isValidField(int y, int x) { // передать внутрь метода x и y
        return x >= 0 && x < mapWidth && y >= 0 && y < mapHeight; // координаты должны принимать значения от 0 до высоты/ширины поля, иначе false
    }

}

