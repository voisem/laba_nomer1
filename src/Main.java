import java.util.Scanner;






//  Удаление всех знаков препинания и служебных символов (кроме пробела) из строки
class Shumskiy_C {
    static void znaki_prep() {
        Scanner scanner = new Scanner(System.in); // Создаем Scanner для ввода данных с клавиатуры
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String znaki = ".,-_/?!+*:;()%@$&#[]{}<>^"; // Строка со специальными символами, которые мы хотим удалить
        String vivod = "";
        for (int i = 0; i < input.length(); i++) { // Проходим по каждому символу во введенной строке
            char x = input.charAt(i);
            if (znaki.contains(String.valueOf(x))) { // Если символ является специальным, пропускаем его
                continue;
            } else { // иначе добавляем его в строку без специальных знаков
                vivod = new StringBuilder().append(vivod).append(x).toString();
            }
        }
        System.out.print(vivod);

    }
}







class Andriyanov_b{
    // Объявление класса Andriyanov_b.
    static void register_bukv(){ // Объявление статического метода register_bukv(), возвращающего целочисленное значение.

        Scanner scanner = new Scanner(System.in); // Создание объекта Scanner для считывания ввода пользователя из консоли.

        System.out.print("Введите строку: "); // Вывод текста для запроса ввода строки.
        String input = scanner.nextLine(); // Считывание строки, введенной пользователем, и сохранение в переменную input.

        String Verhniy = input.toUpperCase(); // Преобразование строки input в верхний регистр и сохранение в переменную Verhniy.
        String Nigniy = input.toLowerCase(); // Преобразование строки input в нижний регистр и сохранение в переменную Nigniy.

        System.out.print("Верхний регистр: " + Verhniy + "\n"); // Вывод строки верхнего регистра.
        System.out.print("Нижний регистр: " + Nigniy); // Вывод строки нижнего регистра.

        return 0; // Возвращение значения 0.
    }
}





class Nalitov_a {
    // ввод строки с клавиатуры, подсчет гласных букв и вывода результата
    static void str_in_and_out() {
        System.out.print("Введите строку: ");

        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для считывания ввода с клавиатуры
        String input = scanner.nextLine(); // Считываем введенную строку

        int out = count_glasnih(input);
        // Выводим результат подсчета гласных букв
        System.out.print("Количество гласных в строке = " + out);
    }

    // подсчет
    public static int count_glasnih(String input) {

        int count = 0; // переменная для хранения количества гласных букв
        input = input.toLowerCase(); // строку в нижний регистр

        String glasnie = "aeiouy"; // все гласные буквы

        // Проходим по каждому символу
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            // Проверяем является ли текущий символ гласной буквой
            if (glasnie.contains(String.valueOf(x))) {

                count++; // увеличиваем счетчик
            }
        }

        return count; // Возвращаем количество гласных
    }
}



class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char zadanie;

        do {
            System.out.println();
            System.out.println();
            System.out.print(
                    "[a] Налитов Андрей |Подсчет количества гласных букв в строке|\n" +
                            "[b] Андриянов Влад |Привидение всех букв к верхнему и нижнему регистру|\n" +
                            "[c] Шумский Илья |Удаление всех знаков препинания и служебных символов (кроме пробела) из строки|\n\n" +
                            "Введите букву задания или 'q' для выхода: "
            );
            zadanie = scanner.nextLine().charAt(0);

            switch (zadanie) {
                case 'a':
                    Nalitov_a.str_in_and_out();
                    break;
                case 'b':
                    Andriyanov_b.register_bukv();
                    break;
                case 'c':
                    Shumskiy_C.znaki_prep();
                    break;
                case 'q':
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неправильный выбор. Попробуйте еще раз.");
            }
        } while (zadanie != 'q');

    }
}
