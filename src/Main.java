import java.util.Scanner;



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
                    // код для задания 'b'
                    break;
                case 'c':
                    //код для задания 'c'
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