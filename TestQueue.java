import java.util.Random;

public class TestQueue {

    public static void main(String[] args) {
        // tests queues

        Queue c = new Queue();

        if (c.isEmpty())
            System.out.println("empty queue!"); // it should!

        try {
            for (int i = 0; i < 10; i++) {
                c.insert(i);
            }
            c.print();

            int extracted = 1;
            System.out.println("removing " + extracted + " elements");
            for (int i = 0; i < extracted; i++) {
                c.extract(); // throws an exception
            }
            c.print();

            //System.out.println("popping first list");
            //c.lpop();
            //c.print();

            System.out.println("reversing list");
            c.revolution();
            c.print();

        }

        catch (EmptyQueueException e) {
            System.out.println("EXCEPTION! empty queue");
        }

        // c.insert(77);
        // c.insert(99);
        // c.revolution();
        // System.out.println (c.extract()); //prints 99

} }
