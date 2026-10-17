package Problem5.problem5after;

public class SmsNotifier implements Notifier{
    private String name;
    public SmsNotifier(String name) {
        this.name = name;
    }
    public void notify(String to,String message){
        System.out.println("[SMS to "+to+"] " + message);
    }
}
