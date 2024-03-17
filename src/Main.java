
//  Удаление всех знаков препинания и служебных символов (кроме пробела) из строки

import java.util.Scanner;

class Shumskiy_C {
    static void znaki_prep() {
        Scanner scanner = new Scanner(System.in); // Создаем Scanner для ввода данных с клавиатуры
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String znaki = ".,-_/?!+*:;()<>^"; // Строка со специальными символами, которые мы хотим удалить
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

class Main {
    public static void main(String[] args) {
        Shumskiy_C.znaki_prep();
    }
}