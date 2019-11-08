/*
 * Name: Clayton Black
 * Date: 11-08-2019
 * Assignment Name: Module 6 Lab 6A
 * Assignment Brief: inheritance
 * Sources:
 * - Book Chapter 11
 */
public class Trivia extends Game {
    int triviaGameID;
    double ultimatePrizeMoney;
    int numberOfQuestionsThatMustBeAnsweredToWin;

    public Trivia(String description, int triviaGameID, double ultimatePrizeMoney, int numberOfQuestionsThatMustBeAnsweredToWin) {
        super(description);
        this.triviaGameID = triviaGameID;
        this.ultimatePrizeMoney = ultimatePrizeMoney;
        this.numberOfQuestionsThatMustBeAnsweredToWin = numberOfQuestionsThatMustBeAnsweredToWin;
    }

    public int getTriviaGameID() {
        return triviaGameID;
    }

    public void setTriviaGameID(int triviaGameID) {
        this.triviaGameID = triviaGameID;
    }

    public double getUltimatePrizeMoney() {
        return ultimatePrizeMoney;
    }

    public void setUltimatePrizeMoney(double ultimatePrizeMoney) {
        this.ultimatePrizeMoney = ultimatePrizeMoney;
    }

    public int getNumberOfQuestionsThatMustBeAnsweredToWin() {
        return numberOfQuestionsThatMustBeAnsweredToWin;
    }

    public void setNumberOfQuestionsThatMustBeAnsweredToWin(int numberOfQuestionsThatMustBeAnsweredToWin) {
        this.numberOfQuestionsThatMustBeAnsweredToWin = numberOfQuestionsThatMustBeAnsweredToWin;
    }

    @Override
    public String toString() {
        return "Trivia{" +
                "triviaGameID=" + triviaGameID +
                ", ultimatePrizeMoney=" + ultimatePrizeMoney +
                ", numberOfQuestionsThatMustBeAnsweredToWin=" + numberOfQuestionsThatMustBeAnsweredToWin +
                ", description='" + description + '\'' +
                '}';
    }
}
