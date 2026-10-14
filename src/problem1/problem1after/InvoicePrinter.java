package problem1.problem1after;

public class InvoicePrinter {
    public static String print(InvoiceData invoice) {
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice for ").append(invoice.getCustomer()).append("\n");
        for(int i = 0 ; i < invoice.getItems().size() ; i ++ ){
        sb.append(line(invoice.getItems().get(i),invoice.getPrices().get(i)));
        }
        sb.append(line("Subtotal",InvoiceCalculator.subtotal(invoice)));
        sb.append(line("TOTAL",InvoiceCalculator.total(invoice)));
        return sb.toString();
    }
    private static String line(String label, double value){
        return String.format("%-12s %8.2f%n",label,value);
    }
}
