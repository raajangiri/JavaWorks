/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 *
 * @author IAmNotIntrovert
 */
public class Student {
    String grade;
    String section;

    public Student(String grade, String section) {
        this.grade = grade;
        this.section = section;
    }
        public Student(Student S) {
        this.grade = S.grade;
        this.section = S.section;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Student{" + "grade=" + grade + ", section=" + section + '}';
    }
        
    public void PrintStudent()
    {
        System.out.println("Student{" + "grade=" + grade + ", section=" + section + '}');
    }
    
    
    
}
