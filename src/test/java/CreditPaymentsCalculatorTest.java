import org.junit.Assert;
import org.junit.Test;

public class CreditPaymentsCalculatorTest {

    // region getMonthPayment

    @Test(expected = IllegalArgumentException.class)
    public void getMonthPayment_AmountOverZero(){
        new CreditPaymentsCalculator().getMonthPayment(0, 0.15, 18);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getMonthPayment_InterestRateBetween0And1(){
        new CreditPaymentsCalculator().getMonthPayment(300_000, 12, 18);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getMonthPayment_MonthNumberOverZero(){
        new CreditPaymentsCalculator().getMonthPayment(300_000, 0.15, 0);
    }

    @Test
    public void getMonthPayment_Ok(){
        double res = new CreditPaymentsCalculator().getMonthPayment(300_000, 0.15, 18);

        Assert.assertTrue(Math.abs(res - 18715.44) < 0.01);
    }

    // endregion getMonthPayment

    // region getTotalSum

    @Test(expected = IllegalArgumentException.class)
    public void getTotalSum_AmountOverZero(){
        new CreditPaymentsCalculator().getTotalSum(0, 0.15, 18);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getTotalSum_InterestRateBetween0And1(){
        new CreditPaymentsCalculator().getTotalSum(300_000, 12, 18);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getTotalSum_MonthNumberOverZero(){
        new CreditPaymentsCalculator().getTotalSum(300_000, 0.15, 0);
    }

    @Test
    public void getTotalSum_Ok(){
        double res = new CreditPaymentsCalculator().getTotalSum(300_000, 0.15, 18);

        Assert.assertTrue(Math.abs(res - 336_855.98) < 0.01);
    }

    // endregion getTotalSum

    // region getTotalInterest

    @Test(expected = IllegalArgumentException.class)
    public void getTotalInterest_AmountOverZero(){
        new CreditPaymentsCalculator().getTotalInterest(0, 0.15, 18);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getTotalInterest_InterestRateBetween0And1(){
        new CreditPaymentsCalculator().getTotalInterest(300_000, 12, 18);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getTotalInterest_MonthNumberOverZero(){
        new CreditPaymentsCalculator().getTotalInterest(300_000, 0.15, 0);
    }

    @Test
    public void getTotalInterest_Ok(){
        double res = new CreditPaymentsCalculator().getTotalInterest(300_000, 0.15, 18);

        Assert.assertTrue(Math.abs(res - 36_855.98) < 0.01);
    }

    // endregion getTotalInterest

}
