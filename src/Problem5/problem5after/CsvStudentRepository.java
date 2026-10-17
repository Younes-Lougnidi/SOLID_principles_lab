package Problem5.problem5after;


import java.util.ArrayList;
import java.util.List;

public class CsvStudentRepository implements StudentRepository{
    private String name;
    private List<StudentRow> csv;

    public CsvStudentRepository(String name) {
        this.name = name;
        csv = new ArrayList<>();
    }
    public void save(String cne,String name,String contactinfo){
        StudentRow row = new StudentRow(cne,name,contactinfo);
        csv.add(row);
    }
    public boolean exists(String cne){
        for(StudentRow row : csv){
            if (row.cne().equals(cne)){
                return true;
            }
        }
        return false;
    }
}
