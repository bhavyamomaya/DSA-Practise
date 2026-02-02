class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Merge2sortedlist {
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

    public static ListNode helper(ListNode list1, ListNode list2,ListNode out,ListNode mover){
        if(list1 ==null){
            
        }
        if(list2 == null){

        }
        if(list1.val>list2.val){

        }


    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {


    }
     
    public static void main(String[] args){
        int[] arr1= {1,2,4};
        int[] arr2 ={1,3,4};

        ListNode n1=arrtoll(arr1);
        ListNode n2= arrtoll(arr2);
    }
    
}
