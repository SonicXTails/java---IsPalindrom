import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку: ");
            String userInput = scanner.nextLine();

            // Удаление пробелов и приведение к нижнему регистру
            String processedInput = "";
            for (int i = 0; i < userInput.length(); i++) {
                char c = userInput.charAt(i);
                if (c != ' ') {
                    processedInput += Character.toLowerCase(c);
                }
            }

            // Проверка на палиндром
            boolean isPalindrome = true;
            for (int i = 0; i < processedInput.length() / 2; i++) {
                if (processedInput.charAt(i) != processedInput.charAt(processedInput.length() - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("Строка является палиндромом.");
            } else {
                System.out.println("Строка не является палиндромом. Завершение программы...");
                break;
            }
        }
        scanner.close();
    }
}