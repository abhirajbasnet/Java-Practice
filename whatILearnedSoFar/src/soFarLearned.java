import java.sql.SQLOutput;

public class soFarLearned {

    public static void main(String[] arg) {

        calculateScore(true, 1000, 100, 10);

        //main code for the java code
        /*
         * Variable are the way of storing the data in the computer memory by the given data type and name by us where computer does the hard part
         * whatever inside the parenthesis is the parameter, period
         * Different theory, method class, data type, primitive type, wrapper class,
         * There are 8 primitive data types int, long, double, boolean, float, short, char, byte
         * wrapper class are those class of the primitive type which helps to operate the java functions of the primitive type
         * Java operative simply known as (+ - \ *)
         *
         */

        //short, Byte, int, Long

        byte myMinimumByteValue = Byte.MIN_VALUE;
        byte myMaximumByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum Byte Value = " + myMinimumByteValue);
        System.out.println("Maximum Byte Value = " + myMaximumByteValue);

        short myMinimumShortValue = Short.MIN_VALUE;
        short myMaximumShortValue = Short.MAX_VALUE;
        System.out.println("Minimum Short Value = " + myMinimumShortValue);
        System.out.println("Maximum Short Value = " + myMaximumShortValue);

        int myMinimumIntValue = Integer.MIN_VALUE;
        int myMaximumIntValue = Integer.MAX_VALUE;
        System.out.println("Minimum Int Value = " + myMinimumIntValue);
        System.out.println("Maximum Int Value = " + myMaximumIntValue);

        int myIntOverFlowValue = 2147483647 + 1; //perfect example of the overflow it is  because int cannot store more than its maximum storage so its loses the data and print as -
        System.out.println(myIntOverFlowValue);
        int myIntUnderFlowValue = -2147483647 - 1; // example of the underflow
        System.out.println(myIntUnderFlowValue);
        //so to counter attack the problem of int we use long

        long myMinimumLongValue = Long.MIN_VALUE;
        long myMaximumLongValue = Long.MAX_VALUE;
        System.out.println("Minimum Long Value = " + myMinimumLongValue);
        System.out.println("Maximum Long Value = " + myMaximumLongValue);

        //Casting which means to treat or convert a number from one type to another
        short newShort = (short) (myMaximumShortValue / 2);
        System.out.println(newShort);

        // 1 byte = 8 bits.
        //byte has size of  1byte  store numbers from -128 to 127
        //Short has size of 2 bytes stores numbers from -32,768 to 32,767
        //int has size of 4 bytes stores numbers from -2147,483,648 to 2147,483,647
        //long has size of 8 bytes  stores numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        /**
         * if we have to store the precise value we use the float and double primitive data types.
         */

        float myFloatValue = 10;
        float myMinimumFloatValue = Float.MIN_VALUE;
        float myMaximumFloatValue = Float.MAX_VALUE;
        System.out.println("Minimum Float Value = " + myMinimumFloatValue);
        System.out.println("Maximum Float Value = " + myMaximumFloatValue);

        double myDoubleValue = 10;
        double myMinimumDoubleValue = Double.MIN_VALUE;
        double myMaximumDoubleValue = Double.MAX_VALUE;
        System.out.println("Minimum Double Value = " + myMinimumDoubleValue);
        System.out.println("Maximum Double Value = " + myMaximumDoubleValue);

        //lets see how the float, int and double data types print the data

        int myIntNumber = 10;
        float myFloatNumber = 10;
        double myDoubleNumber = 10;
        System.out.println("myIntNumber = " + myIntNumber / (3));
        System.out.println("myFloatNumber = " + myFloatNumber / (3));
        System.out.println("myDoubleNumber = " + myDoubleNumber / (3));

        /**
         * Next data types is boolean and char
         */

        //boolean store the value in 1 or 0 and in true or false
        boolean isTrueValue = true;
        boolean isFalseValue = false;
        //when writing the method or giving the name of the variable. The variable name is always written in the question format
        boolean isStudent = true;
        System.out.println("Following people are student = " + isStudent);

        //char data types store the single character
        char myCharIs = 'A';
        //char also store the unique value too like
        char myCopyrightValue = '\u00A9';
        System.out.println("myCopyrightValue = " + myCopyrightValue);

        //Java operators
        /**
         * + addition
         * - subtraction
         *  / division
         *  * multiplication
         *  % modulus - returns the division remainder
         *  ++ increases the value of the variable by 1
         *  -- decreases the value of the variable by 1
         */
        //Same procedure goes with the other primitive types of the java byte, short, int, long, float, double
        //addition
        int newNumber = 10;
        int secondNumber = 20;
        int totalNumber = newNumber + secondNumber;
        System.out.println("Total Number =" + totalNumber);

        //subtraction
        int newTotalNumber = totalNumber - 20;
        System.out.println("New total number = " + newTotalNumber);

        //division
        int newDividedNumber = newTotalNumber / 3;
        System.out.println("New divided number = " + newDividedNumber);

        //Multiplication
        int newMultipliedNumber = totalNumber * 3;
        System.out.println("New Multiplied Number =" + newMultipliedNumber);

        //Modulus
        int newModulusValue = 10 % 3;
        System.out.println("New modulus value = " + newModulusValue);

        //++ increment
        int newIncrementValue = 5;
        newIncrementValue++;
        System.out.println("New Increment Value = " + newIncrementValue);

        //--decrement
        int newDecrementValue = 8;
        newDecrementValue--;
        System.out.println("New Decrement Value = " + newDecrementValue);

        /**
         * Strings
         */

        //creating the variable with the String Data type
        String newName = "Abhi";
        System.out.println("New Name = " + newName);

        //let's say if I want to  know the length of the string variable then we use length method
        //String in Java is actually a Object which contain methods that can perform certain operations on String.
        String alphabets = "asdfghjklqwertyuiopzxc123455vbnm";

        //to know the length of the String we use .length() method for example
        System.out.println("String Alphabets length = " + alphabets.length()); //which prints the total number that contained in the string

        //we can use other method on string such as uppercase and lowercase to change all the String variable to lower or uppercase
        String upperCase = "abcd";
        System.out.println("Uppercase = " + upperCase.toUpperCase());
        String lowercase = "ABCD";
        String newLowerCase = "ASDFGH34543523JKL";
        System.out.println("LowerCase = " + lowercase);
        System.out.println("Lowercase changed to lowercase = " + lowercase.toLowerCase());
        System.out.println("Replace lowercase = " + lowercase.replaceAll(lowercase, newLowerCase));
        System.out.println("Returns the character at specified index = " + newLowerCase.charAt(7));
        System.out.println(newLowerCase.codePointAt(7));

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("I am scared");
            System.out.println("What am i gonna do ");
        }

