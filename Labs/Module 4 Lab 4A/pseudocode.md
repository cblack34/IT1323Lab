Module 3 Lab 3B
================

Name: Clayton Black  
Date: 10-11-2019  
Assignment Name: Module 4 Lab 4A  
Assignment Brief: Fileio and Error Handling  
Sources:  
- https://ccse.kennesaw.edu/fye/pseudocode/pseudocodeguide.php  

## Main

```

CLASS Main
BEGIN
    METHOD main
    BEGIN
        IF elements in args supplied on cli is not 2 THEN
            PRINT "improper args" + NEW LINE
            PRINT "Usage: java Main source destination" + NEW LINE
            EXIT PROGRAM
        ENDIF

        CREATE sourceFile ← File object located at arg[0]
        CREATE destination ← File object located at arg[1]

        IF sourceFile DOES NOT EXIST THEN
            PRINT "Source File Does Not Exist!" + NEW LINE
            THROW EXCEPTION
        ENDIF

        IF destinationFile Exist THEN
            PRINT "Destination file already exist." + NEW LINE + "Please delete it or choose another destination"
            THROW EXCEPTION
        ENDIF

        TRY WITH RESOURCE (
            CREATE lines ← sourceFile as readable file object
            CREATE output ← destinationFile as writeable file object
        ) 
            count = 1;
            WHILE there is a nextLine
                line ← lines.nextLine()
                output.print(count + ". " + line + NEWLINE)
                count ← count + 1
            ENDWHILE
    END METHOD
END CLASS

```


