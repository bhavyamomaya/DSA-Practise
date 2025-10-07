class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }




 public class sub{
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
        System.out.println(num1+" s;lkd;'ls"+num2);
        ListNode head=null;
        int add=num1+num2;
        while(add>0){
            ListNode newnode = new ListNode(add%10);
            newnode.next=head;
            head=newnode;
            add=add/10;
        }
    System.out.println(head.val +""+(head.next).val+""+(head.next.next).val+"");
        return head;    
        
    }
    public static void main(String[] args) {
        ListNode node111 = new ListNode(2);
        ListNode node11 = new ListNode(4, node111);
        ListNode node1 = new ListNode(5, node11);
        ListNode node222 = new ListNode(6);
        ListNode node22 = new ListNode(4, node222);
        ListNode node2 = new ListNode(1, node22);
        addTwoNumbers(node1,node2);       
    }

 }