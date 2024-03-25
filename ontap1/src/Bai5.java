import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số dòng và số cột của mảng 2 chiều
        System.out.print("Nhập số dòng của mảng: ");
        int row = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int col = scanner.nextInt();

        // Khai báo mảng 2 chiều số thực và nhập giá trị cho từng phần tử
        double[][] arr = new double[row][col];
        System.out.println("Nhập giá trị của các phần tử:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("arr[" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextDouble();
            }
        }

        // In giá trị các phần tử chẵn và tính tổng của chúng
        double sum = 0;
        System.out.println("Các phần tử chẵn trong mảng:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.println("arr[" + i + "][" + j + "]: " + arr[i][j]);
                    sum += arr[i][j];
                }
            }
        }

        // In tổng của các phần tử chẵn
        System.out.println("Tổng các phần tử chẵn trong mảng: " + sum);
    }
}

