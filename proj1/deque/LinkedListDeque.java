package deque;

public class LinkedListDeque <T> {
    public class Node {
        public T item;
        public Node next;
        public Node before;
        public Node (T i, Node n, Node m) {
            item = i;
            next = n;
            before = m;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public LinkedListDeque () {
        first = null;
        last = null;
        size = 0;
    }

    // 3.
    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }

    //1.
    public void addFirst (T item) {
        if (isEmpty()) {
            first = new Node(item, null, null);
            last = first;
        } else {
            first = new Node(item, first, null);
        }
        size += 1;
    }

    // 2.
    public void addLast(T item) {
        if (isEmpty()) {
            first = new Node(item, null, null);
            last = first;
        } else {
            last = new Node(item, null, null);
        }
        size += 1;
    }


    // 4.
    public int size() {
        return size;
    }

    // 5.
    public void printDeque() {
        if (isEmpty()) {
            System.out.println();
        } else {
            Node temp = first;
            while (temp.next != null) {
                System.out.print(temp.item);
                System.out.print(" ");
                temp = temp.next;
            }
            System.out.println(temp.item);
        }
    }

    // 6.
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        } else if (size() == 1) {
            T removed = last.item;
            last = null;
            first = null;
            size -= 1;
            return removed;
        } else {
            T removed = first.item;
            first = first.next;
            first.before = null;
            size -=1;
            return removed;
        }
    }

    // 7.
    public T removeLast() {
        if (isEmpty()) {
            return null;
        } else if (size() == 1) {
            T removed = last.item;
            last = null;
            first = null;
            size -= 1;
            return removed;
        }  else {
            T removed = last.item;
            last = last.before;
            last.next = null;
            size -= 1;
            return removed;
        }
    }

    // 8.
    public T get(int index) {
        if (isEmpty()) {
            return null;
        } else if (index > size()) {
            return null;
        } else {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.item;
        }
    }


    // 10.
    public boolean equals(Object o) {

    }


}
