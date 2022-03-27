import java.io.IOException;

public class reverse {
    static class Node{
        public int data;
        public Node next;
        public Node(int nodeData){
            this.data=nodeData;
            this.next=null;
        }
    }
    static class linkedlist{
        Node head;
        public linkedlist(){
            this.head=null;
        }
        public void insertNode(int nodeData) {
            Node newnode = new Node(nodeData);
            if (this.head != null) {
                newnode.next = head;
            }
            this.head = newnode;
        }
        public void disply() {

        }
        static Node reverse(Node head) {
            if (head == null) {
                return head;

            }
            if (head.next == null) {
                return head;
            }
            Node newHeadNode = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return newHeadNode;
        }
            public static void main(String[] args){
                linkedlist list=new linkedlist();
                list.insertNode(44);
                list.insertNode(77);
                list.insertNode(88);
                list.insertNode(70);


            }


        }
    }
}
