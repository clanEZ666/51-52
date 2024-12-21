package Box;

public class Box<T> {

    private T item;


    public Box() {
        this.item = null;
    }

    public T get() {
        return item;
    }

    public void set(T item) {
        this.item = item;
    }

    public boolean isEmpty() {
        return item == null;
    }

    public void clear() {
        item = null;
    }

}
