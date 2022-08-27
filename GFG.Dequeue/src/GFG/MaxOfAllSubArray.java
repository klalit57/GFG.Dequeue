package GFG;
import java.util.*;
public class MaxOfAllSubArray {

    static void printMaxSubArray1(int [] arr,int k){  //GFG Naive
        int n=arr.length;
        for(int i=0;i<n-k+1;i++){
          int max=arr[i];
          for(int j=i+1;j<i+k;j++){
              max=Math.max(arr[j],max);
          }
            System.out.print(max+" ");
        }
        System.out.println();
    }

    static void printMaxSubArray2(int [] arr,int k){  //gfg efficient using deque
        Deque<Integer> dq= new LinkedList<Integer>();
        int n=arr.length;
        int max= Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(int i=k;i<n;i++){
            System.out.print(arr[dq.peekFirst()]+" ");
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.print(arr[dq.peekFirst()]+" ");
    }

    public static void main(String [] args){
        int [] arr={10,8,5,12,15,7,6};
        printMaxSubArray1(arr, 3);
        printMaxSubArray2(arr, 3);
    }
}
