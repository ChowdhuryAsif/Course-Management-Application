
package course.management.app;


public class Application {
    private String researchTopicName;
    private int memOneId;
    private String memOneName;
    private int memTwoId;
    private String memTwoName;
    private int memThreeId;
    private String memThreeName;

    public Application(String researchTopicName, int memOneId, String memOneName, int memTwoId, String memTwoName, int memThreeId, String memThreeName) {
        this.researchTopicName = researchTopicName;
        this.memOneId = memOneId;
        this.memOneName = memOneName;
        this.memTwoId = memTwoId;
        this.memTwoName = memTwoName;
        this.memThreeId = memThreeId;
        this.memThreeName = memThreeName;
    }

    public String getResearchTopicName() {
        return researchTopicName;
    }

    public int getMemOneId() {
        return memOneId;
    }

    public String getMemOneName() {
        return memOneName;
    }

    public int getMemTwoId() {
        return memTwoId;
    }

    public String getMemTwoName() {
        return memTwoName;
    }

    public int getMemThreeId() {
        return memThreeId;
    }

    public String getMemThreeName() {
        return memThreeName;
    }
    

}
