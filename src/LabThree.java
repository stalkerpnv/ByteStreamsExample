import java.util.Scanner;

/*Ввести с клавиатуры список из n целых чисел.
а) Найти сумму, количество и среднее значение среди чисел, которые не делятся на 5.
б) Найти среди отрицательных чисел, которые не делятся на 5, минимальное и
максимальное значения и их номера и поменять их местами.*/
class Node{
    int value;
    Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
public class LabThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n");
        int n = sc.nextInt();
        Node head = new Node(sc.nextInt(),null);
        Node tail = head;
        for (int i = 0; i < n-1; i++) {
            tail.next = new Node(sc.nextInt(),null);
            tail = tail.next;
        }
        Node ref = head;
        while (ref!=null){
            System.out.print(ref.value + " ");
            ref = ref.next;
        }

        System.out.println();
        ref = head;
        while (ref!=null){
            System.out.print(ref + "->");
            ref = ref.next;
        }
    }
}
