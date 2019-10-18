Module 4 Lab 4B
================

Name: Clayton Black  
Date: 10-11-2019  
Assignment Name: Module 4 Lab 4B  
Assignment Brief: Fileio and Error Handling  
Sources:  
- https://ccse.kennesaw.edu/fye/pseudocode/pseudocodeguide.php  

## Main

```

CLASS Main
BEGIN
    METHOD main
    BEGIN
        CREATE sourceFile ← File object located at temps.txt
        CREATE destination ← File object located at output.txt

        CREATE count ← 1
        CREATE min as int
        CREATE max as int

        TRY WITH RESOURCE (
            CREATE temps ← sourceFile as readable file object
            CREATE output ← destinationFile as writeable file object
        ) 
            CREATE currentElement ← first int in temps file
            min ← currentElement
            max ← currentElement

            WHILE there is a another temp in temps
                currentElement ← temps.nextInt()
                IF currentElement < min THEN
                    min ← currentElement
                ELSE IF currentElement > max THEN
                    max ← currentElement
                ENDIF

                counter ← counter + 1
            ENDWHILE
        END TRY WITH RESOURCE

        TRY WITH RESOURCE (
            CREATE temps ← sourceFile as readable file object
            CREATE output ← destinationFile as writeable file object
        ) 
            CREATE arr[counter]

            FOR i←0; i < counter; i++
                arr[i] ← temps.nextInt() + 10
            ENDFOR

            WRITE TO output ← "Max Temp: " + max + NEWLINE
            WRITE TO output ← "Min Temp: " + min + NEWLINE
            WRITE TO output ← "Temperatures plus 10:" + NEWLINE
            FOREACH i in arr
                WRITE TO output ← i
            ENDFOREACH
        END TRY WITH RESOURCE
    END METHOD
END CLASS

```
