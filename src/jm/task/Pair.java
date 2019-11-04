package jm.task;

import java.sql.SQLOutput;
import java.util.Optional;

public class Pair<T, R> {

    public static void main(String[] args) {
        DynamicArray<String> arr = new DynamicArray<>(3);
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");
        arr.add("5");
        for (Object s : arr.arr) {
            System.out.println(s);
        }
    }

    public static class DynamicArray<T> {
        //Твой код здесь
        private Object[] arr;
        private int size;
        private int count = 0;

        public DynamicArray() {
            size = 10;
            this.arr = new Object[10];
        }

        public DynamicArray(int initialCapacity) {
            size = initialCapacity;
            this.arr = new Object[initialCapacity];
        }

        public void add(T el) {
            if (count >= size - 1) {
                System.arraycopy(arr, 0,
                        arr, size + 10,
                        size );
            }
            arr[count] = el;
            count++;
        }

        public void remove(int index) {
            arr[index] = null;
        }

        public T get(int index) {
            return (T) arr[index];
        }
    }
}
