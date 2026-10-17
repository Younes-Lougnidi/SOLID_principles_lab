package Problem5.problem5after;

public class Test {
    public static void main(String[] args){
        SmsNotifier sms = new SmsNotifier("SMS module");
        CsvStudentRepository csv = new CsvStudentRepository("students.csv");
        EnrollmentService es = new EnrollmentService(csv,sms);
        es.enroll("22885676", "SAFI Amal", "0612345678");
        es.enroll("22885676", "SAFI Amal", "0612345678");
    }
}
