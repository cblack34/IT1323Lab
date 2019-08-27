Module 1 Lab 1A Pseudocode
==========================

```
MAIN
BEGIN
    // Create variables
    CREATE lastWeeksHighs
    CREATE highsPlusTen

    // inialize literals
    lastWeeksHighs ← { 82, 87, 89, 90, 95, 94, 97 }

    // Process
    max ← getMaxInArray(lastWeeksHighs)
    min ← getMinInArray(lastWeeksHighs)
    highsPlusTen ← addTenToAllElementsInArray(lastWeeksHighs)

    // Output
    printResults(max, min, highsPlusTen)
END
```

## Helper Methods
```
METHOD getMaxInArray(parameters: numbers)
BEGIN
    CREATE max
    max ← numbers[0]

    FOREACH num in numbers
        IF max < num THEN
            max = num
        ENDIF
    ENDFOREACH

    RETURN max
END getMaxInArray


METHOD getMinInArray(parameters: numbers)
BEGIN
    CREATE min
    min ← numbers[0]

    FOREACH num in numbers
        IF min > num THEN
            min = num
        ENDIF
    ENDFOREACH

    RETURN min
END getMinInArray


METHOD addTenToAllElementsInArray(parameters: numbers)
BEGIN
    CREATE results
    
    FOR i ← 0 to length of numbers
        results[i] = numbers[i] + 10
    ENDFOR

    RETURN results
        
END addTenToAllElementsInArray


METHOD printResults(max, min, superHighs)
BEGIN
    CREATE daysOfWeek
    daysOfWeek ← { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }

    PRINTLINE "Last Weeks Max High: " + max
    PRINTLINE "Last Weeks Min High: " + min
    PRINTLINE ""  // blank line
    PRINTLINE "Last week's highs + 10:"
    FOR i ← 0 to length of superHighs
        PRINTLINE daysOfWeek[i%7] + " : " + superHighs[i]
    ENDFOR
END printResults

```