import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue1 {
    public static void main(String[] args) {
        Deque<String>dq=new ArrayDeque<>();
        dq.addLast("One");
        dq.addLast("two");
        dq.addLast("three");
        dq.addLast("four");
        dq.addLast("five");
        dq.addLast("six");
        dq.addFirst("Varsha");
        dq.addFirst("Mansi");
        System.out.println(dq);

        dq.peek();
        System.out.println("Peek:"+dq.peek());
        System.out.println("Peek First:"+dq.peekFirst());
        System.out.println("Peek last:"+dq.peekLast());

        System.out.println(dq.getClass());

        System.out.println("Getfirst:"+dq.getFirst());
        System.out.println("Getlast:"+dq.getLast());

        dq.offer("Start");
        System.out.println("Offer:"+dq);

        dq.offerFirst("StartFirst");
        System.out.println("OfferFirst:"+dq);

        dq.offerLast("End");
        System.out.println("Offer last:"+dq);

        System.out.println("Poll:"+dq.poll());
        System.out.println("After poll"+dq);

        System.out.println("Empty:"+dq.isEmpty());
        
        System.out.println("Size:"+dq.size());

        System.out.println(dq.contains("Mansi"));



    }
    
}
