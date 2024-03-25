import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Khai báo mảng số nguyên gồm 5 phần tử
        int[] arr = new int[5];

        // Nhập giá trị các phần tử từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // In ra giá trị các phần tử của mảng
        System.out.println("Các phần tử của mảng là:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + ": " + arr[i]);
        }
    }
}

