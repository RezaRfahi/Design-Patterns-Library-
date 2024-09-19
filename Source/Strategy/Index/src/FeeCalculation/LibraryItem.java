package FeeCalculation;

public class LibraryItem {
    private String title;
    private LateFeeStrategy lateFeeStrategy;

    public LibraryItem(String title, LateFeeStrategy lateFeeStrategy) {
        this.title = title;
        this.lateFeeStrategy = lateFeeStrategy;
    }

    public double calculateLateFee(int daysLate) {
        double fee = lateFeeStrategy.calculateLateFee(daysLate);
        if (lateFeeStrategy.applyAdditionalPenalty(daysLate)) {
            fee += 10.0; // Add $10 penalty if applicable
        }
        return fee;
    }

    public double getMaxLateFee() {
        return lateFeeStrategy.getMaxLateFee();
    }

    public int getGracePeriod() {
        return lateFeeStrategy.getGracePeriod();
    }
}
