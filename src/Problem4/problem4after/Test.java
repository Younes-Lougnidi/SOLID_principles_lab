package Problem4.problem4after;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        TeachingAssistant t1 = new TeachingAssistant("ALAMI Samir");
        Student s1 = new Student("SAFI Amal");
        Professor p1 = new Professor("Prof.KALLOUBI");
        List<Learner> learners = new ArrayList<>(List.of(s1,t1));
        List<Teacher> teachers = new ArrayList<>(List.of(p1,t1));
        Registrar.enrollAll(learners,"SE101");
        ExamBoard.collectGrades(teachers,"SE101");

    }
}
