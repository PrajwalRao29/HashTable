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
    public boolean delete(String data) {
        if (!search(data)) {
            return false;
        }
        MyNode temp = head;
        while (temp.next.next!=null) {
            if(temp.next.key.equalsIgnoreCase(data))
            {
                break;
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return true;
    }

    public boolean search(String key) {
        MyNode temp = this.head;
        while (temp != null) {
            if (temp.key.hashCode()==key.hashCode())
                return true;
            temp = temp.next;
        }
        return false;
    }
}

