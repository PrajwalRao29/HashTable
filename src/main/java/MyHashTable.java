import java.util.ArrayList;
import java.util.Scanner;

public class MyHashTable {

    final int bucket=9;
    static ArrayList<MyLinkedList> bucketArray=new ArrayList<>(10);

    public MyHashTable() {
        for(int i=0;i<10;i++)
        {
            bucketArray.add(null);
        }
    }

    public void assignValue(String[] words) {
        for (String word : words) {
            int index=getIndex(word);
            System.out.println(index);
            MyLinkedList m=bucketArray.get(index);
            if(m==null)
            {
                m=new MyLinkedList();
                bucketArray.set(index,m);
            }
            if (m.search(word)) {
                MyNode temp = m.head;
                while (temp!=null) {
                    if(!temp.key.equalsIgnoreCase(word))
                    {
                        temp = temp.next;
                    }
                    else
                    {
                        break;
                    }
                }
                temp.value=temp.value+1;
            } else {
                m.add(word, 1);
            }
        }
    }
    public int getIndex(String word)
    {
        int hashcode=Math.abs(word.hashCode());
        return hashcode%10;
    }

    public static void main(String[] args) {
        MyHashTable h=new MyHashTable();
        String str="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words=str.split(" ");
        h.assignValue(words);
        int index=0;
        for(MyLinkedList b:bucketArray)
        {
            System.out.println("INDEX ="+index);
            if(b!=null)
            b.print();
            else
                System.out.println("THIS INDEX IS EMPTY");
            index++;
        }
    }
}
