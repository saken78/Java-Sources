

import java.util.Locale;
import java.text.NumberFormat;
import java.util.Scanner;

class Currency {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        double payment = inputUser.nextDouble();
        inputUser.close();

        // format us (built.in locale)
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);

        String us = usFormat.format(payment);

        // india , harus bukin locale manual
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = indiaFormat.format(payment);

        // format china
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

        // format france
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        // Cetak hasil
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
