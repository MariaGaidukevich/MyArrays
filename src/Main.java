import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Массивы и циклы");
        //1.1
        for (int i = 1; i <= 99; i += 2) {
            System.out.println(i);
        }

        //1.2
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.printf("Делится на 3: %d\n", i);
            }
            if (i % 5 == 0) {
                System.out.printf("Делится на 5: %d\n", i);
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("Делится на 3 и на 5: %d\n", i);
            }
        }
        //1.3
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int first = scan.nextInt();
        System.out.print("Введите второе число:");
        int second = scan.nextInt();
        System.out.print("Введите третье число:");
        int third = scan.nextInt();
        if (first + second == third) {
            System.out.println("Результат:true");
        } else {
            System.out.println("Результат:false");
        }
        //1.4
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int a1 = scan2.nextInt();
        System.out.print("Введите второе число:");
        int a2 = scan2.nextInt();
        System.out.print("Введите третье число:");
        int a3 = scan2.nextInt();
        if (a2 > a1 && a3 > a2) {
            System.out.println("Результат:true");
        } else {
            System.out.println("Результат:false");
        }

        //1.5
        int[] intArray = {2, 24, 4, 5, 8, 3};
        System.out.print("array=");
        for (int i = 0; i < intArray.length; i++) {
            if (i < intArray.length - 1) {
                System.out.printf("%d,", intArray[i]);
            } else {
                System.out.printf("%d\n", intArray[i]);
            }
        }

        if (intArray[0] == 3 || intArray[intArray.length - 1] == 3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //1.6

        int[] list1 = {2, 0, 7, 1, 8, 3};
        boolean oneThree = false;
        for (int i : list1) {
            if (i == 1 || i == 3) {
                oneThree = true;
                System.out.printf("%b\n", oneThree);
                break;
            }
        }
        if (oneThree == false) {
            System.out.println("false");

        }

        //2.1
        boolean isRise = true;
        int[] array2 = {5, 6, 7, 10, 17};
        for (int i = 0; i < array2.length - 1; i++) {
            if (array2[i] > array2[i + 1]) {
                isRise = false;
                System.out.print("Please try again");
                break;
            }
        }
        if (isRise == true) {
            System.out.println("Ok");
        }

        //2.2.
        Scanner arrayScan = new Scanner(System.in);
        System.out.print("Array length: ");
        int len = arrayScan.nextInt();
        int[] num = new int[len];
        System.out.println("Numbers of array:");
        for (int i = 0; i < len; i++) {
            num[i] = arrayScan.nextInt();
        }
        System.out.printf("Result: %s\n", Arrays.toString(num));

        //2.3
        int[] numbers1 = {5, 6, 7, 2};
        System.out.print("Array 1: " + Arrays.toString(numbers1) + "\n");
        numbers1 = changeArray(numbers1);
        System.out.print("Array 2: " + Arrays.toString(numbers1) + "\n");

        //2.4
        int[] myArray = {1, 2, 3, 1, 2, 4};
        int countUnique = 0;
        int indexTemp = 0;
        boolean unique = true;
        for (int i = 0; i < myArray.length; i++) {
            unique = true;
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] == myArray[j] && i != j) {
                    unique = false;
                    break;
                }
            }
            if (unique == true) {
                countUnique++;
            }
        }

        if (countUnique != 0) {
            int[] tempArray = new int[countUnique];
            for (int i = 0; i < myArray.length; i++) {
                unique = true;
                for (int j = 0; j < myArray.length; j++) {
                    if (myArray[i] == myArray[j] && i != j) {
                        unique = false;
                        break;
                    }
                }
                if (unique == true) {
                    tempArray[indexTemp] = myArray[i];
                    indexTemp++;
                }
            }
            System.out.print("The first unique number is " + tempArray[0]);
        } else {
            System.out.print("No unique numbers");
        }


    }

    //2.3 method
    public static int[] changeArray(int[] numbers1) {
        int first = numbers1[0];
        int last = numbers1[numbers1.length - 1];
        numbers1[0] = last;
        numbers1[numbers1.length - 1] = first;
        return numbers1;
    }
}