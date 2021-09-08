/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiPractise;


public class Person {
    int id;
   
    String address;
    int playing;
     int reading ;
    String gender;
    String age_grp;

    public Person(int id,  String address, int playing, int reading, String gender, String age_grp) {
        this.id = id;
       
        this.address = address;
        this.playing = playing;
        this.reading = reading;
        this.gender = gender;
        this.age_grp = age_grp;
    }
    
    public Person(Person p) {
        this.id = p.id;
        
        this.address = p.address;
        this.playing = p.playing;
        this.reading = p.reading;
        this.gender =p. gender;
        this.age_grp = p.age_grp;
    }

    public Person() {
  this.id = 0;
        
        this.address = "";
        this.playing = 0;
        this.reading = 0;
        this.gender ="";
        this.age_grp = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPlaying() {
        return playing;
    }

    public void setPlaying(int playing) {
        this.playing = playing;
    }

    public int getReading() {
        return reading;
    }

    public void setReading(int reading) {
        this.reading = reading;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge_grp() {
        return age_grp;
    }

    public void setAge_grp(String age_grp) {
        this.age_grp = age_grp;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", address=" + address + ", playing=" + playing + ", reading=" + reading + ", gender=" + gender + ", age_grp=" + age_grp + '}';
    }

  
}

