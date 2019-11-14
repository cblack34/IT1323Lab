/*
 * Name: Clayton Black
 * Date: 11-08-2019
 * Assignment Name: Module 6 Lab 6A
 * Assignment Brief: inheritance
 * Sources:
 * - Book Chapter 11
 */

public class Game {
    String description;

    public Game() {
        this("This Game has no description");
    }

    public Game(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Game{" +
                "description='" + description + '\'' +
                '}';
    }
}
