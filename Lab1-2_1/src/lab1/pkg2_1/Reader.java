package lab1.pkg2_1;

import java.util.Scanner;

public class Reader {

    public enum Color {

        red, green, blue
    };

    Color col = Color.green;
    byte age;
    float ram;
    String surname;
    int population;
    float salary;
    float weight_mm;
    long stars;
    boolean sports;
    float weight_sm;

    public void Scan() {
        Scanner s = new Scanner(System.in);
        System.out.println("Age: ");
        age = s.nextByte();
        System.out.println("RAM: ");
        ram = s.nextFloat();
        System.out.println("Surname : ");
        surname = s.next();
        System.out.println("Population : ");
        population = s.nextInt();
        System.out.println("Salary : ");
        salary = s.nextFloat();
        System.out.println("Weight_mm : ");
        weight_mm = s.nextFloat();
        System.out.println("Stars : ");
        stars = s.nextLong();
        System.out.println("Sports : ");
        sports = s.nextBoolean();
        System.out.println("Weight_sm : ");
        weight_sm = s.nextFloat();
    }
}
