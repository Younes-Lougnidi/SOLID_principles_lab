package Problem4.problem4after;

import java.util.List;

public class Registrar {
    public static void enrollAll(List<Learner> learners,String code){
        for(Learner l : learners){
            l.enrollInCourse(code);
        }
    }
}
