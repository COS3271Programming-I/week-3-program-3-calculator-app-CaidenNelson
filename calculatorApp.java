
import java.util.Scanner;


public  class Calculator {

    public static double log(double number, double base) {

        double logged = (int) (Math.log(number) / Math.log(base));
        return logged;
    }

    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {
        double number1;
        double number2;
        double addition;
        double multiply;
        double divide;
        double exponent;
        double log;

        System.out.println("Please enter your first number. (Must be positive and greater than 1)");
        number1 = userinput.nextDouble();

        System.out.println("Please enter your second number. (Must be positive and greater than 1)");
        number2 = userinput.nextDouble();

        addition = number1 + number2;

        multiply = number1*number2;

        divide = number1/number2;

        exponent = Math.pow(number1, number2);

        log = log(number1, number2);



        System.out.println("When added your numbers =" +' '+ addition +' '+ "When multiplied they =" +' '+ multiply +
                ' '+"When divided they =" +' '+ divide +' '+ "When number 1 is raised to the power of number 2 it =" +' '+
                exponent +' '+ "And when number 1 is logged to the base of number 2 it =" +' '+ log);




    }
}
