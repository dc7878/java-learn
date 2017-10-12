package cc.dc.structure;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {
    Queue<Integer> queue1 = new ArrayDeque<>();
    Queue<Integer> queue2 = new ArrayDeque<>();

    public void push(int data) {
        queue1.add(data);
    }

    public int pop() {
        int data = -1;
        while (queue1.size() != 0){
            if (queue1.size() == 1) {
                data = queue1.poll();
                while (queue2.size() !=0) {
                    queue1.add(queue2.poll());
                }
                return data;
            }
            queue2.add(queue1.poll());
        }
        return data;
    }

    public static void main(String[] args) {
        QueueTest test = new QueueTest();
        test.push(1);
        test.push(2);
        test.push(3);
        System.out.println(test.pop());
        System.out.println(test.pop());
        System.out.println(test.pop());
    }
}
