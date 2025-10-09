class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
        Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class LinkedListPractise {
    public static Node arrtoll(int[] arr){
        Node head = new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<=arr.length-1;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static void printarr(Node head){
        Node temp=head;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Node x= arrtoll(arr);
        System.out.println(x);
        printarr(arrtoll(arr));
    }   
}
