package Problem4.problem4before;

public class Professor {
    private final String name;
    public Professor(String name){this.name = name;}
    public void enrollInCourse(String code){
        throw new UnsupportedOperationException();
    }
    public void payTuition(double amount){
        throw new UnsupportedOperationException();
    }
    public void teach(String code){
        System.out.println(name + " teaches the course :" + code);
    }
    public void gradeExam(String code ){
        System.out.println(name + " grades the exam :" + code);
    }
    public void publishPaper(String title){
        throw new UnsupportedOperationException();
    }
}
