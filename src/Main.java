import java.util.Scanner;



class Nalitov_a {
    static void str_in_and_out() {

        System.out.print("введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int out = count_glasnih(input);

        System.out.print("Кол-во гласных в строке = " + out);
    }

    public static int count_glasnih(String input) {
        int count = 0;
        input = input.toLowerCase();

        String glasnie = "aeiouy";

        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);

            if (glasnie.contains(String.valueOf(x))) {
                count++;
            }
        }
        return count;
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