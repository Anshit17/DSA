// Problem: Reverse Linked List
// Platform: LeetCode
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(1)

public class reverseList {

        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
            }
        }
    
        public static void display(Node head){
           if(head==null) return;
           System.out.print(head.data +" ");
           display(head.next);
        }

        public static void displayRev(Node head){
           if(head==null) return;
           displayRev(head.next);
           System.out.print(head.data +" ");
        }

        //recursive
        // public static Node reverseList(Node head){
        //     if(head.next== null) return head;
        //     Node newHead = reverseList(head.next);
        //     head.next.next = head;
        //     head.next = null;
        //     return newHead;
        // }

        //iterative
        public static Node reverseList(Node head){
            Node curr = head;
            Node prev = null;
            Node agla = null;
            while(curr!=null){
               agla = curr.next;
               curr.next = prev;
               prev = curr;
               curr = agla;
            }
            return prev;
        }
        public static void main(String[] args) {
            Node a = new Node(3);
            Node b = new Node(5);
            Node c = new Node(1);
            Node d = new Node(2);
            Node e = new Node(4);
            a.next = b; 
            b.next = c; 
            c.next = d;
            d.next = e;
            display(a);
            System.out.println();
            display(reverseList(a)); 
        }
    }
    

