public class IntersectionNode{

    public class ListNode {
        int val;
        ListNode next;
         ListNode(int x) {
        val = x;
        next = null;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int size1 = 0;
        int size2 = 0;

        while(temp1!=null){
            size1++;
            temp1 = temp1.next;
        }

        while(temp2!=null){
            size2++;
            temp2 = temp2.next;
        }

        temp1 = headA;
        temp2 = headB;
        if(size1 > size2){
            int m = size1 - size2;
            for(int i=1; i<=m; i++){
                temp1 = temp1.next;
            }
        }
        else{
            int n = size2 - size1;
            for(int i=1; i<=n; i++){
                temp2 = temp2.next;
            }
        }

        while(temp1!=temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}
}