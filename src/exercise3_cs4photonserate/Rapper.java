/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3_cs4photonserate;

/**
 *
 * @author PHOTON 25 SERATE
 */
public class Rapper {
    private String stagename;
    private String realname;
    private String birthplace;
    private String monthlyspotify;
    private int age;
    
    public Rapper(String stagename, String realname, String birthplace, int age, String monthlyspotify) {
        this.stagename = stagename;
        this.realname = realname;
        this.birthplace = birthplace;
        this.age = age;
        this.monthlyspotify = monthlyspotify;
    }
    
    
    
    // ----- Getters -----
    public String getStagename() {
        return stagename;
    }
    public String getRealname() {
        return realname;
    }
    public String getBirthplace() {
        return birthplace;
    }
    public String getMonthlyspotify() {
        return monthlyspotify;
    }
    public int getAge() {
        return age;
    }

    
    // ----- Setters -----
    public void setStagename(String stagename) {
        this.stagename = stagename;
    }
    public void setRealname(String realname) {
        this.realname = realname;
    }
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
    public void setMonthlyspotify(String monthlyspotify) {
        this.monthlyspotify = monthlyspotify;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
