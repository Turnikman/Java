package lab1.pkg2_1;

import java.util.Scanner;

enum FigureColor {

    white, red, green, blue, black
}

enum Season {

    summer, winter, autumn, spring
}

enum Sex {

    man, woman
}

public class Lab12_1 {

    final double Pi = 3.1415926536;
    final double e = -1.6 * 10;
    final String text = "Press<OK>";

    public static void main(String[] args) {
        int age = 22;
        float ram = 1;
        FigureColor Color = FigureColor.green;
        String surname = "Ivanov";
        int population = 1000000;
        float salary = 10000000;
        float weight_mm = 456;
        Season season = Season.summer;
        long stars = 45454334;
        boolean sports = true;
        float weight_sm = 4256;
        Sex sex = Sex.man;

        System.out.println(
                "Age: " + age + "\n"
                + "RAM: " + ram + "\n"
                + "Color: " + Color + "\n"
                + "Surname: " + surname + "\n"
                + "Population: " + population + "\n"
                + "Salary: " + salary + "\n"
                + "Weight_mm: " + weight_mm + "\n"
                + "Season: " + season + "\n"
                + "Stars: " + stars + "\n"
                + "Sports: " + sports + "\n"
                + "Weight_sm: " + weight_sm + "\n"
                + "Sex: " + sex + "\n");
        System.out.println();

        // изменение данных 
        age = 25;
        ram = 2;
        Color = FigureColor.red;
        surname = "Dorofeev";
        population = 2000000;
        salary = 2000000;
        weight_mm = 234;
        season = Season.winter;
        stars = 456746455;
        sports = false;
        weight_sm = 7656;
        sex = Sex.woman;

        System.out.println(
                "Age: " + age + "\n"
                + "RAM: " + ram + "\n"
                + "Color: " + Color + "\n"
                + "Surname: " + surname + "\n"
                + "Population: " + population + "\n"
                + "Salary: " + salary + "\n"
                + "Weight_mm: " + weight_mm + "\n"
                + "Season: " + season + "\n"
                + "Stars: " + stars + "\n"
                + "Sports: " + sports + "\n"
                + "Weight_sm: " + weight_sm + "\n"
                + "Sex: " + sex + "\n");
        System.out.println();

        //Ввод дданых с клавиатуры
        Scanner scan = new Scanner(System.in);
        System.out.println("Age: ");
        age = scan.nextInt();
        System.out.println("RAM: ");
        ram = scan.nextFloat();
        System.out.println("Surname: ");
        surname = scan.next();
        System.out.println("Population: ");
        population = scan.nextInt();
        System.out.println("Salary: ");
        salary = scan.nextFloat();
        System.out.println("Weight_mm: ");
        weight_mm = scan.nextFloat();
        System.out.println("Stars: ");
        stars = scan.nextLong();
        System.out.println("Sportsman?(true or false) ");
        sports = scan.nextBoolean();
        System.out.println("Weight_sm: ");
        weight_sm = scan.nextFloat();
        System.out.println();
        System.out.println(
                "Age: " + age + "\n"
                + "RAM: " + ram + "\n"
                + "Color: " + Color + "\n"
                + "Surname: " + surname + "\n"
                + "Population: " + population + "\n"
                + "Salary: " + salary + "\n"
                + "Weight_mm: " + weight_mm + "\n"
                + "Season: " + season + "\n"
                + "Stars: " + stars + "\n"
                + "Sports: " + sports + "\n"
                + "Weight_sm: " + weight_sm + "\n"
                + "Sex: " + sex + "\n");

    }

}
