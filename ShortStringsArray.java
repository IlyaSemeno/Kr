import java.util.Scanner;
public class ShortStringsArray {
    public static void main(String[] args) {
        // Ввод массива строк с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк в массиве:");
        int n = scanner.nextInt();
        scanner.nextLine();  // Поглощение символа новой строки

        String[] inputArray = new String[n];
        System.out.println("Введите строки:");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextLine();
        }


}
