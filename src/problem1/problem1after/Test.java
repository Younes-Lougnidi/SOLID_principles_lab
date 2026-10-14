package problem1.problem1after;

public class Test {
    public static void main(String[] args){
        InvoiceData inv = new InvoiceData("Alami Samir");
        inv.addLine("Laptop",9000);
        inv.addLine("Mouse", 150);
        inv.addLine("USB cable",50);
        System.out.print(InvoicePrinter.print(inv));
    }
}
