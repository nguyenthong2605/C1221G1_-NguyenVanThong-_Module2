package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist_theo_thu_vien_java_util_arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;

    private static final int DEFAULT_CAPACITY = 10;

    public Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) throws IllegalAccessException {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalAccessException("capacity: " + capacity);
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean add(E e) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public boolean add(E e, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("Index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = e;
            size++;
        } else {
            for (int i = size + 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = e;
            size++;
        }
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    //lấy phần tử về tại vị trí index
    public E get(int index) {
        return (E) elements[index];
    }

    //phương thức lấy chỉ số index trong mảng của phần tử nhập vào
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    //phương thức kiểm tra 1 phần tử có trong mảng hay không
    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }

    //phương thức tạo ra 1 bảng sao của Mylist hiện tại
    public MyList<E> clone() {
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(elements, size);
        v.size = this.size;
        return v;
    }

    // xoá 1 phần tử tại vị trí index
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;

    }
}

