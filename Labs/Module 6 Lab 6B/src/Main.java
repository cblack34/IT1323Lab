/*
 * Name: Clayton Black
 * Date: 11-14-2019
 * Assignment Name: Module 6 Lab 6B
 * Assignment Brief: Linked List
 * Sources:
 * - Book Chapter 24
 */

public class Main {

    public static void main(String[] args) {
        Trivia t1 = new Trivia("Trivia Game 1", 1, 1.0, 2);
        Trivia t2 = new Trivia("Trivia Game 2", 2, 1.0, 2);
        Trivia t3 = new Trivia("Trivia Game 3", 3, 1.0, 2);
        Trivia t4 = new Trivia("Trivia Game 4", 4, 1.0, 2);
        Trivia t5 = new Trivia("Trivia Game 5", 5, 1.0, 2);

        System.out.println("Create Blank Linked List");
        TriviaLinkedList ll = new TriviaLinkedList();
        System.out.println(ll);
        printLinkedList(ll);

        System.out.println("Insert 5 Trivia objects");
        addAndPrint(ll, t5);
        addAndPrint(ll, t4);
        addAndPrint(ll, t3);
        addAndPrint(ll, t2);
        addAndPrint(ll, t1);

        System.out.println("Remove node by triviaGameID");
        ll.removeByID(3);
        printLinkedList(ll);

        System.out.println("Remove node that doesn't exist");

        Trivia removed = ll.removeByID(23);
        if (removed == null) {
            System.out.println("Node Does Not Exist");
        }
        printLinkedList(ll);
    }

    public static void printLinkedList(TriviaLinkedList ll){
        TriviaNode current = ll.head;

        System.out.print("\n{\n");
        while (current != null){
            System.out.println("\t" + current.element);
            current = current.next;
        }

        System.out.print("}\n\n");

    }

    public static void addAndPrint(TriviaLinkedList ll, Trivia t){
        ll.insert(t);
        System.out.println(ll);
        printLinkedList(ll);
    }
}
