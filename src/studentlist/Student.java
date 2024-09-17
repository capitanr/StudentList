package studentlist;

/**
 *
 * @author paulbonenfant
 * 2024-09-17
 */
public class Student {

    private String name;
    private String studentID;
    private String address;

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getAddress() {
        return address;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
