public class CreditPaymentsCalculator {
    private double getAnnuityCoefficient(double amount, double interestRate, int monthNumber){
        double monthInterestRate = interestRate / 12;
        double pow = Math.pow(1 + monthInterestRate, monthNumber);
        return monthInterestRate * pow / (pow - 1);
    }

    private void checkPopularArgs(double amount, double interestRate, int monthNumber) {
        if (amount <= 0)
            throw new IllegalArgumentException("amount should be >= 0");
        if (interestRate <= 0)
            throw new IllegalArgumentException("interestRate should be >= 0");
        if (monthNumber <= 0)
            throw new IllegalArgumentException("monthNumber should be >= 0");
    }

    public int getMonthPayment(int amount, double interestRate, int monthNumber){
        checkPopularArgs(amount, interestRate, monthNumber);
        double annuityCoeff = getAnnuityCoefficient(amount, interestRate, monthNumber);
        return (int)Math.round(annuityCoeff * amount);
    }

    public int getTotalSum(int amount, double interestRate, int monthNumber){
        checkPopularArgs(amount, interestRate, monthNumber);
        return getMonthPayment(amount, interestRate, monthNumber) * monthNumber;
    }

    public int getTotalInterest(int amount, double interestRate, int monthNumber){
        checkPopularArgs(amount, interestRate, monthNumber);
        return getMonthPayment(amount, interestRate, monthNumber) * monthNumber - amount;
    }

}
