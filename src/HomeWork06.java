package Lesson06;

/**
 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 4. * Добавить подсчет созданных котов, собак и животных.
 */

public class HomeWork06 {
    public static void main(String[] args) {
               
        Hund hund1 = new Hund("Тузик", 100, 5);
        Hund hund2 = new Hund("Бобик", 150, 10);
        Hund hund3 = new Hund("Ральф", 80, 2);
                Katze katze1 = new Katze("Васька",20,1);
                Katze katze2 =new Katze("Пушок",10,2);
                Katze katze3 =new Katze("Ярокус",50, 3);


        Tier[] staya = {hund1,hund2,hund3,katze1,katze2,katze3};


        for(int i = 0; i < staya.length; i++) {
            String nameString  = staya[i].getVid()+ " " +  staya[i].getName()+ " пробежал " +  staya[i].getRunDist()+  " и проплыл "  +  staya[i].getSwimDist();
            System.out.println(nameString);
             }

        System.out.println("Всего зверей: " + Tier.kolvoTier + ". Из них собак: " + Hund.kolvoHund + ". Из них кошек: " + Katze.kolvoKatze);
        }
        }






