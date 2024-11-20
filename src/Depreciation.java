public class Depreciation {
    public static void calculateDepreciation(double initialPrice, double depreciationRate, int years) {

        double price = initialPrice;
        for (int i = 1; i <= years; i++) {
            price = price - depreciationRate;
            System.out.println("Year " + i + ": " + String.format("%.2f", price));
        }
    }

    public static void main(String[] args) {
        calculateDepreciation(850000, 15000, 5);
    }
}
