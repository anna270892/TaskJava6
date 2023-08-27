public class CreditPaymentService {
    public double calculate (double annualRate, double amountOfCredit, double creditTerm) {  //годовая ставка, сумма кредита, срок кредита
        double TermInMonths = creditTerm * 12; // срок кредита в месяцах
        double interestRatePerMonth = annualRate / TermInMonths / 100; // ставка за 1 месяц

        double AnnuityRatio = interestRatePerMonth * Math.pow ((1+interestRatePerMonth),TermInMonths) / (Math.pow ((1+interestRatePerMonth),TermInMonths)-1);
        double MonthlyPayment = AnnuityRatio * amountOfCredit;
        return MonthlyPayment;
    }
}

