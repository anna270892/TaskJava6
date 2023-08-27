public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double calculation1 = service.calculate(9.99, 1000000, 1);
        System.out.println((int)calculation1);

        double calculation2 = service.calculate(9.99, 1000000, 2);
        System.out.println((int)calculation2);

        double calculation3 = service.calculate(9.99, 1000000, 3);
        System.out.println((int)calculation3);
    }
}

