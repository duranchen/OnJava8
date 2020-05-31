package onjava;
import java.util.ArrayDeque;
import java.util.Deque;

public class Stack<T> {
    private Deque<T> storage = new ArrayDeque<>();

    public T pop() {
        return storage.pop();
    }

    public void push(T v) {
        storage.push(v);
    }

    public T peek() {
        return storage.peek();
    }

    public String toString() {
        return storage.toString();
    }

    public boolean isEmpty()
    {
        return storage.isEmpty();
    }
}
