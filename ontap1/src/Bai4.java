import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khai báo mảng số nguyên và nhập giá trị cho từng phần tử
        int[] arr = new int[n];
        System.out.println("Nhập giá trị của các phần tử:");

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        // Tìm giá trị lớn nhất và nhỏ nhất trong mảng
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // In kết quả
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}

