package problem1.problem1before;

public class Test {
    public static void main(String[] args){
        Invoice inv = new Invoice("Alami Samir");
        inv.addLine("Laptop",9000);
        inv.addLine("Mouse", 150);
        inv.addLine("USB cable",50);
        System.out.print(inv.print());
    }
}
