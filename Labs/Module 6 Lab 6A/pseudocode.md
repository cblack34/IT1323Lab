Module 6 Lab 6A
================

Name: Clayton Black  
Date: 11-08-2019  
Assignment Name: Module 6 Lab 6A  
Assignment Brief: inheritance
Sources:  
- https://ccse.kennesaw.edu/fye/pseudocode/pseudocodeguide.php  

## Main

```
CLASS Main
BEGIN

    METHOD Main
    BEGIN
        CREATE t1 ← NEW Trivia("Trivia Game 1", 1, 1.0, 2)
        CREATE t1 ← NEW Trivia("Trivia Game 2", 2, 1.0, 2)
        CREATE t1 ← NEW Trivia("Trivia Game 3", 3, 1.0, 2)
        CREATE t1 ← NEW Trivia("Trivia Game 4", 4, 1.0, 2)
        CREATE t1 ← NEW Trivia("Trivia Game 5", 5, 1.0, 2)

        PRINT t1
        PRINT t2
        PRINT t3
        PRINT t4
        PRINT t5

    END METHOD
END CLASS
```

## Game

```
CLASS Game
BEGIN
    
    CREATE description;

    CONSTRUCTOR
    BEGIN
        THIS("This Game has no description")
    END CONSTRUCTOR

    CONSTRUCTOR(parameters: description)
    BEGIN
        this.description ← description
    END CONSTRUCTOR

    METHOD getDescription()
    BEGIN
        RETURN description
    END METHOD

    METHOD setDescription(parameters: description)
    BEGIN
        this.description ← description
    END METHOD

    METHOD toString()
    BEGIN
        RETURN "Game{" +
                "description='" + description + '\'' +
                '}'
    END METHOD

END CLASS
```

## Trivia

```
CLASS Trivia EXTENDS Game
    CREATE description, triviaGameID, ultimatePrizeMoney, numberOfQuestionsThatMustBeAnsweredToWin

    CONSTRUCTOR (parameters: description, triviaGameID, ultimatePrizeMoney, numberOfQuestionsThatMustBeAnsweredToWin)
    BEGIN
        super(description)
        this.triviaGameID ← triviaGameID
        this.ultimatePrizeMoney ← ultimatePrizeMoney
        this.numberOfQuestionsThatMustBeAnsweredToWin ← numberOfQuestionsThatMustBeAnsweredToWin
    END CONSTRUCTOR

    METHOD getTriviaGameID()
    BEGIN
        RETURN triviaGameID;
    END METHOD

    METHOD setTriviaGameID(parameters: triviaGameID)
    BEGIN
        this.triviaGameID ← triviaGameID
    END METHOD

    METHOD getUltimatePrizeMoney()
    BEGIN
        RETURN ultimatePrizeMoney
    END METHOD

    METHOD setUltimatePrizeMoney(parameters: ultimatePrizeMoney)
    BEGIN
        this.ultimatePrizeMoney ← ultimatePrizeMoney
    END METHOD

    METHOD getNumberOfQuestionsThatMustBeAnsweredToWin() 
    BEGIN
        RETURN numberOfQuestionsThatMustBeAnsweredToWin
    END METHOD

    METHOD setNumberOfQuestionsThatMustBeAnsweredToWin(int numberOfQuestionsThatMustBeAnsweredToWin)
    BEGIN
        this.numberOfQuestionsThatMustBeAnsweredToWin ← numberOfQuestionsThatMustBeAnsweredToWin
    END METHOD

    METHOD toString()
    BEGIN
        RETURN "Trivia{" +
                "triviaGameID=" + triviaGameID +
                ", ultimatePrizeMoney=" + ultimatePrizeMoney +
                ", numberOfQuestionsThatMustBeAnsweredToWin=" + numberOfQuestionsThatMustBeAnsweredToWin +
                ", description='" + description + '\'' +
                '}'
    END METHOD
END CLASS
```