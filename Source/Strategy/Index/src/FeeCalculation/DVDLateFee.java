package FeeCalculation;

public class DVDLateFee implements LateFeeStrategy {

    @Override
    public double calculateLateFee(int daysLate) {
        return Math.min(daysLate * 1.50, getMaxLateFee()); // $1.50 per day, max $20
    }

    @Override
    public double getMaxLateFee() {
        return 20.0; // Maximum late fee for DVDs is $20
    }

    @Override
    public int getGracePeriod() {
        return 0; // No grace period for DVDs
    }

    @Override
    public boolean applyAdditionalPenalty(int daysLate) {
        return daysLate > 15; // Additional penalty if more than 15 days late
    }
}
