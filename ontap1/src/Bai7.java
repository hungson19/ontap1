import java.util.Scanner;

public class Bai7 {
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

        // Nhập giá trị cần chèn và chỉ số chèn
        System.out.print("Nhập giá trị cần chèn: ");
        int addValue = scanner.nextInt();
        System.out.print("Nhập chỉ số chèn: ");
        int addIndex = scanner.nextInt();

        // Thêm giá trị vào mảng tại chỉ số chỉ định
        if (addIndex >= 0 && addIndex <= n) {
            int[] newArr = new int[n + 1];

            for (int i = 0, j = 0; i < n + 1; i++) {
                if (i == addIndex) {
                    newArr[i] = addValue;
                } else {
                    newArr[i] = arr[j];
                    j++;
                }
            }

            System.out.println("Mảng sau khi chèn:");
            for (int num : newArr) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Chỉ số chèn không hợp lệ.");
        }
    }
}

