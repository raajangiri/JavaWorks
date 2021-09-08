
package oop;

//  here finalstudents is distination child sub class 
// and newStudents in source parent parent class 
public class FinalStudent extends NewStudents {

    String grade;
    String section;

    public FinalStudent() {
        super();// super class constructor 
        this.grade = "";
        this.section = "";
    }

    public FinalStudent(int id, String name, String grade, String section) {
        super(id, name);
        this.grade = grade;
        this.section = section;
    }

    public FinalStudent(FinalStudent fs) {
        super.setID(fs.getID());
        super.setName(fs.getName());
        this.grade = fs.grade;
        this.section = fs.section;
    }

    @Override
    public int getID() {
        return super.getID();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setID(int id) {
        super.setID(id);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public String getGrade() {
        return this.grade;
    }

    public String getSection() {
        return this.section;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "section is "
                + section + "  grade is " + grade;
    }
}
