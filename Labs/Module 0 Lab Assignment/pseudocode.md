Module 0 Pseudocode
===================
```
MAIN
BEGIN
    // Create variables
    CREATE cost, gratuityRate, gratuityAmount, total

    // Inpute
    cost ← CALL getDoubleFromUser with "How much is the subtotal?"
    gratuityRate ← CALL getDoubleFromUser with "How much is the gratuity rate?"

    // Process
    gratuityAmount ← cost * gratuityRate/100
    total ← cost + gratuityAmount

    // Output
    PRINT "Cost: " + cost formatted to 2 decimal places
    PRINT "Gratuity Rate: " + gratuityRate formatted to 1 decimal place + "%"
    PRINT "Gratuity Amount: " + gratuityAmount formatted to 2 decimal places
    PRINT "Total Amount: " + total formatted to 2 decimal places
END

METHOD getDoubleFromUser (parameters: question)
BEGIN
    // Create Vars
    CREATE userResponse

    // Get input
    PRINT question
    userResponse ← READ

    // Do some error checking. This should pass as long as the user enters any number.
    // Most languages will upconvert from int to double or float if language doesn't have double.
    IF userResponse IS NOT Double Then
        PRINT "Input must be a number."
        userResponse ← CALL getDoubleFromUser with question
    ENDIF

    RETURN userResponse
END
```
