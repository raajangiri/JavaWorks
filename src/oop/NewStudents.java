/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author IAmNotIntrovert
 */
public class NewStudents {

    public int id;
    public String name;

    public NewStudents() {
        this.id = 0;
        this.name = "";
    }

    public NewStudents(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public NewStudents(NewStudents s) {
        this.id = s.id;
        this.name = s.name;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name is " + this.name + " id is " + this.id;
    }

}
