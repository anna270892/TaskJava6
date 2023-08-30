public class CreditPaymentService {
    public double calculate(double annualRate, double amountOfCredit, double creditTerm) {  //годовая ставка, сумма кредита, срок кредита
        double termInMonths = creditTerm * 12; // срок кредита в месяцах
        double interestRatePerMonth = annualRate / termInMonths / 100; // ставка за 1 месяц

        double annuityRatio = interestRatePerMonth * Math.pow((1 + interestRatePerMonth), termInMonths) / (Math.pow((1 + interestRatePerMonth), termInMonths) - 1);
        double monthlyPayment = annuityRatio * amountOfCredit;
        return monthlyPayment;
    }
}

