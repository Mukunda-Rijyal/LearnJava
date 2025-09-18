package com.intern.day5.morelessions.part2;

import java.util.LinkedList;
import java.util.Queue;

public class Q5 {

   Queue<String> queue = new LinkedList<>();

   public void enqueue(String value) {
       queue.add(value);
       System.out.println(value + " enqueued into queue");
   }

   public String dequeue() {
       if (isEmpty()) {
           System.out.println("Queue Underflow");
           return null;
       }
       return queue.remove();
   }

   public String peek() {
       if (isEmpty()) {
           System.out.println("Queue is empty");
           return null;
       }
       return queue.peek();
   }

   public boolean isEmpty() {
       return queue.isEmpty();
   }

   public int size() {
       return queue.size();
   }

   public static void main(String[] args) {
       Q5 q = new Q5();

       q.enqueue("A");
       q.enqueue("B");
       q.enqueue("C");

       System.out.println("Front element: " + q.peek());

       System.out.println("Dequeued: " + q.dequeue());
       System.out.println("Dequeued: " + q.dequeue());

       System.out.println("Queue size: " + q.size());
   }
}


