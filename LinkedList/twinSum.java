public class twinSum {
   
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
            }
        }

        public static int maxTwinSum(Node head){
           //middle 
           Node slow = head;
           Node fast = head;
           while(fast.next!=null && fast.next.next!=null){
              slow = slow.next;
              fast = fast.next.next;
           }

           //reverse after middle
           Node curr = slow.next;
           Node prev = null;
           Node after = null;
           while(curr!=null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
           }
           slow.next = prev;

           //finding max twin sum
           Node temp1 = head;
           Node temp2 = slow.next;
           int maxSum = 0;
           while(temp2!=null){
            int currSum = temp1.data + temp2.data;
            maxSum = Math.max(maxSum, currSum);
            temp1 = temp1.next;
            temp2 = temp2.next;
           }
           return maxSum;
        }
    
        public static void main(String[] args) {
            Node a = new Node(1);
            Node b = new Node(10);
            Node c = new Node(13);
            Node d = new Node(4);
            Node e = new Node(5);
            Node f = new Node(6);
    
            a.next = b; 
            b.next = c; 
            c.next = d;
            d.next = e;
            e.next = f; 
            System.out.println(maxTwinSum(a));

        }
    }
    

