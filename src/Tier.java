package Lesson06;
/**
 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 4. * Добавить подсчет созданных котов, собак и животных.
 */

public abstract class Tier {
    protected String name; //модификатор доступа для наследников
    private String vid;
    private int runDist;
    private int swimDist;
    public static int kolvoTier = 0;

    Tier( String vid, String name,  int runDist, int swimDist) {
        this.name = name;
        this.vid = vid;
        this.runDist = runDist;
        this.swimDist = swimDist;
        ++kolvoTier;
    }

    String getName() {
        return this.name;
    }

    String getVid() {
        return this.vid;
    }

    int getRunDist() {
        return this.runDist;
            }

    int getSwimDist() {
        return this.swimDist;
    }


}


