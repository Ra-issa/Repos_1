/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 * Пример:
 * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 * persArray[1] = new Person(...);
 * ...
 * persArray[4] = new Person(...);
 *
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */

package Lesson05;

public   class HomeWork05 {
    public static void main(String[] args) {

        Person sotr = new Person("Ivanov1 Ivan", "Engineer1", "ivivan1@mailbox.com", "892312312", 30000, 30);

        // массив , содержащий данные о команде
        Person[] komanda = {
                sotr,
        new Person("Ivanov3 Ivan", "Engineer3", "ivivan1@mailbox.com", "892312314", 50000, 60),
        new Person("Ivanov2 Ivan", "Engineer", "ivivan2@mailbox.com", "892312313", 40000, 45),
        };
        getAll(komanda);
        System.out.println();
        getMore40(komanda);
    }

        // метод для вывода всей команды нумерованным списком
        private static void getAll (Person[]komanda){
            System.out.println("Вся команда");
            for (int i = 0; i < komanda.length; i++)
                System.out.println((i + 1) + ".   " + komanda[i].getInf());
        }
    // метод для вывода сотрудников старше 40
        private static void getMore40 (Person[]komanda){
            for (int i = 0; i < komanda.length; i++)
                if (komanda[i].getAge() > 40) {
                    System.out.println(komanda[i].getInf());
                }
        }

    }
