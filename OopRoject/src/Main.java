import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите значение: ");
            String value = scanner.nextLine();

            List<String> list = new ArrayList<>();
            System.out.print("Введите элементы списка (разделители - пробел): ");
            String[] elements = scanner.nextLine().split(" ");
            for (String element : elements) {
                list.add(element);
            }

            TaskManager manager = new TaskManager();

            System.out.println("Изначальный список: " + list);

            manager.AddTsk(list, value);
            manager.DeleteTsk(list, value);

            System.out.print("Введите индекс элемента для изменения: ");
            int index = scanner.nextInt();
            manager.ChangeTsk(list, value, index);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено некорректное значение индекса.");
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}