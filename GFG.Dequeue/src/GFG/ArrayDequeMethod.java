package GFG;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayDeque;

public class ArrayDequeMethod {
    public static void main(String [] args){

        //stack implementation
        ArrayDeque<Integer> adStack= new ArrayDeque<Integer>();
        adStack.push(10);  //push on top
        adStack.push(20);  //push on top

        System.out.println(adStack.peek());  //peek top element , throw exception
        System.out.println(adStack.pop());   //remove last element, throw exception


        //Queue implementation
        ArrayDeque<Integer> adQueue1= new ArrayDeque<Integer>();
        adQueue1.offer(10);
        adQueue1.offer(20);

        System.out.println(adQueue1.peek());
        System.out.println(adQueue1.poll());

        System.out.println(adQueue1.peek());
        adQueue1.offer(40);

        System.out.println(adQueue1.peek());


        ArrayDeque<Integer> adQueue2= new ArrayDeque<Integer>();
        adQueue2.add(10);
        adQueue2.add(20);

        System.out.println(adQueue2.element());
        System.out.println(adQueue2.remove());

        System.out.println(adQueue2.element());
        adQueue2.add(40);

        System.out.println(adQueue2.element());


        //Deque implementation
        ArrayDeque<Integer> adQueue3= new ArrayDeque<Integer>();
        adQueue3.offerFirst(10);
        adQueue3.offerLast(20);
        adQueue3.offerFirst(30);
        adQueue3.offerLast(40);

        System.out.println(adQueue3.peekFirst());
        System.out.println(adQueue3.pollFirst());

        System.out.println(adQueue3.peekLast());
        adQueue3.offer(40);

        System.out.println(adQueue3.peekLast());
        System.out.println(adQueue3.pollLast());


        //ArrayDeque as ArrayDeque
        ArrayDeque<Integer> dq= new ArrayDeque<Integer>();
        dq.add(10);
        dq.add(20);
        dq.add(40);

        System.out.println(dq);
        }
}
