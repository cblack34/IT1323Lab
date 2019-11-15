/*
 * Name: Clayton Black
 * Date: 11-14-2019
 * Assignment Name: Module 6 Lab 6B
 * Assignment Brief: Linked List
 * Sources:
 * - Book Chapter 24
 */

public class TriviaLinkedList {
    TriviaNode head, tail;
    private int size = 0;

    public TriviaLinkedList() {
    }

    public void addFirst(Trivia e){
        TriviaNode newNode = new TriviaNode(e);
        newNode.next = head;
        head = newNode;
        size++;

        if (tail == null){
            tail = head;
        }
    }

    public void addLast(Trivia e){
        TriviaNode newNode = new TriviaNode(e);

        if (tail == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void insert(Trivia e){
        insert(0, e);
    }

    public void insert(int index, Trivia e){
        if (index == 0){
            addFirst(e);
        } else if (index >= size){
            addLast(e);
        } else {
            TriviaNode cur = head;
            for (int i = 1; i < index; i++) {
                cur = cur.next;
            }
            TriviaNode tmp = cur.next;
            cur.next = new TriviaNode(e);
            (cur.next).next = tmp;
            size++;
        }
    }

    public Trivia removeFirst(){
        if (size == 0)
            return null;
        else {
            TriviaNode temp = head;
            head = head.next;
            size--;
            if(head == null){
                tail = null;
            }
            return temp.element;
        }
    }

    public Trivia removeLast(){
        if (size == 0){
            return null;
        } else if (size == 1){
            TriviaNode tmp = head;
            head = null;
            tail = null;
            size = 0;
            return tmp.element;
        } else {
            TriviaNode cur = head;

            for (int i = 0; i < size - 2; i++) {
                cur = cur.next;
            }

            TriviaNode tmp = tail;
            tail = cur;
            tail.next = null;
            size--;
            return tmp.element;

        }
    }

    public Trivia remove(int index){
        if (index < 0 || index >= size){
            return null;
        } else if (index == 0){
            return removeFirst();
        } else if (index == size - 1){
            return removeLast();
        } else {
            TriviaNode pre = head;

            for (int i = 1; i < index; i++) {
                pre = pre.next;
            }

            TriviaNode cur = pre.next;
            pre.next = cur.next;
            size--;

            return cur.element;
        }
    }

    public Trivia removeByID(int id){
        TriviaNode cur = head;
        int index = 0;
        while(cur != null){
            if (id == cur.element.getTriviaGameID())
                return remove(index);
            else
                cur = cur.next;
            index++;
        }

        return null;
    }

    @Override
    public String toString() {
        return "TriviaLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
