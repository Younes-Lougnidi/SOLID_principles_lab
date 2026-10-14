package problem1.problem1after;

public class InvoiceCalculator {
    public static double subtotal(InvoiceData invoice){
        double sum = 0;
        for(double p : invoice.getPrices()){
            sum += p;
        }
        return sum;
    }
    public static double total(InvoiceData invoice){
        return subtotal(invoice) * 1.20;
    }
}
