Module 2 Lab 2A
===============

Name: Clayton Black  
Date: 09-12-2019  
Assignment Name: Lab Assignment 2A  
Assignment Brief: Classes and Objects  
Sources:

* https://ccse.kennesaw.edu/fye/pseudocode/pseudocodeguide.php  

```
CLASS Vendor
BEGIN
    CREATE id  
    CREATE name  
    CREATE quarterlyPurchaseOrderTotals[4]  

    CONSTRUCTOR Vendor(parameter: id, name)
        setID(id)
        setName(name)
    END CONSTRUCTOR

    METHOD getID()
    BEGIN
        RETURN this.id
    END METHOD

    METHOD getName()
    BEGIN
        return this.name
    END METHOD

    METHOD getPurchaseOrderTotal(parameter: quarter)
    BEGIN
        return this.quarterlyPurchaseOrderTotals[quarter]
    END METHOD

    METHOD setID(parameter: id)
    BEGIN
        this.id ← id
    END METHOD

    METHOD setName(parameter: name)
    BEGIN
        this.name ← name
    END METHOD

    METHOD setPurchaseOrderTotal(parameter: quarter, amount)
    BEGIN
        index ← quarter - 1
        this.quarterlyPurchaseOrderTotals[index] ← amount
    END METHOD

    METHOD sumQuarterlyPurchaseOrderTotals()
    BEGIN
        total ← 0
        FOREACH quarter in this.quarterlyPurchaseOrderTotals
            total = total + quarter
        ENDFOREACH

        RETURN total
    END METHOD

    METHOD toString
    BEGIN
        s = "Vendor Name: " + this.name + NEWLINE +
            "Vendor ID: " + this.id + NEWLINE +
        	"First quarter purchase order total: " + this.quarterlyPurchaseOrderTotals[0] + NEWLIEN +
        	"Second quarter purchase order total: " + this.quarterlyPurchaseOrderTotals[1] + NEWLIEN +
        	"Third quarter purchase order total: " + this.quarterlyPurchaseOrderTotals[2] + NEWLIEN +
        	"Fourth quarter purchase order total: " + this.quarterlyPurchaseOrderTotals[3] + NEWLIEN

    	return s
    END METHOD
END CLASS
```

## Client Class

```
Main
BEGIN
	CREATE vendors[2] as Vendor

	FOR i ← 0; i < vendors.legth; i++
		PRINT "Processing Vendor " + (i+1)
		vendors[i] ← Vendor(i, "KSU Vendor " + i)

		PRINT vendors[i]

		vendor[i].setName("KSU Vendor " + (i+10))
		FOR j=1; j<=4; j++)
			vendors[i].setQuarterlyPurchaseOrderTotal(j, ((int) (Math.random()*10000))/100.0)
		ENDFOR

		PRINT "Vendor Name: " + vendors[i].getName()
		PRINT "Vendor ID: " + vendors[i].getID()
		PRINT "First quarter PO Totals: " + vendors[i].getQuarterlyPurchaseOrderTotal(1)
		PRINT "Yearly PO total: " + vendors[i].sumQuarterlyPurchaseOrderTotals()

	ENDFOR


	FOREACH vendors as vendor
		PRINT vendor
	ENDFOREACH


END
```