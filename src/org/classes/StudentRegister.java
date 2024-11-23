package org.classes;

import java.util.ArrayList;

public class StudentRegister {
    private ArrayList<Studente> studentList = new ArrayList<>();

    public StudentRegister() {
    };

    public void addStudent(Studente temp) {
        if (temp.nameReturning() != null && temp.surnameReturning() != null && temp.ageReturning() > 0) {
            this.studentList.add(temp);
        } else {
            System.out.println("Studente non valido, non aggiunto al registro.");
        }
    }

    public ArrayList<Studente> getStudents() {
        return studentList;
    };

}
