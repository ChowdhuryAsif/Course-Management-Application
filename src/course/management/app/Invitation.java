package course.management.app;

public class Invitation {
    private String researchTopicName;
    private String memOneName;
    private int memOneId;
    private int memOneStatus;
    private String memTwoName;
    private int memTwoId;
    private int memTwoStatus;
    private String memThreeName;
    private int memThreeId;
    private int memThreeStatus;
    private String supervisorName;
    private int spervisorStatus;

    public Invitation(String researchTopicName, String memOneName, int memOneId, int memOneStatus, String memTwoName, int memTwoId, int memTwoStatus, String memThreeName, int memThreeId, int memThreeStatus, String supervisorName, int spervisorStatus) {
        this.researchTopicName = researchTopicName;
        this.memOneName = memOneName;
        this.memOneId = memOneId;
        this.memOneStatus = memOneStatus;
        this.memTwoName = memTwoName;
        this.memTwoId = memTwoId;
        this.memTwoStatus = memTwoStatus;
        this.memThreeName = memThreeName;
        this.memThreeId = memThreeId;
        this.memThreeStatus = memThreeStatus;
        this.supervisorName = supervisorName;
        this.spervisorStatus = spervisorStatus;
    }

    public String getResearchTopicName() {
        return researchTopicName;
    }

    public String getMemOneName() {
        return memOneName;
    }

    public int getMemOneId() {
        return memOneId;
    }

    public int getMemOneStatus() {
        return memOneStatus;
    }

    public String getMemTwoName() {
        return memTwoName;
    }

    public int getMemTwoId() {
        return memTwoId;
    }

    public int getMemTwoStatus() {
        return memTwoStatus;
    }

    public String getMemThreeName() {
        return memThreeName;
    }

    public int getMemThreeId() {
        return memThreeId;
    }

    public int getMemThreeStatus() {
        return memThreeStatus;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public int getSpervisorStatus() {
        return spervisorStatus;
    }

    @Override
    public String toString() {
        return String.format("Research on: %s with %s, %s, %s and Supervisor: %s", researchTopicName, memOneName, memTwoName, memThreeName, supervisorName);
    }

}
