
package course.management.app;


public class StudentsInfo {
    private String researchTopicName;
    private String studentName;
    private int studentId;

    public StudentsInfo(String researchTopicName, String studentName, int studentId) {
        this.researchTopicName = researchTopicName;
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public String getResearchTopicName() {
        return researchTopicName;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }
    
    
}
