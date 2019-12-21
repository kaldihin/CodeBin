package holding;

import java.util.*;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();
        Random rand = new Random(56);

        for (int i = 0; i < 10; i++)
            priorityQueue.offer(rand.nextDouble());

        while (priorityQueue.peek() != null)
            System.out.print(priorityQueue.poll() + " ");
        System.out.println();

    }
}
