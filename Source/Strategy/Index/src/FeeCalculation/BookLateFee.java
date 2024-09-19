package FeeCalculation;

public class BookLateFee implements LateFeeStrategy{

    @Override
    public double calculateLateFee(int daysLate) {
        int effectiveDays = Math.max(0, daysLate - getGracePeriod()); // Apply grace period
        return Math.min(effectiveDays * 0.50, getMaxLateFee()); // Max late fee is $10
    }

    @Override
    public double getMaxLateFee() {
        return 10.0; // Maximum late fee for books is $10
    }

    @Override
    public int getGracePeriod() {
            return 3; // 3-day grace period for books
    }

    @Override
    public boolean applyAdditionalPenalty(int daysLate) {
        return daysLate > 30; // Additional penalty for books if more than 30 days late
    }
}
