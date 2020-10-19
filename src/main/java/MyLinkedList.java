public class MyLinkedList {
    public MyNode head;

    public void add(String key,int value) {
        MyNode node=new MyNode(key,value);
        if (this.head == null) {
            this.head = node;
        } else {
            MyNode temp=this.head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
        }
    }

    public void print() {
        MyNode n = this.head;
        while (n != null) {
            System.out.print("WORD = "+ n.key +" NO. OF TIMES OCCURED = "+n.value);
            System.out.println();
            n = n.next;
        }
    }

    public boolean search(String key) {
        if(head==null)
            return false;
        MyNode temp = this.head;
        while (temp != null) {
            if (temp.key.equals(key))
                return true;
            temp = temp.next;
        }
        return false;
    }
}

