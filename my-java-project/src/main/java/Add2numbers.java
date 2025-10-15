class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Add2numbers {
    public static ListNode arrtoll(int[] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode mover=head;
        for(int i=1;i<=arr.length-1;i++){
            ListNode temp=new ListNode(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }

    public static void printarr(ListNode head){
        ListNode temp=head;
        while(temp.next!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println(temp.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1=0;
        int num2=0;
        int count1=0;
        int count2=0;
        ListNode current = l1; 
        ListNode current2 = l2; 
        while (current != null) {
            num1=num1 + (current.val * (int)Math.pow(10, count1));
            current = current.next;    
            count1++;       
        }
        while(current2!= null){
            num2=num2 +(current2.val * (int)(Math.pow(10,count2)));
            current2=current2.next;
            count2++;
        }
        ListNode head=null;
        int add=num1+num2;
        

        while(add>0){
            ListNode newnode = new ListNode(add%10);
            newnode.next=head;
            head=newnode;
            add=add/10;
        }
        return head;       
    }

    public static void main(String[] args) {
        int[] arr1={2,4,3};
        int[] arr2={5,6,4};
        ListNode n1 =arrtoll(arr1);
        ListNode n2 =arrtoll(arr2);
     
        ListNode out= addTwoNumbers(n1, n2);
        printarr(out);
    }
    
}
