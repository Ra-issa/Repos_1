package Lesson06;
//1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Katze extends Tier {
    public static  int kolvoKatze = 0;
        public Katze( String name, int runDist, int swimDist){
        super("Кот", name, runDist, swimDist );
        ++kolvoKatze;
    }

//
//    @Override
//    public int swim(int dist) {
//        return Tier.SWIM_N;
 //       }
    }


