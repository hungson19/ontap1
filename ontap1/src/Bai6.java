import java.util.Scanner;

public class Bai6 {
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

        // Nhập giá trị cần tìm
        System.out.print("Nhập giá trị cần tìm: ");
        int findNumber = scanner.nextInt();

        // Tìm chỉ số các phần tử có giá trị bằng giá trị cần tìm và tính tổng của chúng
        int sum = 0;
        System.out.println("Các phần tử có giá trị bằng " + findNumber + " và chỉ số tương ứng:");

        for (int i = 0; i < n; i++) {
            if (arr[i] == findNumber) {
                System.out.println("arr[" + i + "]");
                sum += arr[i];
            }
        }

        // In tổng của các phần tử có giá trị bằng giá trị cần tìm
        System.out.println("Tổng các phần tử có giá trị bằng " + findNumber + ": " + sum);
    }
}

