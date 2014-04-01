package lab3.pkg4_1;

public class Lab34_1 {

    public static void main(String[] args) {
        int i, min, imin, max, imax;
        long sum = 0;
        int[] Arr = new int[]{3, 15, 23, 12, 84, 76, 35, 19, 44, 98, 34, 67};
        System.out.println("Выводим данные массива на экран по 3 числа в строке: \\t");
        System.out.println();
        for (i = 0; i < Arr.length; i++) {
            System.out.println("Arr(" + i + ")" + Arr[i] + "\t");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
            System.out.println();
            System.out.println("Умножаем данные массива на 2: \t");

            System.out.println();
            for (i = 0; i < Arr.length; i++) {
                Arr[i] *= 2;
            }
            for (i = 0; i < Arr.length; i++) {
                System.out.println("Arr(" + i + ")" + Arr[i] + "\t");
                if ((i + 1) % 3 == 0) {
                    System.out.println();
                }
                System.out.println();
                System.out.println("Сумма всех данных массива: \\t");
                System.out.println();

            }

        }
    }

}
