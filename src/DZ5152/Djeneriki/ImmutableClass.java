package DZ5152.Djeneriki;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ImmutableClass {
    private final String name;
    private final List<Integer> numbers;
    private final CustomMutableClass customMutableClass;

    public ImmutableClass(String name, List<Integer> numbers, CustomMutableClass customMutableClass) {
        this.name = name;
        this.numbers = new ArrayList<>(numbers);
        this.customMutableClass = new CustomMutableClass(customMutableClass.getValue());
    }

    public String getName() {
        return name;
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }

    public CustomMutableClass getCustomMutableClass() {
        return new CustomMutableClass(customMutableClass.getValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableClass that = (ImmutableClass) o;
        return name.equals(that.name) && numbers.equals(that.numbers) && customMutableClass.equals(that.customMutableClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numbers, customMutableClass);
    }
}


