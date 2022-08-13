package ss10_stack_queue.pratice.stackInLinkedList.model;
import java.util.EmptyStackException;
import java.util.LinkedList;
public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    // phương thức push
    //thêm) một phần tử dữ liệu mới vào trên ngăn xếp
    public void push(T element) {
        stack.addFirst(element);
    }

    // phương thức pop
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    // phương thức size
    public int size() {
        return stack.size();
    }

    // phương thức isEmpty
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
