package com.dataStructure.array;
class ArrayFullException extends Exception {
    public ArrayFullException(String message) {
        super(message);
    }
}
class InvalidIndexException extends Exception {
    public InvalidIndexException(String message) {
        super(message);
    }
}
@SuppressWarnings("unchecked")
public class JinuArray<T> {
    private T[] array;
    private int size;
    private int capacity;

    public JinuArray(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }

    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void add(T element) throws Exception {
        if (size == capacity) {
            throw new ArrayFullException("배열이 꽉 차있어서 요소를 추가 할 수 없습니다.");
        }
        array[size] = element;
        size ++;
    }
    public void printArray(){
        if(size == 0){
            System.out.println("배열이 비어있습니다.");
            return;
        }else{
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
    public T get(int index) throws InvalidIndexException {
        if (index < 0 || index >= size) {
            throw new InvalidIndexException("유효하지 않은 인덱스입니다.");
        }
        return array[index];
    }
    public void remove(int index) throws Exception {
        if (index >= size) {
            throw new InvalidIndexException("유효하지 않은 인덱스입니다.");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
    }


}
