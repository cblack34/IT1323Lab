Module 4 Lab 4B
================

Name: Clayton Black  
Date: 10-22-2019  
Assignment Name: Module 5 Lab 5A  
Assignment Brief: recursion  
Sources:  
- https://ccse.kennesaw.edu/fye/pseudocode/pseudocodeguide.php  

## Main

```

CLASS Main
BEGIN
    METHOD main
    BEGIN
        CREATE input ← {1,2,3,4}
        CREATE adder ← NEW RecursiveSum(input)

        PRINT adder
        PRINT adder.getX()
        PRINT adder.sum(adder.getX())

        PRINT "Set x to {5, 6, 7, 8}"
        adder.setX({5, 6, 7, 8})
        PRINT adder
        PRINT adder.getX()
        PRINT adder.sum(adder.getX())

        PRINT "Create 2 more RecursiveSum objects: adder2.x == {1, 2, 3, 4} and adder3.x == {1, 2, 3, 4}"
        CREATE adder2 ← NEW RecursiveSum({1,2,3,4})
        CREATE adder3 ← NEW RecursiveSum({1,2,3,4})

        PRINT "adder == adder2: " + adder.equals(adder2)
        PRINT "adder == adder3: " + adder.equals(adder3)
        PRINT "adder2 == adder3: " + adder2.equals(adder3)

    END METHOD
END CLASS

```

## RecursiveSum

```
CLASS RecursiveSum
BEGIN
    CONSTRUCTOR RecursiveSum(x)
    BEGIN
        setX(x)
    END CONSTRUCTOR

    METHOD getX()
    BEGIN
        return x.clone()
    END METHOD

    METHOD setX(x)
    BEGIN
        thix.x = x.clone
    END METHOD

    METHOD equals(o)
    BEGIN
        IF this == o THEN RETURN true
        IF o == null THEN RETURN false
        IF type of o and type of this do not match THEN RETURN false
        if Arrays.equals(x, o.x) RETURN true 
    END METHOD

    METHDO toString()
    BEGIN
        RETURN "RecursiveSum{" +
                "x=" + Arrays.toString(x) +
                '}'
    END METHOD

    METHOD sum(y)
    BEGIN
        this.sum(y, y.length-1)
    END METHOD

    METHOD sum(y, index)
    BEGIN
        IF index == 0 THEN
            return y[index]
        ELSE
            return y[index] + this.sum(y, y.length-1)
        ENDIF
    END METHOD
END CLASS
```