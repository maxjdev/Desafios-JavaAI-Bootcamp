package org.exercises.design_patterns.desafio_5;

import java.util.Scanner;

// Antiga classe de conversão que só suporta a conversão de USD para GBP
class OldCurrencyConverter {
    public double convertUSDtoGBP(double amount) {
        return amount * 0.80; // 80% do valor em USD
    }
}

// Novo adaptador que usa a antiga conversão e aplica a taxa adicional de GBP para EUR
class CurrencyAdapter {
    private final OldCurrencyConverter oldConverter;

    private final double GBP_TO_EUR_RATE = 1.0625;

    public CurrencyAdapter(OldCurrencyConverter oldConverter) {
        this.oldConverter = oldConverter;
    }

    // TODO: Implementar método de conversão de USD para outra moeda (por exemplo, JPY)
    // Dica: Você pode criar métodos adicionais conforme necessário.
    public double convertUSDtoEUR(double amount) {
        double amountInGBP = oldConverter.convertUSDtoGBP(amount);
        return amountInGBP * GBP_TO_EUR_RATE;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());

        OldCurrencyConverter oldConverter = new OldCurrencyConverter();
        CurrencyAdapter adapter = new CurrencyAdapter(oldConverter);

        // TODO: Chamar o método para converter USD para a nova moeda desejada (por exemplo, JPY)
        double convertedToEUR = adapter.convertUSDtoEUR(input);

        // TODO: Imprimir o resultado da conversão
        System.out.println("USD: " + input);
        // TODO: Imprimir o resultado da conversão com a nova moeda (por exemplo, JPY)
        System.out.println("EUR: " + convertedToEUR);
    }
}