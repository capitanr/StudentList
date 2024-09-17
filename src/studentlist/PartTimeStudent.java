/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
 *
 * @author Reden
 */
public class PartTimeStudent extends Student {
    
    private int numCourses;
    
    public PartTimeStudent(String name) {
        super(name);
    }
    
    public int getNumCourses() {
        return numCourses;
    }
    
    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
}
