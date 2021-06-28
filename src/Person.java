package Lesson05;
 // 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Person {
    private String name;
    private String prof;
    private String email;
    private String tel;
    private int money;
    private int age;

// 2. Конструктор класса должен заполнять эти поля при создании объекта.
    public Person(String name, String prof, String email, String tel, int money, int age) {
        this.name = name;
        this.prof = prof;
        this.email = email;
        this.tel = tel;
        this.money = money;
        this.age = age;
       }

       // 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль

     //задать доступ к полю для дальнейшего заполнения значениями из другого класса

    int getAge() {
        return age;
    }

    // метод для получения всей информации о сотруднике
   String getInf() {
        return
        this.name + "; " +
       this.prof + "; " +
       this.email + "; Тел. "+
       this.tel + "; Зарплата  " +
       this.money + "; Возраст "+
       this.age;
    }
}
