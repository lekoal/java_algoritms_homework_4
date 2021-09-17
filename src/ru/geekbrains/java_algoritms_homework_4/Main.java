/*
Алгоритмы и структуры данных на Java
Практическое задание к лекции № 4
Кононов Леонид Александрович
Согласно заданию, в программе реализовано:
1. Очередь с использованием MyLinkedList;
2. Метод indexOf() в классе MyLinkedList.
*/
package ru.geekbrains.java_algoritms_homework_4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> mll = new MyLinkedList<>();

        mll.insertFirst(5);
        mll.insertFirst(15);
        mll.insertFirst(25);
        mll.insertFirst(35);

//        System.out.println(mll.removeFirst());

        System.out.println(mll);
        System.out.println(mll.indexOf(25)); // Поиск индекса по значению
        System.out.println(mll.indexOf(5));
        System.out.println(mll.indexOf(45));

        System.out.println();

        LinkedQueue<Integer> myQueue = new LinkedQueue<>();
        myQueue.insert(2);
        myQueue.insert(12);
        myQueue.insert(9);
        myQueue.insert(24);
        myQueue.insert(31);

        System.out.println("Last element of queue: " + myQueue.peek());
        System.out.println("Last element of queue " + myQueue.remove() + " is deleted");
        System.out.println("Last element of queue: " + myQueue.peek());

//        mll.insertLast(2);
//        mll.insertLast(22);
//
//        System.out.println(mll);
//
//        mll.insert(2, 777);
//        System.out.println(mll);
////        System.out.println(mll.removeFirst());
////        System.out.println(mll);
////        System.out.println(mll.removeLast());
////        System.out.println(mll);
//
//        mll.insert(2, 111);
//        mll.insert(2, 22);
//        System.out.println(mll);
////
//        System.out.println(mll.remove(22));
//        System.out.println(mll);
//
//        for (Integer x : mll) {
//            System.out.println(x);
//        }
    }
}
