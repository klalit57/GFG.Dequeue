package GFG;

class DequeArr{
    int [] arr;
    int size;
    int cap;
    int front;

    DequeArr(int c){
        arr= new int[cap];
        size=0;
        cap=c;
        front=0;
    }
    int getFront(){
        if(isEmpty()){
            return -1;
        }
        return front;
    }

    int getRear(){
        if(isEmpty()){
            return -1;
        }
        return (front+size-1)%cap;
    }

    void insertFront(int x){
        if(isFull()){
            return;
        }
        front=(front-1+cap)%cap;
        arr[front]=x;
        size++;
    }
    void insertRear(int x){
        if(isFull()){
            return;
        }
        int newRear= (front+size)%cap;   //rear=(front+size-1)%cap
        arr[newRear]=x;
        size++;
    }
    void deleteFront(){
        if(isEmpty()){
            return;
        }
        front=(front+1)%cap;
        size--;
    }

    void deleteRear(){
        if(isEmpty()){
            return;
        }
        size--;
    }
    boolean isFull(){
        return size==cap;
    }
    boolean isEmpty(){
        return size==0;
    }
}

public class DequeArray {
}
