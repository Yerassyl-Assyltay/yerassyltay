import java.util.LinkedList;

public class week12 {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        for (int i = 0; i < 50; i++) {
            list.add(i);
        }
        list.set(1, 54);
        list.set(23, 65);
        System.out.println(list.contains(45));
        System.out.println(list.get(0));
        list.get(32);
        System.out.println(list.indexOf(3));
        System.out.println(list.lastIndexOf(5));
    }
}
class MyLinkedList<E> {
    private LinkedList<E> list;

    public MyLinkedList() {
        list = new LinkedList<>();
    }

    public boolean contains(E element) {
        if (list.size() == 0) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == element) {
                return true;
            }
        }
        return false;
    }

    public E get(int index) {
        if (list.size() - 1 <= index) {
            return null;
        }
        return list.get(index);
    }

    public int indexOf(E e) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == e) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(E e) {
        int pos = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == e) {
                return pos;
            }
            pos++;
        }
        return -1;
    }

    public E set(int index, E e) {
        if (list.get(index) == null) {
            return null;
        }
        return list.set(index, e);
    }

    public void add(E e) {
        list.add(e);
    }
}
