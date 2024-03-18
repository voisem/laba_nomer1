# Программа для обработки строк (RUS)

Этот репозиторий содержит Java-программу, которая выполняет различные операции с введенными строками. Программа разработана тремя разработчиками:

- **Налитов Андрей** `Nalitov_a` подсчет количества гласных букв в строке.
- **Андриянов Влад** `Andriyanov_b` привидение всех букв строки к верхнему и нижнему регистру.
- **Шумский Илья** `Shumskiy_C` удаляет все знаки препинания и служебные символы (кроме пробела) из введенной строки.

## Описание каждого класса

### Класс `Nalitov_a`



- Mетод `str_in_and_out()` принимает ввод пользователя, вызывает метод подсчета и выводит результат.

```java
static void str_in_and_out() {
    System.out.print("Введите строку: ");

    Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для считывания ввода с клавиатуры
    String input = scanner.nextLine(); // Считываем введенную строку

    int out = count_glasnih(input); //вызов функци подсчета гласных
    // Выводим результат подсчета гласных букв
    System.out.print("Количество гласных в строке = " + out);
}
```
- Метод `count_glasnih(String input)` нужен для подсчета гласных букв в строке. Принимает строку в качестве аргумента и возвращает количество гласных букв в этой строке.
```java
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
```


### Класс `Andriyanov_b`

- Метод `register_bukv()` создает объект Scanner для считывания ввода пользователя из консоли. Затем запрашивает у пользователя ввод строки. Преобразует введенную строку в верхний и нижний регистр с помощью методов `toUpperCase()` и `toLowerCase()`. И наконец, выводит строки верхнего и нижнего регистра.

```java
class Andriyanov_b {
    // Объявление класса Andriyanov_b.
    static void register_bukv() { // Объявление статического метода register_bukv(), возвращающего целочисленное значение.

        Scanner scanner = new Scanner(System.in); // Создание объекта Scanner для считывания ввода пользователя из консоли.

        System.out.print("Введите строку: "); // Вывод текста для запроса ввода строки.
        String input = scanner.nextLine(); // Считывание строки, введенной пользователем, и сохранение в переменную input.

        String Verhniy = input.toUpperCase(); // Преобразование строки input в верхний регистр и сохранение в переменную Verhniy.
        String Nigniy = input.toLowerCase(); // Преобразование строки input в нижний регистр и сохранение в переменную Nigniy.

        System.out.print("Верхний регистр: " + Verhniy + "\n"); // Вывод строки верхнего регистра.
        System.out.print("Нижний регистр: " + Nigniy); // Вывод строки нижнего регистра.

    }
}
```

Этот класс принимает строку от пользователя, преобразует ее в верхний и нижний регистр и выводит результаты.





### Класс `Shumskiy_C`

- Метод `znaki_prep()` принимает ввод пользователя, проходит по каждому символу в строке и проверяет, является ли он специальным символом. Если символ не является специальным, он добавляется в строку вывода. В конце метод выводит полученную строку без специальных символов.

```java
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
```

Этот класс удаляет все знаки препинания и служебные символы (кроме пробела) из введенной строки.

### Класс `Main`

Этот класс содержит метод `main`, который является основной точкой входа в программу. Он запрашивает у пользователя выбор задания (a, b или c) и выполняет соответствующую операцию. Программа продолжает выполняться до тех пор, пока пользователь не выберет выход ('q').

```java
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
```

Этот класс обеспечивает взаимодействие с пользователем, позволяя ему выбирать задание и выполнять соответствующие операции.

## Как пользоваться программой

1. Запустите программу.
2. Введите букву задания (a, b или c) или 'q' для выхода.
3. В соответствии с выбранным заданием программа выполнит необходимую операцию.





# Program for processing strings (ENG)

This repository contains a Java program that performs various operations on input strings. The program was developed by three developers:

- **Andrey Nalitov** `Nalitov_a` counting the number of vowels in a line.
- **Andriyanov Vlad** `Andriyanov_b` converts all letters of the string to upper and lower case.
- **Shumskiy Ilya** `Shumskiy_C` removes all punctuation marks and service characters (except space) from the entered string.


## Description of each class

### Class `Nalitov_a`



- The `str_in_and_out()` method accepts user input, calls the count method and prints the result.