        int firstNum = 10;
        int secondNum = 50;
        if (firstNum <= secondNum) {
            System.out.println("firstNumber is grater than second Number");
        }
        if ((firstNum < secondNum) && (firstNum <= secondNum)) {
            System.out.println("Return it");
        }
        boolean isCar = true;
        if (isCar) {
            System.out.println("isCar");
        }

        boolean wasCar = isCar == false ? true : false;
        if (wasCar) {
            System.out.println("Was car");
        }

        int numberOfStudent = 20;
        if (numberOfStudent == 20) {

            System.out.println("Number of student = " + numberOfStudent);
        }

        //int eighteenOrOver = 40;
        boolean eighteenOrOver = numberOfStudent == 20 ? true : false;
        System.out.println(eighteenOrOver);

        double doubleVlaue1 = 20.00d;
        double doubleValue2 = 80.00d;

        double totalValue = (doubleVlaue1 + doubleValue2) * 100.00d;
        System.out.println("Total double value = " + totalValue);

        double modulusValue = totalValue % 40.00d;
        System.out.println("Modulus Double value = " + modulusValue);

        boolean value = (modulusValue == 0) ? true : false;
        System.out.println("Boolean Value " + value);
        if (value != true) {
            System.out.println("Got Some remainder");

        }

        int firstNumber = 10;
        int secondNumb = 20;
        boolean bothNumberIsCorrect = true;
        bothNumberIsCorrect = false;
        int totalNumb = firstNumber + secondNumber;
        System.out.println("Total Number = " + totalNumb);
        totalNumb++;
        System.out.println("Total Number after one increment = " + totalNumb);
        if (!bothNumberIsCorrect) {
            System.out.println("It is false");
        } else {
            System.out.println("It is true");
        }

//        boolean isStudentInSchool = true;
//        int totalNumberOfClass = 10;
//        int totalNumberOfStudents = 30;

        totalNumberOfStudentsInASchool(true, 10, 30);

        boolean isStudentInSchool = true;
        int totalNumberOfClass = 9;
        int totalNumberOfStudents = 40;
        totalNumberOfStudentsInASchool(isStudentInSchool, totalNumberOfClass, totalNumberOfStudents);



//        isStudentInSchool = true;
//        totalNumberOfClass = 9;
//        totalNumberOfStudents = 40;
//        if (isStudentInSchool) {
//            int totalStudentsInSchool = totalNumberOfStudents * totalNumberOfClass;
//            System.out.println("The Total Number of Students in a School was " + totalStudentsInSchool);
//        }


    }

    public static int totalNumberOfStudentsInASchool(boolean isStudentInSchool, int totalNumberOfClass, int totalNumberOfStudents){
        if (isStudentInSchool) {
            int totalStudentsInSchool = totalNumberOfClass * totalNumberOfStudents;
            System.out.println("The Total Number of Students in a School was " + totalStudentsInSchool);
            return totalStudentsInSchool;
        }else{
            return -1;
        }

    }


// what is methods -> it is a block of code only runs when we use them
    // why methods is used -> to perform certain actions which is also known as functions
    // why use method -> to define a code once and reuse it again and again

    public static int calculateScore(boolean gameOver, int bonus, int score, int level) {

        if (gameOver) {
            int finalScore = bonus + (score * level);
            System.out.println("Final Score was " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
