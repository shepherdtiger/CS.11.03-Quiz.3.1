public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade (int grade){
        if (grade >= 90) {
            return 'A';
        }

        if (grade >= 80) {
            return 'B';
        }

        if (grade >= 70) {
            return 'C';
        }

        if (grade >= 60) {
            return 'D';
        }

        if (grade >= 50) {
            return 'E';
        }
        else{
            return 'F';
        }

    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz (int num){
        if (num % 3 == 0) {
            return "fizzbuzz";
        }
        if (num % 5 == 0) {
            return "buzz";
        }

        if (num % 3 == 0 && num % 5 == 0){
            return "fizzbuzz";
        }
        else{
            return "unlucky";
        }


    }

    // Question 3 - frontBack
    public static String frontBack (String str){
        return"";
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int n1, int n2, int n3){
        return true;
    }

    // Question 5 - endUp

}
