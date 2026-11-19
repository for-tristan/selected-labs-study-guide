package com.example;

import java.util.Random;

// PART 3: SINGLETON AND FACTORY PATTERNS

// --------------------------------------------------
// 1. EAGER SINGLETON
// --------------------------------------------------

class EagerSingleton {

    private String[] letters = {"a", "b", "c", "d", "e"};

    // The instance is created immediately when the class is initialized.
    private static final EagerSingleton oneinstance =
            new EagerSingleton();

    private EagerSingleton() {
        // Private constructor prevents creating objects from outside.
        shuffleData();
    }

    private void shuffleData() {
        // Shuffle the array.
        for (int i = letters.length - 1; i > 0; i--) {
            int j = new Random().nextInt(i + 1);

            String temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
        }
    }

    public static EagerSingleton getInstance() {
        return oneinstance;
    }

    public void printData() {
        for (String item : letters) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}


// --------------------------------------------------
// 2. LAZY SINGLETON
// --------------------------------------------------

class LazySingleton {

    private String[] letters = {"a", "b", "c", "d", "e"};

    // The instance is not created until getInstance() is called.
    private static LazySingleton oneinstance;

    private LazySingleton() {
        shuffleData();
    }

    public static LazySingleton getInstance() {

        if (oneinstance == null) {
            oneinstance = new LazySingleton();
        }

        return oneinstance;
    }

    private void shuffleData() {
        for (int i = letters.length - 1; i > 0; i--) {
            int j = new Random().nextInt(i + 1);

            String temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
        }
    }

    public void printData() {
        for (String item : letters) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}


// --------------------------------------------------
// 3. FACTORY PATTERN - ENEMY EXAMPLE
// --------------------------------------------------

// Product: the parent class of all enemy types.
abstract class Enemy {

    private String name;
    private int damage;
    private int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void showup() {
        System.out.println(
                getName() + " is showing up. "
                + "Damage is " + damage + ". "
                + "Health is " + health
        );
    }
}


// Concrete Product: Turtle.
class Turtle extends Enemy {

    public Turtle() {
        setName("Turtle");
        setDamage(5);
        setHealth(50);
    }
}


// Concrete Product: Bird.
class Bird extends Enemy {

    public Bird() {
        setName("Bird");
        setDamage(15);
        setHealth(50);
    }
}


// Factory: decides which enemy object should be created.
class EnemyFactory {

    public static final int TURTLE = 1;
    public static final int BIRD = 2;

    public static Enemy createEnemy(int id) {

        switch (id) {

            case TURTLE:
                return new Turtle();

            case BIRD:
                return new Bird();

            default:
                return null;
        }
    }
}


// --------------------------------------------------
// 4. MAIN CLASS - PRACTICING THE PATTERNS
// --------------------------------------------------

public class part3 {

    public static void main(String[] args) {

        // EAGER SINGLETON
        System.out.println("EAGER SINGLETON");

        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        System.out.println(eager1 == eager2);
        eager1.printData();
        eager2.printData();


        // LAZY SINGLETON
        System.out.println("\nLAZY SINGLETON");

        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println(lazy1 == lazy2);
        lazy1.printData();
        lazy2.printData();


        // FACTORY PATTERN
        System.out.println("\nFACTORY PATTERN");

        Random random = new Random();

        int loop = 5;

        while (loop > 0) {

            // Generate either 1 (Turtle) or 2 (Bird).
            int enemyID = random.nextInt(2) + 1;

            // Ask the factory to create the enemy.
            Enemy enemy = EnemyFactory.createEnemy(enemyID);

            if (enemy != null) {
                enemy.showup();
            }

            loop--;
        }
    }
}
