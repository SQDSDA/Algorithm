package duilie;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;
public class testQueue {
    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        queue.offer(1);
        System.out.println(queue.peek()== 1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue);

    }
}
