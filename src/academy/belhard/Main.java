package academy.belhard;

public class Main {

    public static void main(String[] args) {
        // строки
        String s1 = "Строка 1";
        String s2 = s1 + " и еще что-то";
        System.out.println(s2);

        int a = 123;
        String s3 = "Число " + a;
        System.out.println(s3);

        System.out.println();
        System.out.println();

        // создание массива
        int[] arr = new int[3];

        // инициализация массива
        arr[0] = 1;
        arr[0] = 2;
        arr[0] = 3;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println();

        for (int el : arr) {
            System.out.print(el + " ");
        }

        // альтернативный синтаксис объявления массива
        int[] arr2 = {5,6,7,8,9};

        // ... напишите вывод массива arr2

        System.out.println();
        System.out.println();

        // многомнрные массивы
        int[][] arr3 = new int[2][3];
        arr3[0][0] = 1;
        arr3[0][1] = 2;
        // ... допишите сами

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
