import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số dòng và số cột của mảng 2 chiều
        System.out.print("Nhập số dòng của mảng: ");
        int rows = scanner.nextInt();

        System.out.print("Nhập số cột của mảng: ");
        int cols = scanner.nextInt();

        // Khai báo và nhập giá trị cho mảng 2 chiều
        int[][] matrix = new int[rows][cols];
        System.out.println("Nhập giá trị cho các phần tử của mảng:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // In giá trị của các phần tử mảng theo ma trận
        System.out.println("Ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
