import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khai báo mảng 1 chiều số nguyên và nhập giá trị cho từng phần tử
        int[] arr = new int[n];
        System.out.println("Nhập giá trị của các phần tử:");

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        // Nhập chỉ số phần tử cần xóa
        System.out.print("Nhập chỉ số phần tử cần xóa: ");
        int deleteIndex = scanner.nextInt();

        // Kiểm tra chỉ số cần xóa có hợp lệ hay không
        if (deleteIndex >= 0 && deleteIndex < n) {
            // Xóa phần tử trong mảng theo chỉ số chỉ định
            for (int i = deleteIndex; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;

            // In ra mảng sau khi xóa
            System.out.println("Mảng sau khi xóa:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Chỉ số xóa không hợp lệ.");
        }
    }
}

