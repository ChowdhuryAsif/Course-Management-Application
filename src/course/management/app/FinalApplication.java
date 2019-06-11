
package course.management.app;


public class FinalApplication extends Application{
    private String facultyName;

    public FinalApplication(String researchTopicName, int memOneId, String memOneName, int memTwoId, String memTwoName, int memThreeId, String memThreeName, String facultyName) {
        super(researchTopicName, memOneId, memOneName, memTwoId, memTwoName, memThreeId, memThreeName);
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }
    
    
}
