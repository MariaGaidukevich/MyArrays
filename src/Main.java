import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Массивы и циклы");
        //1.1
        printOdd(1, 99);

        //1.2
        divided35(1, 100);

        //1.3
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int first = scan.nextInt();
        System.out.print("Введите второе число:");
        int second = scan.nextInt();
        System.out.print("Введите третье число:");
        int third = scan.nextInt();
        sumCheck(first, second, third);

        //1.4
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int a1 = scan2.nextInt();
        System.out.print("Введите второе число:");
        int a2 = scan2.nextInt();
        System.out.print("Введите третье число:");
        int a3 = scan2.nextInt();
        bigCheck(a1, a2, a3);

        //1.5
        int[] intArray = {2, 24, 4, 5, 8, 3};
        threeCheck(intArray);


        //1.6
        int[] list1 = {2, 0, 7, 1, 8, 3};
        checkOneThree(list1);

        //2.1
        int[] array2 = {5, 6, 7, 10, 17};
        isRising(array2);

        //2.2.
        makeArray();

        //2.3
        int[] numbers1 = {5, 6, 7, 2};
        System.out.print("Array 1: " + Arrays.toString(numbers1) + "\n");
        System.out.print("Array 2: " + Arrays.toString(changeArray(numbers1)) + "\n");

        //2.4
        int[] myArray = {1, 2, 3, 1, 2, 4};
        findUniqueNum(myArray);


    }
    //1.1 method

    public static void printOdd(int x, int y) {
        for (int i = x; i <= y; i += 2) {
            System.out.println(i);
        }
    }

    //1.2 method
    public static void divided35(int x, int y) {
        for (int i = x; i <= y; i++) {
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
    }

    //1.3 method
    public static void sumCheck(int first, int second, int third) {
        System.out.printf("Результат:%b\n", first + second == third);
    }

    //1.4 method
    public static void bigCheck(int a1, int a2, int a3) {
        System.out.printf("Результат:%b\n", a2 > a1 && a3 > a2);
    }

    //1.5 method
    public static void threeCheck(int[] intArray) {
        System.out.print("array=");
        for (int i = 0; i < intArray.length; i++) {
            if (i < intArray.length - 1) {
                System.out.printf("%d,", intArray[i]);
            } else {
                System.out.printf("%d\n", intArray[i]);
            }
        }
        System.out.printf("%b\n", intArray[0] == 3 || intArray[intArray.length - 1] == 3);
    }

    //1.6 method

    public static void checkOneThree(int[] list1) {
        boolean oneThree = false;
        for (int i : list1) {
            if (i == 1 || i == 3) {
                oneThree = true;
                System.out.printf("%b\n", oneThree);
                break;
            }
        }
        if (!oneThree) {
            System.out.println("false");
        }
    }

    //2.1 method
    public static void isRising(int[] array2) {
        boolean isRise = true;
        for (int i = 0; i < array2.length - 1; i++) {
            if (array2[i] > array2[i + 1]) {
                isRise = false;
                System.out.println("Please try again");
                break;
            }
        }
        if (isRise) {
            System.out.println("Ok");
        }
    }

    //2.2 method
    public static void makeArray() {
        Scanner arrayScan = new Scanner(System.in);
        System.out.print("Array length: ");
        int len = arrayScan.nextInt();
        int[] num = new int[len];
        System.out.println("Numbers of array:");
        for (int i = 0; i < len; i++) {
            num[i] = arrayScan.nextInt();
        }
        System.out.printf("Result: %s\n", Arrays.toString(num));
    }

    //2.3 method
    public static int[] changeArray(int[] numbers1) {
        int first = numbers1[0];
        int last = numbers1[numbers1.length - 1];
        numbers1[0] = last;
        numbers1[numbers1.length - 1] = first;
        return numbers1;
    }
    //2.4 method
    public static void findUniqueNum(int[] myArray) {
        int countUnique = 0;
        int indexTemp = 0;
        boolean unique;
        for (int i = 0; i < myArray.length; i++) {
            unique = true;
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] == myArray[j] && i != j) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
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
                if (unique) {
                    tempArray[indexTemp] = myArray[i];
                    indexTemp++;
                }
            }
            System.out.print("The first unique number is " + tempArray[0]);
        } else {
            System.out.print("No unique numbers");
        }
    }
}