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
    public static ListNode reverse(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
        ListNode next = curr.next;  
        curr.next = prev;       
        prev = curr;           
        curr = next;           
    }
    return prev; 
    }

    public static ListNode helper(ListNode l1, ListNode l2,ListNode L3,int carry) {
        if(l1==null && l2==null){
            if(carry==0){
                return L3;
            }else{
                ListNode temp2=new ListNode(1);
                temp2.next=L3;
                return temp2;
            }
        }
        int add;
        if(l1==null){
            add=l2.val+carry;
        }else{
            if(l2==null){
                add=l1.val+carry;
            }else{
                add=l1.val+l2.val+carry;
            }
        }

        ListNode temp = new ListNode();
        if((add)>9){
            temp.val = (add)%10;   
            carry=1;             
        }else{
            temp.val = (add)%10;
            carry=0;
        }
        temp.next=L3;
        if(l1==null){
        return helper(null,l2.next,temp,carry);  
        }else{
            if(l2==null){
                return helper(l1.next,null,temp,carry); 
            }else{
                return helper(l1.next,l2.next,temp,carry); 
            }
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = helper(l1, l2, null, 0);
        return reverse(temp);      
    }

    public static void main(String[] args) {
        int[] arr1={9,9,9,9,9,9,9};
        int[] arr2={9,9,9,9};
        ListNode n1 =arrtoll(arr1);
        ListNode n2 =arrtoll(arr2);
     
        ListNode out= addTwoNumbers(n1, n2);
        printarr(out);
    }
    
}
