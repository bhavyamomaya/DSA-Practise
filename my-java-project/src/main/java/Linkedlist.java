import java.util.*;
 class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
            this.data=data1;
            this.next=next1;
    }
    Node(int data1){
        this.data=data1;
    }
}
public class Linkedlist{
    public  static Node delelem(Node head,int k){
        if(head==null){return null;}
        if(k==1){
            head=head.next;
            return head;
        }
        Node temp = head;
        int count=0;Node prev=null;
        while(temp.next!=null){
            count++;    
            if(count == k){
                prev.next=prev.next.next;
                return head;
            }
            prev=temp;
            temp=temp.next;
        }
        if(count+1==k){
            prev.next=null;
        }
        return head;
    }
    public static  Node arrtoll(int[] arr){
        Node head=new Node(arr[0],null);
        Node current=head;
        for(int i=1;i<=arr.length-1;i++){
           current.next=new Node(arr[i]);
           current= current.next;     
        }
            return head;
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static Node Insertll(Node head,int position,int value){
        if(head==null){
            if(position==1){
            Node x= new Node(value);
            return x;
        }
            else{
                return null;
            }
        }
        if(position==1){
            Node x= new Node(value);
            x.next=head;
            return x;

        }
        Node temp = head;
        int count=0;
        while(temp!=null){
            count++;
            if(count==position-1){
                Node x=new Node(value);
                x.next=temp.next;
                temp.next=x;
                return head;
               
            }
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        Node h=arrtoll(arr);
        printList(h);
        printList(delelem(h,7));
        printList(Insertll(null, 1, 500));
    }  
}