package GFG;  //insertFront, insertRear,deleteFirst, deleteRear, getFirst, getRear, isFull,isEmpty, size

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class DequeMethods {
    public static void main(String [] args){
        Deque<Integer> d1= new ArrayDeque<>();  //deque declaration
        Deque<Integer> d2= new LinkedList<>();

        d1.offerFirst(10); //add first, return boolean , false
        d2.addFirst(10);  //throws exception

        d1.offerLast(20);  //add last, return boolean  , false
        d2.addLast(20);  //throws exception

        d1.offerFirst(5);
        d2.addFirst(5);

        d1.offerLast(15);
        d2.addLast(15);

        d1.pollFirst(); //to remove first, return int , null
        d2.removeFirst(); //throws exception

        d1.pollLast(); //to remove last , return int , null
        d2.removeLast(); //throws exception

        System.out.println(d1.peekFirst());   //return first element, int  , null
        System.out.println(d2.getFirst());   //throws exception


        System.out.println(d1.peekLast());   // return last element, int , null
        System.out.println(d2.getLast()); // throws exception

        Iterator it1= d1.iterator() ;   //traverse from first to last
        while(it1.hasNext()){
            System.out.println(it1.next()+" ");
        }
        System.out.println();

        for(int x:d2){   //traverse the deque first to last
            System.out.println(x+" ");
        }
        System.out.println();

        Iterator it2= d1.descendingIterator();   //traverse from first to last
        while(it2.hasNext()){
            System.out.println(it2.next()+" ");
        }
        System.out.println();


    }
}
