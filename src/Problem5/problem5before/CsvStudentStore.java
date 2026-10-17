package Problem5.problem5before;

import java.util.ArrayList;
import java.util.List;

public class CsvStudentStore {
    private String name;
    private List<StudentRow> csv;

    public CsvStudentStore(String name) {
        this.name = name;
        csv = new ArrayList<>();
    }
    public void append(String cne,String name,String email){
        StudentRow row = new StudentRow(cne,name,email);
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

