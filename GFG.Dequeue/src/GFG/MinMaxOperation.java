package GFG;
import java.util.*;

class MinMaxDS{
    Deque<Integer> dq;
    MinMaxDS(){
        dq= new LinkedList<Integer>();
    }
    void insertMin(int x){
        dq.offerFirst(x);
    }
    void insertMax(int x){
        dq.offerLast(x);
    }
    int getMin(){
        return dq.peekFirst();
    }
    int getMax(){
        return dq.peekLast();
    }
    int extractMin(){
        return dq.pollFirst();
    }
    int extractMax(){
        return dq.pollLast();
    }
}

public class MinMaxOperation {
    public static void main(String [] args){

    }
}
