package GFG;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

class DequeLL{
    Node front;
    Node rear;
    int size;
    DequeLL(){
        front=null;
        rear=null;
        size=0;
    }
    void insertRear(int x){
        Node newNode= new Node(x);

        if(front==null){
          front=newNode;
          rear=newNode;
        }else{
            rear.next=newNode;
            newNode.prev=rear;
            rear=newNode;
        }
        size++;
    }

    void insertFront(int x){
        Node newNode= new Node(x);

        if(front==null){
            front=newNode;
            rear=newNode;
        }else{
            front.prev=newNode;
            newNode.next=front;
            front=newNode;
        }
        size++;
    }

    void deleteFront(){
        if(front==null){
            return;
        }
        front= front.next;
        front.prev=null;
        size--;
    }
    void deleteRear(){
        if(rear==null){
            return;
        }
        rear=rear.prev;
        rear.next=null;
        size--;
    }

    int getFront(){
        if(front==null){
            return -1;
        }
      return front.data;
    }

    int getRear(){
        if(rear==null){
            return -1;
        }
        return rear.data;
    }
    int getSize(){
        return size;
    }
    boolean isEmpty(){
        return size==0;
    }
}
public class DequeLinkedList {

}
