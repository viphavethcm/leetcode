package DataStructure;

public class LinkedList {
    public static void main(String[] args) {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);
        print(node1);
        System.out.println("Thêm vào đầu node");
        ListNode newNode = addToHead(node1,0);
        print(newNode);
        System.out.println("Thêm vào cuối node");
        ListNode newNode1 = addToTailLast(node1,4);
        print(newNode1);

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void print(ListNode head)
    {
        if (head != null){
            ListNode tmp = head;
            while (tmp != null)
            {
                System.out.print(tmp.val);
                tmp = tmp.next;
                if (tmp != null)
                    System.out.print("->");
                else
                    System.out.println();
            }
        }
    }

    public static ListNode addToHead(ListNode headNode,int val)
    {
        ListNode newNode = new ListNode(val);
        if (headNode != null)
        {
            newNode.next = headNode;
        }
        return newNode;
    }

    public static ListNode addToTailLast(ListNode headNode,int val)
    {
        ListNode newNode = new ListNode(val);
        if (headNode != null)
        {
            ListNode lastNode = headNode;
            //Xác định last node
            while (lastNode.next != null)
            {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;

        }
        return headNode;
    }
}
