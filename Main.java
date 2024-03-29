import java.util.Scanner;
// Импорт класса Scanner из пакета java.util для работы с пользовательским вводом.
// New coment
class Andriyanov_b{
    // Объявление класса Andriyanov_b.
    public static int register_bukv(){ // Объявление статического метода register_bukv(), возвращающего целочисленное значение.

        Scanner scanner = new Scanner(System.in); // Создание объекта Scanner для считывания ввода пользователя из консоли.

        System.out.print("Введите строку: "); // Вывод текста для запроса ввода строки.
        String input = scanner.nextLine(); // Считывание строки, введенной пользователем, и сохранение в переменную input.

        String Verhniy = input.toUpperCase(); // Преобразование строки input в верхний регистр и сохранение в переменную Verhniy.
        String Nigniy = input.toLowerCase(); // Преобразование строки input в нижний регистр и сохранение в переменную Nigniy.

        System.out.print("Верхний регистр: " + Verhniy + "\n"); // Вывод строки верхнего регистра.
        System.out.print("Нижний регистр: " + Nigniy); // Вывод строки нижнего регистра.

    }
}

public class Main{ // Объявление публичного класса Main.
    public static void main(String[] args) { // Объявление статического метода main() с аргументом args типа String[].

        Andriyanov_b.register_bukv(); // Вызов статического метода register_bukv() из класса Andriyanov_b.

    }
}