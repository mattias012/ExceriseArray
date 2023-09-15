public class Calculations {

    static double addNumbers(double firstNumber, double secondNumber){

        double result = firstNumber + secondNumber;

        return result;

    }
    static int countString(String theString, String ch){

        int sum = 0;
        int length = theString.length();

        for (int i = 0; i < length; i++){

            //Compare values
            String compareString = theString.substring(i,i+1);
            if (compareString.equals(ch)){
                sum++;
            }
        }

        return sum;
    }

    static String reverseString(String theString){

       int length = theString.length();
       String result = "";

       for (int i = 0; i < length; i++){

           result = theString.charAt(i) + result;
       }
       //return reversed string
       return result;
    }

    static int addNumbersInString(String theString){

        int result = 0;
        boolean proceed = false;
        int length = theString.length();

        //Check if string is only digits
        if (!theString.matches("\\d*")){
            System.out.println("Bara siffror");
        }
        else {
            proceed = true;
        }

        if (proceed){

            for (int i = 0; i < length; i++){

                int next = theString.charAt(i)-'0';
                result = result + next;
            }
        }

        return result;
    }

    static int menuChoice(String theString){

        int menuChoiceReturn = 5;

        if (theString.contains("1")){
            menuChoiceReturn = 1;
        }
        else if(theString.contains("2")){
            menuChoiceReturn = 2;
        }
        else if(theString.contains("3")){
            menuChoiceReturn = 3;
        }
        else if (theString.contains("4")){
            menuChoiceReturn = 4;
        }
        else {
            menuChoiceReturn = 5;
        }
        return menuChoiceReturn;
    }
}
