package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.add(firstQueue.poll());
        deque.add(firstQueue.poll());

        deque.add(secondQueue.poll());
        deque.add(secondQueue.poll());

        while (!firstQueue.isEmpty()) {
            firstQueue.add(deque.pollLast());
            deque.add(firstQueue.poll());
            deque.add(firstQueue.poll());

            secondQueue.add(deque.pollLast());
            deque.add(secondQueue.poll());
            deque.add(secondQueue.poll());
        }

        return deque;
    }
}