```java
static void str_in_and_out() {
     System.out.print("Enter the string: ");

     Scanner scanner = new Scanner(System.in); // Create a Scanner object to read keyboard input
     String input = scanner.nextLine(); // Read the entered string

     int out = count_glasnih(input); //call the vowel counting function
     // Output the result of counting vowels
     System.out.print("Number of vowels in line = " + out);
}
```
- The `count_glasnih(String input)` method is needed to count vowels in a string. Takes a string as an argument and returns the number of vowels in that string.
```java
   public static int count_glasnih(String input) {
     int count = 0; // variable to store the number of vowels
     input = input.toLowerCase(); // string to lower case

     String glasnie = "aeiouy"; // all vowels

     // Go through each character
     for (int i = 0; i < input.length(); i++) {
         char x = input.charAt(i);
         // Check if the current character is a vowel
         if (glasnie.contains(String.valueOf(x))) {
             count++; // increase the counter
         }
     }

     return count; // Return the number of vowels
}
```


### Class `Andriyanov_b`

- The `register_bukv()` method creates a Scanner object to read user input from the console. It then prompts the user to enter a string. Converts the input string to upper and lower case using the `toUpperCase()` and `toLowerCase()` methods. Finally, it outputs upper and lower case strings.

```java
class Andriyanov_b {
     // Declaration of the class Andriyanov_b.
     static void register_bukv() { // Declaration of a static method register_bukv() that returns an integer value.

         Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input from the console.

         System.out.print("Enter the string: "); // Print text for a string input request.
         String input = scanner.nextLine(); // Read the string entered by the user and store it in the input variable.

         String Verhniy = input.toUpperCase(); // Convert the input string to upper case and store it in the Verhniy variable.
         String Nigniy = input.toLowerCase(); // Convert the input string to lowercase and save it to a Nigniy variable.

         System.out.print("Upper case: " + Verhniy + "\n"); // Output an uppercase string.
         System.out.print("Lowercase: " + Nigniy); // Print lowercase string.

     }
}
```

This class takes a string from the user, converts it to upper and lower case, and prints the results.





### Class `Shumskiy_C`

- The `znaki_prep()` method takes user input, goes through each character in the string and checks whether it is a special character. If the character is not special, it is added to the output line. At the end, the method displays the resulting string without special characters.

```java
class Shumskiy_C {
     static void znaki_prep() {
         Scanner scanner = new Scanner(System.in); // Create a Scanner for keyboard input
         System.out.print("Enter the string: ");
         String input = scanner.nextLine();
         String znaki = ".,-_/?!+*:;()<>^"; // A string with special characters that we want to remove
         String lived = "";
         for (int i = 0; i < input.length(); i++) { // Loop through each character in the input string
             char x = input.charAt(i);
             if (znaki.contains(String.valueOf(x))) { // If the character is special, skip it
                 continue;
             } else { // otherwise add it to the line without special characters
                 vivod = new StringBuilder().append(vivod).append(x).toString();
             }
         }
         System.out.print(vivod);

     }
}
```

This class removes all punctuation and symbols (except space) from the input string.

### Class `Main`

This class contains a `main` method, which is the main entry point to the program. It asks the user to select a job (a, b or c) and performs the corresponding operation. The program continues to run until the user selects exit ('q').

```java
class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         char zadanie;

         do {
             System.out.println();
             System.out.println();
             System.out.print(
                     "[a] Nalitov Andrey |Counting the number of vowels in a string|\n" +
                     "[b] Andriyanov Vlad |Ghosting all letters to upper and lower case|\n" +
                     "[c] Shumsky Ilya |Removing all punctuation marks and service characters (except space) from a string|\n\n" +
                     "Enter job letter or 'q' to exit: "
             );
             zadanie = scanner.nextLine().charAt(0);

             switch(zadanie) {
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
                     System.out.println("Exit the program.");
                     break;
                 default:
                     System.out.println("Wrong choice. Try again.");
             }
         } while (zadanie != 'q');

     }
}
```

This class provides user interaction by allowing the user to select a task and perform the appropriate operations.

## How to use the program

1. Launch the program.
2. Enter the job letter (a, b or c) or 'q' to exit.
3. In accordance with the selected task, the program will perform the necessary operation.
