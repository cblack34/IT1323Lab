Module 1 Lab 1B
===============

Name: Clayton Black  
Date: 09-01-2019  
Assignment Name: Module 1 Lab 1B  
Assignment Brief: 2d array totaling and averaging   
Sources: https://ccse.kennesaw.edu/fye/pseudocode/pseudocodeguide.php  

```
MAIN
BEGIN
    CREATE weeklyTotals
    CREATE avgSaleAmount    

    // Input
    // Will be static with data from provided table.
    CREATE sales 

    // Process
    FOR i ← 0; i < sales.length; i++;
        weeklyTotals[i] ← totalSales(sales[i])
    ENDFOR

    avgSaleAmount ← averageSales(sales)

    // OUTPUT
    printTableHeader(" ", {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"})
    FOR i ← 0; i < sales.length; i++;
        printRow(sales[i], "Week " + (i+1))
    ENDFOR

    PRINT "Average Sales Per Day: " + avgSaleAmount + "\n"

    PRINT "Total Sales Per Week"
    FOR i ← 0; i < weeklyTotals.length; i++;
        PRINT  "Week " + (i+1) + " Sales: " + weeklyTotals[i] "\n"
    
     
    
END
```

## Required Methods
```
METHOD averageSales(sales)
BEGIN
    CREATE total ← 0
    CREATE count ← 0

    FOREACH week IN sales
        FOREACH day IN week
            total ← total + day
            count ← count + 1
        ENDFOREACH
    ENDFOREACH

    RETURN total / count

END averageSales
```
```
METHOD totalSales(week)
BEGIN
    CREATE total ← 0

    FOREACH day IN week
        total ← total + day
    ENDFOREACH

    RETURN total

END totalSales
```

## Helper Methods
```
METHOD printTableHeader(headers, rowHeader=null, columnWidth = 13)
BEGIN 
    IF rowHeader != null THEN
        PRINT rowHeader with width of columnWidth
    ENDIF

    FOREACH header in headers
        PRINT header with width of columnWidth
    ENDFOREACH
    
    PRINT NEW LINE

END printTableHeader
```
```
METHOD printRow(row, rowHeader=null, columnWidth = 13)
BEGIN 
    IF rowHeader != null THEN
        PRINT rowHeader with width of columnWidth
    ENDIF

    FOREACH cell in row
        PRINT cell with width of columnWidth
    ENDFOREACH

    PRINT NEW LINE

END printRow
```