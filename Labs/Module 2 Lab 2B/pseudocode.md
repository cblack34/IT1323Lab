Module 2 Lab 2B
===============

Name: Clayton Black  
Date: 09-16-2019  
Assignment Name: Lab Assignment 2A  
Assignment Brief: Classes and Objects  
Sources:

* https://ccse.kennesaw.edu/fye/pseudocode/pseudocodeguide.php  

```
CLASS User
BEGIN
    CREATE userID
    CREATE password
    CREATE reenteredPassword
    CREATE email
    CREATE lastName
    CREATE firstName
    CREATE zip

    CONSTRUCTOR User(parameter: password, reenteredPassword, email, lastName, firstName, zip)
    BEGIN
        this.password ← password
        this.reenteredPassword ← reenteredPassword
        this.email ← email
        this.lastName ← lastName
        this.firstName ← firstName
        this.zip ← zip

        this.userID ← getUserID()
    END CONSTRUCTOR

    METHOD getUserID()
    BEGIN
        IF userID IS NOT null
            return userID
        ELSE
            userID ← First char of firstName +
                    last 2 char of lastName +
                    first 3 char of zip +
                    random int from 0 to 999

            return userID
        ENDIF
    END METHOD

    METHOD checkPassword()
    BEGIN
        IF password is equal to reenteredPassword THEN
            return true
        ELSE
            return false
        ENDIF
    END METHOD

    METHOD getPassword
    BEGIN
        return password
    END METHOD

    METHOD getReenteredPassword
    BEGIN
        return reenteredPassword
    END METHOD

    METHOD getEmail
    BEGIN
        return email
    END METHOD

    METHOD getLastName
    BEGIN
        return lastName
    END METHOD

    METHOD getFirstName
    BEGIN
        return firstName
    END METHOD

    METHOD getZip
    BEGIN
        return zip
    END METHOD

    METHOD setPassword(parameter: password)
    BEGIN
        this.password ← password
    END METHOD

    METHOD setReenteredPassword(parameter: reenteredPassword)
    BEGIN
        this.reenteredPassword ← reenteredPassword
    END METHOD

    METHOD setEmail(parameter: email)
    BEGIN
        this.email ← email
    END METHOD

    METHOD setLastName(parameter: lastName)
    BEGIN
        this.lastName ← lastName
        userID ← null
    END METHOD

    METHOD setFirstName(parameter: firstName)
    BEGIN
        this.firstName ← firstName
        userID ← null
    END METHOD

    METHOD setZip(parameter: zip)
    BEGIN
        this.zip ← zip
        userID ← null
    END METHOD

    METHOD toString()
    BEGIN
        return "User{" +
                "userID='" + getUserID() + '\'' +
                ", password='" + password + '\'' +
                ", reenteredPassword='" + reenteredPassword + '\'' +
                ", email='" + email + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", zip='" + zip + '\'' +
                '}'
    END MEthod

END CLASS
```

## Client Class

```
    CLASS main
    BEGIN

    CREATE names as an array of names 

    METHOD Main
        userCount ← 2

        CREATE users[userCount] as User

        FOR i ← 0; i < userCount; i++
            firstName  ← names[random number between 0 and names.length]
            lastName ← names[random number between 0 and names.length]
            email ← first char of firstName + lastname + "@gmail.com"
            password names[random number between 0 and names.length] + random int 0 - 99999999 + names[random number between 0 and names.length]

            user[i] ← User(password, password, email, lastName, firstName, random number between 10000 and 99999)

            PRINT(users[i])

            PRINT(String.format("Old first name: %s", users[i].getFirstName()))
            PRINT(String.format("Old last name: %s", users[i].getLastName()))
            PRINT(String.format("Old email: %s", users[i].getEmail()))
            PRINT(String.format("Old zip: %s", users[i].getZip()))
            PRINT(String.format("Old password: %s", users[i].getPassword()))
            PRINT(String.format("Old Re-entered Password: %s", users[i].getReenteredPassword()))
            PRINT(String.format("Old UserID: %s", users[i].getUserID()))

            PRINT("\n### Test checkPassword ###")
            PRINT("The passwords match: " + users[i].checkPassword())
            PRINT("## Change just ReenteredPassword ##")
            users[i].setReenteredPassword("changeme")
            PRINT(String.format("\tpassword: %s", users[i].getPassword()))
            PRINT(String.format("\tRe-entered Password: %s", users[i].getReenteredPassword()))
            PRINT("The passwords match: " + users[i].checkPassword())

            firstName  ← names[random number between 0 and names.length]
            lastName ← names[random number between 0 and names.length]
            email ← first char of firstName + lastname + "@gmail.com"
            password names[random number between 0 and names.length] + random int 0 - 99999999 + names[random number between 0 and names.length]

            System.out.println("\n### Change All values via mutators ###")
            users[i].setFirstName(firstName)
            users[i].setLastName(lastName)
            users[i].setEmail(email)
            users[i].setPassword(password)
            users[i].setReenteredPassword(password)
            users[i].setZip(random number between 10000 and 99999)

            PRINT(users[i])
        ENDFOR

        FOREACH users as user
            PRINT user
        ENDFOREACH

    END METHOD
    END CLASS
```