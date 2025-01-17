import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Permutation {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        RandomizedQueue<String> queue = new RandomizedQueue<>();

        while (!StdIn.isEmpty()) {
            String str = StdIn.readString();
            queue.enqueue(str);

            if (queue.size() > k) {
                queue.dequeue();
            }
        }

        while (!queue.isEmpty()) {
            StdOut.println(queue.dequeue());
        }
    }
}
