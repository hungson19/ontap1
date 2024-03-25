import java.util.Scanner;

public class Bai8 {
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

        // Nhập giá trị cần cập nhật và chỉ số cần cập nhật
        System.out.print("Nhập giá trị cần cập nhật: ");
        int updateValue = scanner.nextInt();
        System.out.print("Nhập chỉ số cần cập nhật: ");
        int updateIndex = scanner.nextInt();

        // Kiểm tra chỉ số cần cập nhật có hợp lệ hay không
        if (updateIndex >= 0 && updateIndex < n) {
            // Cập nhật giá trị vào mảng tại chỉ số chỉ định
            arr[updateIndex] = updateValue;

            // In ra mảng sau khi cập nhật
            System.out.println("Mảng sau khi cập nhật:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Chỉ số cập nhật không hợp lệ.");
        }
    }
}
