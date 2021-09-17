package ru.geekbrains.java_algoritms_homework_4;

public class LinkedQueue<T> { // Класс, реализующий очередь с помощью linkedList
    private MyLinkedList<T> list;

    public LinkedQueue() {
        list = new MyLinkedList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return list.isFull();
    }

    public int size() {
        return list.size();
    }

    public void insert(T item) {
        list.insertFirst(item);
    }

    public T peek() {
        return list.getLast();
    }

    public T remove() {
        return list.removeLast();
    }
}
