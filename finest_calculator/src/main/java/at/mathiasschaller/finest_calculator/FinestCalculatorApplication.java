package at.mathiasschaller.finest_calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.applet.AppletContext;
import java.util.Scanner;

@SpringBootApplication
public class FinestCalculatorApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FinestCalculatorApplication.class,args);
		Calculator calculator = (Calculator) ctx.getBean("calculator");

		Scanner scan = new Scanner(System.in);

		System.out.println("The World's Finest Calculator!");
		System.out.println("Please enter number:");

		double number1 = scan.nextDouble();
		System.out.println("Please enter another number:");
		double number2 = scan.nextDouble();
		double ergebnis = Calculator.calculateSumOfProduct(number1,number2);
		System.out.println(" Summe dividiert durch das Produkt der beiden Zahlen: " + ergebnis);
	}

}
