package com.conversorDeMoneda.view;

import java.util.Scanner;

public class CurrencyView {
    private final Scanner scanner;

    public CurrencyView() {
        this.scanner = new Scanner(System.in);
    }

    public void showWelcomeMessage() {
        System.out.println("\uD83D\uDC4B Sea bienvenido/a al Conversor de Moneda \uD83D\uDCB1");
    }

      public void showMenu() {
        System.out.println("1) 🇺🇸 Dólar =>> 🇦🇷 Peso Argentino");
        System.out.println("2) 🇦🇷 Peso argentino =>> 🇺🇸 Dólar");
        System.out.println("3) 🇺🇸 Dólar =>> 🇧🇷 Real brasileño");
        System.out.println("4) 🇧🇷 Real brasileño =>> 🇺🇸 Dólar");
        System.out.println("5) 🇺🇸 Dólar =>> 🇨🇴 Peso colombiano");
        System.out.println("6) 🇨🇴 Peso colombiano =>> 🇺🇸 Dólar");
        System.out.println("7) 🚪 Salir");
        System.out.print("Elija una opción válida: ");
    }

    public int getUserChoice() {
        return scanner.nextInt();
    }

    public double getAmount() {
        System.out.print("Ingrese la cantidad a convertir: ");
        return scanner.nextDouble();
    }

    public void showConversionResult(String fromCurrency, String toCurrency, double amount, double result) {
        System.out.printf("%.2f %s = %.2f %s%n", amount, fromCurrency, result, toCurrency);
    }

    public void showExitMessage() {
        System.out.println("Gracias por usar el Conversor de Moneda. ¡Hasta luego! \uD83D\uDC4B");
    }

    public void showInvalidOptionMessage() {
        System.out.println("Opción no válida. Por favor, elija una opción válida. ❌");
    }

    public void showErrorMessage(String message) {
        System.out.println("Error: " + message + " ⚠️");
    }
}