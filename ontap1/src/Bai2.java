import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khai báo mảng số thực có n phần tử
        double[] arr = new double[n];

        // Nhập giá trị các phần tử của mảng
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextDouble();
        }

        // Tính tổng các phần tử của mảng
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }

        // Tính giá trị trung bình cộng của các phần tử trong mảng
        double average = sum / n;

        // In ra giá trị trung bình cộng của các phần tử trong mảng
        System.out.println("Giá trị trung bình cộng của các phần tử trong mảng: " + average);
    }
}

