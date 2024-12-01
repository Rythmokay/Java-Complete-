public class a_syntax{
    // Constants: 'final' keyword makes this a constant value
    public static final int CONSTANT_NUMBER = 100;

    public static void main(String[] args) {
        
        // Primitive Data Types
        int number = 10;         // int: integer type
        char letter = 'A';       // char: single character
        float piValue = 3.14f;   // float: floating-point number
        boolean isJavaFun = true; // boolean: true or false
        double largeNumber = 12345.6789; // double: double precision floating-point
        
        // Reference Data Types
        String greeting = "Hello, World!"; // String: Sequence of characters
        int[] numbersArray = {1, 2, 3, 4}; // Array: collection of values
        
        // Variable Scope and Lifetime
        if (isJavaFun) {
            // Local variable within if block
            String message = "Java is fun!";
            System.out.println(message);
        }
        // System.out.println(message); // This would cause an error as message is out of scope
        
        // Default Values for Variables (Example in a class context)
        int defaultInt = 0;
        boolean defaultBoolean = false;
        String defaultString = null;
        System.out.println("Default int: " + defaultInt);
        System.out.println("Default boolean: " + defaultBoolean);
        System.out.println("Default String: " + defaultString);
        
        // Operators
        // Arithmetic Operators
        int sum = number + 5;
        int product = number * 2;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // Relational Operators
        boolean isGreaterThan = number > 5;
        System.out.println("Is number greater than 5? " + isGreaterThan);

        // Logical Operators
        boolean andResult = isJavaFun && isGreaterThan;
        boolean orResult = isJavaFun || isGreaterThan;
        System.out.println("AND result: " + andResult);
        System.out.println("OR result: " + orResult);

        // Assignment Operators
        int assignedValue = 20;
        assignedValue += 10; // Compound Assignment
        System.out.println("Assigned Value after +=: " + assignedValue);
        
        // Bitwise Operators
        int bitwiseResult = number & 5; // Bitwise AND
        System.out.println("Bitwise AND of number and 5: " + bitwiseResult);

        // Shift Operators
        int shiftedValue = number << 2; // Left shift by 2 bits
        System.out.println("Number shifted left by 2 bits: " + shiftedValue);

        // Ternary Operator
        String result = (number > 5) ? "Greater than 5" : "Less than or equal to 5";
        System.out.println("Ternary Operator result: " + result);
        
        // Control Flow: Conditional Statements
        // If-Else Statement
        if (number > 5) {
            System.out.println("Number is greater than 5");
        } else {
            System.out.println("Number is 5 or less");
        }

        // Nested If-Else Statement
        if (number > 5) {
            if (number < 15) {
                System.out.println("Number is greater than 5 but less than 15");
            } else {
                System.out.println("Number is greater than or equal to 15");
            }
        }

        // Switch Statement
        switch (number) {
            case 10:
                System.out.println("Number is 10");
                break;
            case 20:
                System.out.println("Number is 20");
                break;
            default:
                System.out.println("Number is neither 10 nor 20");
        }

        // Loops
        // Entry-Controlled Loop: For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For Loop iteration: " + i);
        }

        // Entry-Controlled Loop: While Loop
        int counter = 0;
        while (counter < 3) {
            System.out.println("While Loop iteration: " + counter);
            counter++;
        }

        // Exit-Controlled Loop: Do-While Loop
        int doWhileCounter = 0;
        do {
            System.out.println("Do-While Loop iteration: " + doWhileCounter);
            doWhileCounter++;
        } while (doWhileCounter < 2);

        // Enhanced For Loop (For Each)
        System.out.println("Array elements:");
        for (int num : numbersArray) {
            System.out.println(num);
        }
    }
}