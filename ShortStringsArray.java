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
        // Подсчет количества строк длиной <= 3
        int count = 0;
        for (String s : inputArray) {
            if (s.length() <= 3) {
                count++;
            }
        }
        // Создание нового массива для строк длиной <= 3
        String[] resultArray = new String[count];
        int index = 0;
        for (String s : inputArray) {
            if (s.length() <= 3) {
                resultArray[index] = s;
                index++;
            }
        }


}
