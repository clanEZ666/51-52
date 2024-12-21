package DZ5152.Djeneriki;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomMutableClass customMutable = new CustomMutableClass(10);
        List<Integer> numbers = List.of(1, 2, 3, 4);

        ImmutableClass immutable = new ImmutableClass("Example", numbers, customMutable);

        numbers.add(5);
        customMutable.setValue(20);

        System.out.println("Immutable name: " + immutable.getName());
        System.out.println("Immutable numbers: " + immutable.getNumbers());
        System.out.println("Immutable custom value: " + immutable.getCustomMutableClass().getValue());


        java.util.Map<ImmutableClass, String> map = new java.util.HashMap<>();
        map.put(immutable, "Иммутабельный  объект");
        System.out.println("Значение мапы: " + map.get(immutable));
    }
}
