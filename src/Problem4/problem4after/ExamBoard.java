package Problem4.problem4after;

import java.util.List;

public class ExamBoard {
    public static void collectGrades(List<Teacher> teachers, String code){
        for(Teacher t : teachers){
            t.gradeExam(code);
        }
    }
}
