package Lesson06;
//1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Hund extends Tier{
    public static  int kolvoHund = 0;

        public Hund(String name, int runDist, int swimDist){
            super("Пёс", name, runDist, swimDist );
            ++kolvoHund;
        }

    }


