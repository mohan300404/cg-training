public class Exception6 {
    public class InterestCalculator {
    
        public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
            if (amount < 0 || rate < 0) {
                throw new IllegalArgumentException("Amount and rate must be non-negative.");
            }
            return amount * rate * years / 100;
        }
    
        public static void main(String[] args) {
            try {
                double interest = calculateInterest(10000, 5, 2);
                System.out.println("Interest: " + interest);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
}
