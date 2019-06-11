package course.management.app;

public class Student {
    private int studentId;
    private String studentName;
    private String studentEmail;
    private String studentPass;
    private boolean registeredCourse;

    public Student(int studentId, String studentName, String studentEmail, String studentPass, boolean registeredCourse) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentPass = studentPass;
        this.registeredCourse = registeredCourse;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getStudentPass() {
        return studentPass;
    }

    public boolean isRegisteredCourse() {
        return registeredCourse;
    }
    
    
}
