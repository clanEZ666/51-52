package Box;

public class Main {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<String>();
        System.out.println("Контейнер для строки пуст " + stringBox.isEmpty());

        stringBox.set("Hello, I box");
        System.out.println("Содержимое контейнера для строки: " + stringBox.get());
        System.out.println("Контейнер для строки пуст: " + stringBox.isEmpty());

        stringBox.clear();
        System.out.println("Контейнер для строки пуст после очистки:" + stringBox.isEmpty());


        Box<Integer> integerBox = new Box<Integer>();
        System.out.println("Контейнер для целого числа пуст: " + integerBox.isEmpty());

        integerBox.set(50);
        System.out.println("Содержимое контейнера для целого числа: " + integerBox.get());
        System.out.println("Контейнер для целого числа пуст: " + integerBox.isEmpty());

        integerBox.clear();
        System.out.println("Контейнер для целого числа пуст после очистки: " + integerBox.isEmpty());
    }

}

