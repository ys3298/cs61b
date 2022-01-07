class IntList {
    int value;
    IntList next;

};

// change list to list->newL
public static void AddBack(IntList list, IntList newL) {
    while (list.next != null) {
        list = list.next;
    }
    list.next = newL;
}

public static IntList[] partition(IntList lst, int k) {
    IntList[] array = new IntList[k];
    int index = 0;
    IntList L = lst;
    int i = 0;
    while (L != null) {
        AddBack(array[i % k], L);
        i += 1;
        L = L.next;
    }
    return array;
}