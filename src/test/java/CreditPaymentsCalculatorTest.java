import org.junit.Assert;
import org.junit.Test;

public class CreditPaymentsCalculatorTest {
    // region getMonthPayment

    @Test(expected = IllegalArgumentException.class)
    public void getMonthPayment_AmountOverZero(){
        new CreditPaymentsCalculator().getMonthPayment(0, 0.15, 18);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getMonthPayment_InterestRateBetweenOverZero(){
        new CreditPaymentsCalculator().getMonthPayment(300_000, 0, 18);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getMonthPayment_MonthNumberOverZero(){
        new CreditPaymentsCalculator().getMonthPayment(300_000, 0.15, 0);
    }

    @Test
    public void getMonthPayment_Ok(){
        int res = new CreditPaymentsCalculator().getMonthPayment(300_000, 0.15, 18);

        Assert.assertEquals(18_715, res);
    }

    // endregion getMonthPayment

    // region getTotalSum

    @Test(expected = IllegalArgumentException.class)
    public void getTotalSum_AmountOverZero(){
        new CreditPaymentsCalculator().getTotalSum(0, 0.15, 18);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getTotalSum_InterestRateBetweenOverZero(){
        new CreditPaymentsCalculator().getTotalSum(300_000, 0, 18);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getTotalSum_MonthNumberOverZero(){
        new CreditPaymentsCalculator().getTotalSum(300_000, 0.15, 0);
    }

    @Test
    public void getTotalSum_Ok(){
        int res = new CreditPaymentsCalculator().getTotalSum(300_000, 0.15, 18);

        Assert.assertEquals(336_870, res);
    }

    // endregion getTotalSum

    // region getTotalInterest

    @Test(expected = IllegalArgumentException.class)
    public void getTotalInterest_AmountOverZero(){
        new CreditPaymentsCalculator().getTotalInterest(0, 0.15, 18);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getTotalInterest_InterestRateBetweenOverZero(){
        new CreditPaymentsCalculator().getTotalInterest(300_000, 0, 18);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getTotalInterest_MonthNumberOverZero(){
        new CreditPaymentsCalculator().getTotalInterest(300_000, 0.15, 0);
    }

    @Test
    public void getTotalInterest_Ok(){
        int res = new CreditPaymentsCalculator().getTotalInterest(300_000, 0.15, 18);

        Assert.assertEquals(36_870, res);
    }

    // endregion getTotalInterest
}
