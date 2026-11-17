import java.util.*;
public class qipmva {
    private int[] arr;
     private int f;
    private int r;
    int size;
    qipmva(int capacity) {
        arr = new int [capacity];
    }
    void add(int val) {
        if(size==arr.length){
            System.out.println("Queue is full");
            return;
        }
        arr[r++] = val;
        if(r==arr.length) r=0;
        size++;
    }
    int remove() {
        if(size==0) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int frontVal = arr[f];
        f++;
        if(f==arr.length) f=0;
        size--;
        return frontVal;
    }
    int peek(){
        if(size==0) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[f];
    }
    void display(){
        if(size==0) return;
        if(f>r){

        }
        else {
            for (int i=f; i<r; i++) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    public static void main (String args[]) { 
        queue q= new queue(5);
        q.add(10); q.add(20); q.add(30);
        q.display();
        System.out.println(q.remove());
        q.display();
        q.add(40); q.add(50);
        q.display();
        
    }
}
