package carPooling;

import java.util.Scanner;

public class CarPooling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int array[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int capacity = scanner.nextInt();
        scanner.close();
        System.out.println(equal(array, capacity, row));
    }

    public static boolean equal(int array[][], int capacity, int row) {
        int sum = 0;
        for (int a = 0; a < row; a++) {
            sum += array[a][0];
        }
        System.out.println(sum);
        if (sum <= capacity) {
            return true;
        }
        return false;
    }

}
