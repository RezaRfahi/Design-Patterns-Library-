package FeeCalculation;

public interface LateFeeStrategy {
    double calculateLateFee(int daysLate);
    double getMaxLateFee(); // New method to return the maximum possible late fee
    int getGracePeriod();   // New method to return the grace period in days
    boolean applyAdditionalPenalty(int daysLate);   // New method to check if penalty applies
}
