Module 3 Lab 3B
================

Name: Clayton Black  
Date: 10-03-2019  
Assignment Name: Module 3 Lab 3B  
Assignment Brief: inheritance  
Sources:  
- https://ccse.kennesaw.edu/fye/pseudocode/pseudocodeguide.php  

## Main / Tester

```

CLASS Main
BEGIN

    CREATE hourlyClientCount ← 5

    METHOD main
    BEGIN
        CREATE clients[] 
        CREATE totalBillingAmount ← 0

        FOR i ← 0; i < hourlyClientCount; i++;
            companyName ← getStringInput("What is the client's name? ");
            companyID ← getStringInput("What is the client's ID? ");
            billingAddress ← getStringInput("What is the client's billing address? ");
            billingCity ← getStringInput("What is the client's billing city? ");
            billingState ← getStringInput("What is the client's billing state? ");
            hourlyRate ← getDoubleInput("What is the client's hourly rate? ");
            hoursBilled ← getDoubleInput("What is the client's hours billed? ");
            PRINT newline

            clients[] ← HourlyClient(companyName, companyID, billingAddress, billingCity, billingState, hourlyRate, hoursBilled)
        ENDFOR

        FOREACH client in clients
            PRINT client + newline
        ENDFOREACH

        PRINT "Company Name Billing Amount" + newline

        FOREACH client in clients
            PRINT client.companyName + client.billing() + Newline
            totalBillingAmount ← totalBillingAmount + client.billing()
        ENDFOREACH

        PRINT "Total Billing " + totalBillingAmount
    END METHOD

    METHOD getStringInput(prompt)
    BEGIN
        PRINT prompt
        ret ← READ

        return ret
    END METHOD

    METHOD getDoubleInput(prompt)
    BEGIN
        PRINT prompt
        ret ← READ
        IF ret is not of type DOUBLE THEN
            PRINT "Input must be a double!"
            ret ← getDoubleInput(prompt)
        ENDIF

        return ret
    END METHOD

END CLASS

```

## Client Class

```

CLASS Client
BEGIN
    CREATE companyName, companyID, billingAddress, billingCity, billingState

    CONSTRUCTOR Client(parameters: companyName, companyID, billingAddress, billingCity, billingState)
    BEGIN
        this.companyName ← companyName
        this.companyID ← companyID
        this.billingAddress ← billingAddress
        this.billingCity ← billingCity
        this.billingState ← billingState
    END CONSTRUCTOR

    METHOD toString()
    BEGIN
        return "Client{" +
                "companyName='" + companyName + '\'' +
                ", companyID='" + companyID + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", billingCity='" + billingCity + '\'' +
                ", billingState='" + billingState + '\'' +
                '}'
    END METHOD

END CLASS

```

## HourlyClient extends Client

```
CLASS HourlyClient
BEGIN
    CREATE hourlyRate, hoursBilled

    CONSTRUCTOR HourlyClient(parameters: companyName, companyID, billingAddress, billingCity, billingState, hourlyRate, hoursBilled)
    BEGIN
        super(companyName, companyID, billingAddress, billingCity, billingState)
        this.hourlyRate = hourlyRate
        this.hoursBilled = hoursBilled
    END CONSTRUCTOR

    METHOD billing()
    BEGIN
        return hourlyRate*hoursBilled
    END METHOD

    METHOD toString()
    BEGIN
        return "HourlyClient{" +
                "hourlyRate=" + hourlyRate +
                ", hoursBilled=" + hoursBilled +
                ", companyName='" + companyName + '\'' +
                ", companyID='" + companyID + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", billingCity='" + billingCity + '\'' +
                ", billingState='" + billingState + '\'' +
                ", billing='" + billing() + '\'' +
                '}'
    END METHOD

END CLASS

```
