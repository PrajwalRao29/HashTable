import java.util.Scanner;

public class HashTableMain {
    static MyLinkedList l = new MyLinkedList();

    public void assignValue(String[] words) {
        for (String word : words) {
            if (l.search(word)) {
                MyNode temp = l.head;
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
                l.add(word, 1);
            }
        }
    }


    public static void main(String args[]) {
        HashTableMain h = new HashTableMain();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String s = sc.nextLine();
        String words[] = s.split("\\s+");
        h.assignValue(words);
        h.l.print();
    }
}
