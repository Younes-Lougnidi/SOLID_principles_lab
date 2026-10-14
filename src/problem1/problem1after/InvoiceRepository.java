package problem1.problem1after;

import java.io.FileWriter;
import java.io.IOException;

public class InvoiceRepository {
    public static void save(InvoiceData invoice) throws IOException {
        try (FileWriter fw = new FileWriter(invoice.getCustomer() + ".txt")) {
            fw.write(InvoicePrinter.print(invoice));
        }
    }
}
