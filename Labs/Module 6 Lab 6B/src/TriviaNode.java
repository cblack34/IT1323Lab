/*
* Name: Clayton Black
* Date: 11-14-2019
* Assignment Name: Module 6 Lab 6B
* Assignment Brief: Linked List
* Sources:
* - Book Chapter 24
*/

public class TriviaNode<E> {
    public Trivia element;
    public TriviaNode<E> next;

    public TriviaNode(Trivia element) {
        this.element = element;
    }

    public Trivia getElement() {
        return element;
    }

    public TriviaNode<E> getNext() {
        return next;
    }

    public void setNext(TriviaNode<E> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "TriviaNode{" +
                "element=" + element +
                ", next=" + next +
                '}';
    }
}
