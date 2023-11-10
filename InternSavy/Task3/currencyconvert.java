import java.util.*;


public class currencyconvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("Available currencies: USD, EUR, JPY, GBP");
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Enter the source currency (e.g., USD): ");
        String sourceCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        double convertedAmount = convertCurrency(amount, sourceCurrency, targetCurrency);

        if (convertedAmount != -1) {
            System.out.println(amount + " " + sourceCurrency + " is equal to " + convertedAmount + " " + targetCurrency);
        } else {
            System.out.println("Invalid currency code.");
        }

        scanner.close();
    }

    public static double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        if (sourceCurrency.equals(targetCurrency)) {
            return amount;  
        } else if (sourceCurrency.equals("USD")) {
            if (targetCurrency.equals("EUR")) {
                return amount * 0.85;
            } else if (targetCurrency.equals("JPY")) {
                return amount * 110.0;
            } else if (targetCurrency.equals("GBP")) {
                return amount * 0.73;
            }
        } else if (sourceCurrency.equals("EUR")) {
            if (targetCurrency.equals("USD")) {
                return amount / 0.85;
            } else if (targetCurrency.equals("JPY")) {
                return amount * (110.0 / 0.85);
            } else if (targetCurrency.equals("GBP")) {
                return amount * (0.73 / 0.85);
            }
        } else if (sourceCurrency.equals("JPY")) {
            if (targetCurrency.equals("USD")) {
                return amount / 110.0;
            } else if (targetCurrency.equals("EUR")) {
                return amount * (0.85 / 110.0);
            } else if (targetCurrency.equals("GBP")) {
                return amount * (0.73 / 110.0);
            }
        } else if (sourceCurrency.equals("GBP")) {
            if (targetCurrency.equals("USD")) {
                return amount / 0.73;
            } else if (targetCurrency.equals("EUR")) {
                return amount * (0.85 / 0.73);
            } else if (targetCurrency.equals("JPY")) {
                return amount * (110.0 / 0.73);
            }
        }

        
        return -1;
    }
}

