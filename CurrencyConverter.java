import java.util.Scanner;

class CurrencyConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int baseCurrency;
        int targetCurrency;
        double amount;
        double exchangeRate = 1.0;
        double convertedAmount;

        String targetSymbol = "";

        System.out.println("=======================================");
        System.out.println("          CURRENCY CONVERTER");
        System.out.println("=======================================");

        System.out.println("\nSelect Base Currency");
        System.out.println("1. INR");
        System.out.println("2. USD");
        System.out.println("3. EUR");
        System.out.println("4. GBP");
        System.out.print("Enter Choice: ");
        baseCurrency = sc.nextInt();

        System.out.println("\nSelect Target Currency");
        System.out.println("1. INR");
        System.out.println("2. USD");
        System.out.println("3. EUR");
        System.out.println("4. GBP");
        System.out.print("Enter Choice: ");
        targetCurrency = sc.nextInt();

        System.out.print("\nEnter Amount: ");
        amount = sc.nextDouble();

        switch (baseCurrency) {

            case 1: // INR
                switch (targetCurrency) {
                    case 1:
                        exchangeRate = 1.0;
                        targetSymbol = "Rs.";
                        break;
                    case 2:
                        exchangeRate = 0.012;
                        targetSymbol = "$";
                        break;
                    case 3:
                        exchangeRate = 0.011;
                        targetSymbol = "EUR";
                        break;
                    case 4:
                        exchangeRate = 0.0095;
                        targetSymbol = "GBP";
                        break;
                    default:
                        System.out.println("Invalid Target Currency!");
                        sc.close();
                        return;
                }
                break;

            case 2: // USD
                switch (targetCurrency) {
                    case 1:
                        exchangeRate = 83.50;
                        targetSymbol = "Rs.";
                        break;
                    case 2:
                        exchangeRate = 1.0;
                        targetSymbol = "$";
                        break;
                    default:
                        System.out.println("Conversion Rate Not Available!");
                        sc.close();
                        return;
                }
                break;

            case 3: // EUR
                switch (targetCurrency) {
                    case 1:
                        exchangeRate = 95.20;
                        targetSymbol = "Rs.";
                        break;
                    case 3:
                        exchangeRate = 1.0;
                        targetSymbol = "EUR";
                        break;
                    default:
                        System.out.println("Conversion Rate Not Available!");
                        sc.close();
                        return;
                }
                break;

            case 4: // GBP
                switch (targetCurrency) {
                    case 1:
                        exchangeRate = 111.40;
                        targetSymbol = "Rs.";
                        break;
                    case 4:
                        exchangeRate = 1.0;
                        targetSymbol = "GBP";
                        break;
                    default:
                        System.out.println("Conversion Rate Not Available!");
                        sc.close();
                        return;
                }
                break;

            default:
                System.out.println("Invalid Base Currency!");
                sc.close();
                return;
        }

        convertedAmount = amount * exchangeRate;

        System.out.println("\n=======================================");
        System.out.println("         CONVERSION RESULT");
        System.out.println("=======================================");
        System.out.println("Converted Amount : " + targetSymbol + " " + convertedAmount);

        sc.close();
    }
}