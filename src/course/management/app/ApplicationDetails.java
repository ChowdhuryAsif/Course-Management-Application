package course.management.app;

public class ApplicationDetails extends Application{
    private int applicantOneStatus;
    private int applicantTwoStatus;
    private int applicantThreeStatus;
    private String supervisorInitial;
    private int supervisorStatus;
    private int applicantionStatus;

    public ApplicationDetails(int applicantOneStatus, int applicantTwoStatus, int applicantThreeStatus, String supervisorInitial, int supervisorStatus, int applicantionStatus, String researchTopicName, int memOneId, String memOneName, int memTwoId, String memTwoName, int memThreeId, String memThreeName) {
        super(researchTopicName, memOneId, memOneName, memTwoId, memTwoName, memThreeId, memThreeName);
        this.applicantOneStatus = applicantOneStatus;
        this.applicantTwoStatus = applicantTwoStatus;
        this.applicantThreeStatus = applicantThreeStatus;
        this.supervisorInitial = supervisorInitial;
        this.supervisorStatus = supervisorStatus;
        this.applicantionStatus = applicantionStatus;
    }

    public int getApplicantOneStatus() {
        return applicantOneStatus;
    }

    public int getApplicantTwoStatus() {
        return applicantTwoStatus;
    }

    public int getApplicantThreeStatus() {
        return applicantThreeStatus;
    }

    public String getSupervisorInitial() {
        return supervisorInitial;
    }

    public int getSupervisorStatus() {
        return supervisorStatus;
    }

    public int getApplicantionStatus() {
        return applicantionStatus;
    }

}
