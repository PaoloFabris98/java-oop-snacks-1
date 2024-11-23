package org.classes;

import java.util.ArrayList;

public class StudentRegister {
    private ArrayList<Studente> studentList = new ArrayList<>();

    public StudentRegister() {
    };

    public void addStudent(Studente temp) {
        this.studentList.add(temp);
    };

    public ArrayList<Studente> getStudents() {
        return studentList;
    };

}
