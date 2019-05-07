import java.util.*;
class TestDeque
{
public static void main(String[] args)
{
Deque<Integer> dq=new LinkedList<Integer>();

dq.offer(1);
dq.addFirst(2);
dq.addLast(3);
dq.offerLast(4);//same as offer but being preferred because we are designing a deque
System.out.println(dq);

System.out.println(dq.getFirst());
System.out.println(dq.peekFirst());
System.out.println(dq.getLast());
System.out.println(dq.peekLast());
System.out.println(dq);

dq.removeFirst();
dq.removeLast();
System.out.println(dq);

System.out.println(dq.pollFirst());
System.out.println(dq.pollLast());
System.out.println(dq);


System.out.println(dq.pollFirst());
System.out.println(dq.pollLast());


System.out.println(dq.removeFirst());
System.out.println(dq.removeLast());
}
}