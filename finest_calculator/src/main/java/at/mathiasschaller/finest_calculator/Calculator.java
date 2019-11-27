package at.mathiasschaller.finest_calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    /* zwei Zahlen vom User einlesen und die Summe dividiert durch das Produkt der beiden Zahlen als Ergebnis am Bildschirm ausgeben. */
    public  static double calculateSumOfProduct(double nu1, double nu2) {

        double summe = nu1 + nu2;
        double produkt = nu1*nu2;
        double ergebnis = summe / produkt;
        return ergebnis;
    }

}
