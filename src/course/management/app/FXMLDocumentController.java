
package course.management.app;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

/**
 *
 * @author chowd
 */
public class FXMLDocumentController implements Initializable {

    private Connection connection = null;
    @FXML
    private Button studentButton;
    @FXML
    private Button facultyButton;
    @FXML
    private Button chairmanButton;
    @FXML
    private BorderPane mainPane;
    @FXML
    private TextField studentIDField;
    @FXML
    private PasswordField studentPassField;
    @FXML
    private AnchorPane studentPane;
    @FXML
    private BorderPane studentDashBoardPane;
    @FXML
    private BorderPane studentLoginPane;
    @FXML
    private Button studentRegistration;
    @FXML
    private Button studentDashboard;
    @FXML
    private Button studentApplication;
    @FXML
    private Button studentLogOut;
    @FXML
    private Button studentGroupInfo;
    @FXML
    private AnchorPane container;
    @FXML
    private AnchorPane registrationContainer;
    @FXML
    private AnchorPane dashboardContainer;
    @FXML
    private ListView<Course> offeredCourseListView;
    @FXML
    private ListView<Course> registeredCourseListView;
    @FXML
    private AnchorPane applicationContainer;
    @FXML
    private TextField applicant1NameField;
    @FXML
    private TextField applicant1IdField;
    @FXML
    private TextField applicant2NameField;
    @FXML
    private TextField applicant2IdField;
    @FXML
    private TextField applicant3NameField;
    @FXML
    private TextField applicant3IdField;
    @FXML
    private TextField researchTopicNameField;
    @FXML
    private ComboBox<Faculty> facultyComboBox;
    @FXML
    private Label studentNameStatus;
    @FXML
    private Label studentIdStatus;
    @FXML
    private Label paneStatus;
    @FXML
    private AnchorPane groupInfoContainer;
    @FXML
    private AnchorPane invitationListPane;
    
    ObservableList <Course> offeredCourseList;
    ObservableList <Course> registeredCourseList;
    ObservableList <Faculty> facultyList;
    ObservableList <Invitation> invitationList;
    ObservableList <Application> applicationList;
    ObservableList <Application> groupList;
    ObservableList <StudentsInfo> individualStudentList;
    ObservableList <FinalApplication> finalApplicationList;
    ObservableList <String> semesterList;
    ObservableList <String> semesterListST;
    ObservableList <ApplicationDetails> teamList;
    
    @FXML
    private Label invitationCount;
    @FXML
    private TableView<Invitation> invitationTableView;
    @FXML
    private TableColumn<Invitation, String> researchTopicName;
    @FXML
    private TableColumn<Invitation, String> mem1Name;
    @FXML
    private TableColumn<Invitation, String> mem1Status;
    @FXML
    private TableColumn<Invitation, String> mem2Name;
    @FXML
    private TableColumn<Invitation, String> mem2Status;
    @FXML
    private TableColumn<Invitation, String> mem3Name;
    @FXML
    private TableColumn<Invitation, String> mem3Status;
    @FXML
    private TableColumn<Invitation, String> supervisorName;
    @FXML
    private TableColumn<Invitation, String> supervisorStatus;
    @FXML
    private Button courseRegisterButton;
    @FXML
    private Button applyConfirmButton;
    @FXML
    private Button invitationConfirmButton;
    @FXML
    private AnchorPane facultyPane;
    @FXML
    private BorderPane facultyLoginPane;
    @FXML
    private TextField facultyInitialField;
    @FXML
    private PasswordField facultyPassField;
    @FXML
    private Label facultyNameStatus;
    @FXML
    private Label facultyInitialsStatus;
    @FXML
    private Label paneStatusFaculty;
    @FXML
    private BorderPane facultyDashboardPane;
    @FXML
    private Button facultyApplicationsButton;
    @FXML
    private Button facultyDashboardButton;
    @FXML
    private Button facultyLogOutButton;
    @FXML
    private Button facultyStudentsInfoButton;
    @FXML
    private AnchorPane facultyDashboardContainer;
    @FXML
    private AnchorPane facultyApplicatoinsContainer;
    @FXML
    private AnchorPane ApplicationListPane;
    @FXML
    private TableView<Application> ApplicationTableView;
    @FXML
    private TableColumn<Application, String> researchTopicNameF;
    @FXML
    private TableColumn<Application, String> mem1NameF;
    @FXML
    private TableColumn<Application, String> mem2NameF;
    @FXML
    private TableColumn<Application, String> mem3NameF;
    @FXML
    private TableColumn<Application, String> mem1IDF;
    @FXML
    private TableColumn<Application, String> mem2IDF;
    @FXML
    private TableColumn<Application, String> mem3IDF;
    @FXML
    private AnchorPane facultycontainer;
    @FXML
    private Label applicationCount;
    @FXML
    private AnchorPane facultyStudentContainer;
    @FXML
    private AnchorPane groupListPane;
    @FXML
    private TableView<Application> groupTableView;
    @FXML
    private TableColumn<Application, String> groupResearchTopicName;
    @FXML
    private TableColumn<Application, String> groupMem1Name;
    @FXML
    private TableColumn<Application, String> groupMem1ID;
    @FXML
    private TableColumn<Application, String> groupMem2Name;
    @FXML
    private TableColumn<Application, String> groupMem2ID;
    @FXML
    private TableColumn<Application, String> groupMem3Name;
    @FXML
    private TableColumn<Application, String> groupMem3ID;
    @FXML
    private AnchorPane individualStudentListPane;
    @FXML
    private TableView<StudentsInfo> facultyStudentInfoTableView;
    @FXML
    private TableColumn<StudentsInfo, String> studentResearchTopicName;
    @FXML
    private TableColumn<StudentsInfo, String> studentName;
    @FXML
    private TableColumn<StudentsInfo, String> studentID;
    @FXML
    private Label groupCount;
    @FXML
    private Label studentCount;
    @FXML
    private BorderPane chairmanLoginPane;
    @FXML
    private TextField chairmanInitialField;
    @FXML
    private PasswordField chairmanPassField;
    @FXML
    private BorderPane chairmanDashboardPane;
    @FXML
    private AnchorPane chairmanPane;
    @FXML
    private Label chairmanNameStatus;
    @FXML
    private Label paneStatusChairman;
    @FXML
    private Button chairmanApplicationsButton;
    @FXML
    private Button chairmanDashboardButton;
    @FXML
    private Button chairmanLogOutButton;
    @FXML
    private AnchorPane chairmanContainer;
    @FXML
    private AnchorPane chairmanDashboardContainer;
    @FXML
    private AnchorPane chairmanApplicatoinsContainer;
    @FXML
    private AnchorPane applicationListPaneFinal;
    @FXML
    private TableView<FinalApplication> finalApplicationTableView;
    @FXML
    private TableColumn<FinalApplication, String> groupResearchTopicNameFinal;
    @FXML
    private TableColumn<FinalApplication, String> groupMem1NameFinal;
    @FXML
    private TableColumn<FinalApplication, String> groupMem1IDFinal;
    @FXML
    private TableColumn<FinalApplication, String> groupMem2IDFinal;
    @FXML
    private TableColumn<FinalApplication, String> groupMem2NameFinal;
    @FXML
    private TableColumn<FinalApplication, String> groupMem3NameFinal;
    @FXML
    private TableColumn<FinalApplication, String> groupMem3IDFinal;
    @FXML
    private TableColumn<FinalApplication, String> groupSupervisorNameFinal;
    @FXML
    private Button confirmApplicationFinalButton;
    @FXML
    private Button setDeadlineButton;
    @FXML
    private AnchorPane deadlineContainer;
    @FXML
    private DatePicker applicationDeadlineDatePicker;
    @FXML
    private DatePicker facultyApprovalDataPicker;
    @FXML
    private DatePicker applicationApprovalDatePicker;
    @FXML
    private ComboBox<String> semesterComboBox;
    @FXML
    private DatePicker semesterFromDatePicker;
    @FXML
    private DatePicker semesterToDatePicker;
    @FXML
    private ComboBox<String> semesterComboBoxST;
    @FXML
    private ComboBox<String> semesterComboBoxFT;
    @FXML
    private AnchorPane accApplicationPane;
    @FXML
    private TableView<ApplicationDetails> teamStatusTableView;
    @FXML
    private TableColumn<ApplicationDetails, String> teamResearchTopicName;
    @FXML
    private TableColumn<ApplicationDetails, String> teamMemOneName;
    @FXML
    private TableColumn<ApplicationDetails, String> teamMemTwoName;
    @FXML
    private TableColumn<ApplicationDetails, String> teamMemThreeName;
    @FXML
    private TableColumn<ApplicationDetails, String> teamFacultyStatus;
    @FXML
    private TableColumn<ApplicationDetails, String> teamChairmanStatus;

    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mainPane.setVisible(true);
        studentPane.setVisible(false);
        facultyPane.setVisible(false);
        chairmanPane.setVisible(false);
        
        connection = getConnection();
        if(connection != null)
            System.out.println("Connected!!");
        
        offeredCourseList = FXCollections.observableArrayList();
        registeredCourseList = FXCollections.observableArrayList();
        Course course = new Course("CSE400", "Research Methodology");
        offeredCourseList.add(course);
        offeredCourseListView.setItems(offeredCourseList);
        registeredCourseListView.setItems(registeredCourseList);
        
        semesterList = FXCollections.observableArrayList();
        semesterList.add("Spring");
        semesterList.add("Summer");
        semesterList.add("Fall");
        semesterComboBox.setItems(semesterList);
        
        String currentYear = Integer.toString(LocalDate.now().getYear());
        semesterListST = FXCollections.observableArrayList();
        semesterListST.add("Spring"+currentYear);
        semesterListST.add("Summer"+currentYear);
        semesterListST.add("Fall"+currentYear);
        semesterComboBoxST.setItems(semesterListST);
        semesterComboBoxFT.setItems(semesterListST);

    }    

    @FXML
    private void handleStudentLoginButtonAction(ActionEvent event) {
        int studentId;
        String studentPassword = "";
        String studentName = "";
        String studentEmail = "";
        ResultSet resultSet = null;
        
        studentId = Integer.parseInt(studentIDField.getText());
        studentPassword = studentPassField.getText();
        
        Connection connection = getConnection();
        
        try{
            String query = String.format("select * from student where studentId = %d", studentId);
            
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            
            resultSet.next();
            if(studentPassword.equals(resultSet.getString("studentPass"))){
                mainPane.setVisible(false);
                    studentPane.setVisible(true);
                        studentLoginPane.setVisible(false);
                        studentDashBoardPane.setVisible(true);
                            container.setVisible(true);
                                dashboardContainer.setVisible(true);
                                registrationContainer.setVisible(false);
                                applicationContainer.setVisible(false);
                                groupInfoContainer.setVisible(false);
                    facultyPane.setVisible(false);
                        
                
                studentId = resultSet.getInt("studentId");
                studentName = resultSet.getString("studentName");
                studentEmail = resultSet.getString("studentEmail");

                System.out.println(studentId + " " + studentName + " " + studentEmail);
                studentNameStatus.setText(studentName);
                studentIdStatus.setText(Integer.toString(studentId));
                paneStatus.setText(studentDashboard.getText());
                
                
                updateFacultyStudentCount();
                addFacultyToComboBox();
            }
            else{
                mainPane.setVisible(false);
                    studentPane.setVisible(true);
                        studentLoginPane.setVisible(true);
                        studentDashBoardPane.setVisible(false);
                    facultyPane.setVisible(false);
            }
   
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }        
        clearForm();
    }
    
    @FXML
    private void handleStudentPassForgotButtonAction(ActionEvent event) {
        
    }
    
    public Connection getConnection(){
        final String USERNAME = "root";
        final String PASSWORD = "";
        final String DBNAME = "cmsdb";
        final String HOSTNAME = "127.0.0.1";
        final String URL = "jdbc:mysql://" + HOSTNAME + "/" + DBNAME;
        
        try{
            if(connection == null)
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch (SQLException sqle){
            System.err.println("Failed to connect");
            System.err.println(sqle);
        }
        
        return connection;
    }
    
    public void clearForm() {
        studentIDField.clear();
        studentPassField.clear();
        researchTopicNameField.clear();
        //applicant1NameField.clear();
        //applicant1IdField.clear();
        applicant2NameField.clear();
        applicant2IdField.clear();
        applicant3NameField.clear();
        applicant3IdField.clear();
        facultyInitialField.clear();
        facultyPassField.clear();
        chairmanInitialField.clear();
        chairmanPassField.clear();
        
    }

    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
        if(event.getTarget() == studentButton){
            mainPane.setVisible(false);
                studentPane.setVisible(true);
                    studentLoginPane.setVisible(true);
                    studentDashBoardPane.setVisible(false);
                facultyPane.setVisible(false);
        }
        else if(event.getTarget() == facultyButton){
            mainPane.setVisible(false);
                studentPane.setVisible(false);
                facultyPane.setVisible(true);
                    facultyLoginPane.setVisible(true);
                    facultyDashboardPane.setVisible(false);
        }
        else if(event.getTarget() == chairmanButton){
            mainPane.setVisible(false);
                studentPane.setVisible(false);
                facultyPane.setVisible(false);
                chairmanPane.setVisible(true);
                    chairmanLoginPane.setVisible(true);
                    chairmanDashboardPane.setVisible(false);
        }
    }

    @FXML
    private void handleStudentMenuButtonAction(ActionEvent event) {
        
        if(event.getTarget() == studentDashboard){
            paneStatus.setText(studentDashboard.getText());
            mainPane.setVisible(false);
                studentPane.setVisible(true);
                    studentLoginPane.setVisible(false);
                    studentDashBoardPane.setVisible(true);
                        container.setVisible(true);
                            dashboardContainer.setVisible(true);
                            registrationContainer.setVisible(false);
                            applicationContainer.setVisible(false);
                            groupInfoContainer.setVisible(false);
                facultyPane.setVisible(false);
                
        }
        else if(event.getTarget() == studentRegistration){
            paneStatus.setText(studentRegistration.getText());
            handleStudentRegistrationContainer();
        }
        else if(event.getTarget() == studentApplication){
            paneStatus.setText(studentApplication.getText());
            handleStudentApplicationContainer();
        }
        else if(event.getTarget() == studentGroupInfo){
            paneStatus.setText(studentGroupInfo.getText());
            handleGroupInfoContainer();
        }
        else if(event.getTarget() == studentLogOut){
            registeredCourseList.clear();
            updateFacultyStudentCount();
            mainPane.setVisible(false);
                studentPane.setVisible(true);
                    studentLoginPane.setVisible(true);
                    studentDashBoardPane.setVisible(false);
                facultyPane.setVisible(false);
        }
    }

    private void handleStudentRegistrationContainer() {
        mainPane.setVisible(false);
            studentPane.setVisible(true);
                studentLoginPane.setVisible(false);
                studentDashBoardPane.setVisible(true);
                    container.setVisible(true);
                        dashboardContainer.setVisible(false);
                        registrationContainer.setVisible(true);
                        applicationContainer.setVisible(false);
                        groupInfoContainer.setVisible(false);
            facultyPane.setVisible(false);
                        

        if(isRegistered()){
            if(registeredCourseList.size() == 0)
                registeredCourseList.add(new Course("CSE4000", "Research Methodology"));
            courseRegisterButton.setDisable(true);
        }
        else
            courseRegisterButton.setDisable(false);
    }

    @FXML
    private void handleCourseRegisterButtonAction(ActionEvent event) {
        try {
            connection = getConnection();
            int studentId = Integer.parseInt(studentIdStatus.getText());
            System.out.println(studentId);
            String query = String.format("update student set registeredForCSE4000 = true where studentId = %d", studentId);
            
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            
            Course course = offeredCourseListView.getSelectionModel().getSelectedItem();
            registeredCourseList.add(course);
            courseRegisterButton.setDisable(true);
            
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        
    }

    private void handleStudentApplicationContainer() {
        mainPane.setVisible(false);
            studentPane.setVisible(true);
                studentLoginPane.setVisible(false);
                studentDashBoardPane.setVisible(true);
                    container.setVisible(true);
                        dashboardContainer.setVisible(false);
                        registrationContainer.setVisible(false);
                        applicationContainer.setVisible(true);
                        groupInfoContainer.setVisible(false);
            facultyPane.setVisible(false);
        
        applicant1NameField.setText(studentNameStatus.getText());
        applicant1IdField.setText(studentIdStatus.getText());

        if(isRegistered())
            applyConfirmButton.setDisable(false);
        else
            applyConfirmButton.setDisable(true);
    }

    @FXML
    private void handleResetButtonAction(ActionEvent event) {
        clearForm();
    }

    @FXML
    private void handleApplyConfirmButtonAction(ActionEvent event) {
        
        String researchTopicName = researchTopicNameField.getText();
        String applicantOneName = applicant1NameField.getText();
        Integer applicantOneId = Integer.parseInt(applicant1IdField.getText());
        String applicantTwoName = null;
        Integer applicantTwoId = null;
        String applicantThreeName = null;
        Integer applicantThreeId = null;
        
        if(!applicant2NameField.getText().trim().isEmpty()){
            applicantTwoName = applicant2NameField.getText();
            applicantTwoId = Integer.parseInt(applicant2IdField.getText());
        }
        
        if(!applicant3NameField.getText().trim().isEmpty()){
            applicantThreeName = applicant3NameField.getText();
            applicantThreeId = Integer.parseInt(applicant3IdField.getText());
        }
        
        
        String supervisorInitial = facultyComboBox.getValue().getFacultyInitial();
        
        int loggedStudentId = Integer.parseInt(studentIdStatus.getText());
        
        LocalDate currentDate = LocalDate.now();
        String currentSemester = semesterComboBoxST.getValue();
        
        try{
           connection = getConnection();
           String query = String.format("select * from deadline where semesterID = '%s'", currentSemester);
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery(query);
           resultSet.next();
           LocalDate applicationDeadline = LocalDate.parse(resultSet.getString("researchApplicationDeadline"));
           
           if(currentDate.isAfter(applicationDeadline)){
               String text = "Application deadline is over, you cannot apply for Research in this semester.";
               showErrorNotification(text);
           }
           else{
               try{
                   connection = getConnection();
                   query = String.format("select * from student where studentId = %d", loggedStudentId);
                   statement = connection.createStatement();
                   resultSet = statement.executeQuery(query);
                   resultSet.next();
                   int applicationCountRes = resultSet.getInt("applicationCount");
                   
                   if(applicationCountRes >= 3){
                        String text = "You cannot apply more than 3 times for Research.";
                        showErrorNotification(text);
                   }
                   else{
                      try{
                          connection = getConnection();
                          query = String.format("insert into applicationdetails (researchTopicName, mem1ID, mem1Name, mem2ID, mem2Name, mem3ID, mem3Name, supervisorName) values ('%s', %d, '%s', %d, '%s', %d, '%s', '%s')",
                                researchTopicName, applicantOneId, applicantOneName,
                                applicantTwoId, applicantTwoName, applicantThreeId,
                                applicantThreeName, supervisorInitial);

                          statement = connection.createStatement();
                          statement.executeUpdate(query);

                          query = String.format("update student set researchConfirmation = true where studentId = %d", loggedStudentId);
                          statement = connection.createStatement();
                          statement.executeUpdate(query);
                          
                          query = String.format("update student set applicationCount = %d where studentId = %d", applicationCountRes+1, loggedStudentId);
                          statement = connection.createStatement();
                          statement.executeUpdate(query);

                          clearForm();
                          
                      } catch (SQLException ex){
                            System.err.println(ex);
                        } 
                   }
                   
               } catch (SQLException ex){
                   System.err.println(ex);
               }

           }

        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    @FXML
    private void handleInvitationsButtomAction(ActionEvent event) {
        invitationListPane.setVisible(true);
        accApplicationPane.setVisible(false);
    }
    
    @FXML
    private void handleAcceptedApplicationButton(ActionEvent event) {
        invitationListPane.setVisible(false);
        accApplicationPane.setVisible(true);
    }

    private void handleGroupInfoContainer() {
        mainPane.setVisible(false);
            studentPane.setVisible(true);
                studentLoginPane.setVisible(false);
                studentDashBoardPane.setVisible(true);
                    container.setVisible(true);
                        dashboardContainer.setVisible(false);
                        registrationContainer.setVisible(false);
                        applicationContainer.setVisible(false);
                        groupInfoContainer.setVisible(true);
                            invitationListPane.setVisible(false);
                            accApplicationPane.setVisible(false);
            facultyPane.setVisible(false);
        
        if(!isRegistered())
            invitationConfirmButton.setDisable(true);
        else
            invitationConfirmButton.setDisable(false);
        
        try{
            connection = getConnection();
            int myStudentId = Integer.parseInt(studentIdStatus.getText());
            String query = String.format("select * from applicationdetails where mem2ID = %d or mem3ID = %d", myStudentId, myStudentId);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(query);
            
            invitationList = FXCollections.observableArrayList();
            while(resultSet.next()){
                String researchTopicName = resultSet.getString("researchTopicName");
                String memOneName = resultSet.getString("mem1Name");
                int memOneId = resultSet.getInt("mem1ID");
                int memOneStatus = resultSet.getInt("mem1Status");
                String memTwoName = resultSet.getString("mem2Name");
                int memTwoId = resultSet.getInt("mem2ID");
                int memTwoStatus = resultSet.getInt("mem2Status");
                String memThreeName = resultSet.getString("mem3Name");
                int memThreeId = resultSet.getInt("mem3ID");
                int memThreeStatus = resultSet.getInt("mem3Status");
                String supervisorName = resultSet.getString("supervisorName");
                int supervisorStatus = resultSet.getInt("supervisorStatus");
                
                Invitation invitation = new Invitation(
                        researchTopicName,
                        memOneName,
                        memOneId,
                        memOneStatus,
                        memTwoName,
                        memTwoId,
                        memTwoStatus,
                        memThreeName,
                        memThreeId,
                        memThreeStatus,
                        supervisorName,
                        supervisorStatus
                );
                invitationList.add(invitation);
            }
            
            invitationTableView.setItems(invitationList);
            
            researchTopicName.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getResearchTopicName()));
            
            mem1Name.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMemOneName()));
            mem1Status.setCellValueFactory(data -> new SimpleStringProperty(Integer.toString(data.getValue().getMemOneStatus())));
            
            mem2Name.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMemTwoName()));
            mem2Status.setCellValueFactory(data -> new SimpleStringProperty(Integer.toString(data.getValue().getMemTwoStatus())));
            
            mem3Name.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMemThreeName()));
            mem3Status.setCellValueFactory(data -> new SimpleStringProperty(Integer.toString(data.getValue().getMemThreeStatus())));
            
            supervisorName.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getSupervisorName()));
            supervisorStatus.setCellValueFactory(data -> new SimpleStringProperty(Integer.toString(data.getValue().getSpervisorStatus())));
  
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        invitationCount.setText(Integer.toString(invitationList.size()));
        
        try{
            connection = getConnection();
            int myStudentId = Integer.parseInt(studentIdStatus.getText());
            String query = String.format("select * from applicationdetails where mem1ID = %d or mem2ID = %d or mem3ID = %d", myStudentId, myStudentId, myStudentId);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(query);
            
            teamList = FXCollections.observableArrayList();
            while(resultSet.next()){
                String researchTopicName = resultSet.getString("researchTopicName");
                String memOneName = resultSet.getString("mem1Name");
                int memOneId = resultSet.getInt("mem1ID");
                int memOneStatus = resultSet.getInt("mem1Status");
                String memTwoName = resultSet.getString("mem2Name");
                int memTwoId = resultSet.getInt("mem2ID");
                int memTwoStatus = resultSet.getInt("mem2Status");
                String memThreeName = resultSet.getString("mem3Name");
                int memThreeId = resultSet.getInt("mem3ID");
                int memThreeStatus = resultSet.getInt("mem3Status");
                String supervisorName = resultSet.getString("supervisorName");
                int supervisorStatus = resultSet.getInt("supervisorStatus");
                int applicationStatus = resultSet.getInt("applicationStatus");
                
                ApplicationDetails accApplications = new ApplicationDetails(
                        memOneStatus,
                        memTwoStatus,
                        memThreeStatus,
                        supervisorName,
                        supervisorStatus,
                        applicationStatus,
                        researchTopicName,
                        memOneId,
                        memOneName,
                        memTwoId,
                        memTwoName,
                        memThreeId,                        
                        memThreeName);
                
                teamList.add(accApplications);
            }
            
            teamStatusTableView.setItems(teamList);
            
            teamResearchTopicName.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getResearchTopicName()));
            teamMemOneName.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMemOneName()));
            teamMemTwoName.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMemTwoName()));
            teamMemThreeName.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMemThreeName()));
            teamFacultyStatus.setCellValueFactory(data -> new SimpleStringProperty(Integer.toString(data.getValue().getSupervisorStatus())));
            teamChairmanStatus.setCellValueFactory(data -> new SimpleStringProperty(Integer.toString(data.getValue().getApplicantionStatus())));
  
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
    
    public boolean isRegistered(){
        boolean registered = false;
        
        try{
            connection = getConnection();
            Integer loggedStudentId = Integer.parseInt(studentIdStatus.getText());
            String query = String.format("select * from student where studentId = %d", loggedStudentId);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            registered = resultSet.getBoolean("registeredForCSE4000");
            
            return registered;
            
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        
        return registered;
    }

    @FXML
    private void invitationConfirmButtonAction(ActionEvent event) {
        Invitation invitation = invitationTableView.getSelectionModel().getSelectedItem();
        Integer loggedStudentId = Integer.parseInt(studentIdStatus.getText());
        
        System.out.println(invitation.getMemTwoId() + " " + invitation.getMemThreeId());
        try{
            connection = getConnection();
            
            String query = String.format("update student set researchConfirmation = true where studentId = %d", loggedStudentId);
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            
            if(loggedStudentId.equals(invitation.getMemOneId())){
                query = String.format("update applicationdetails set mem1Status = true where researchTopicName = '%s' and supervisorName = '%s'",
                        invitation.getResearchTopicName(),
                        invitation.getSupervisorName());
            }
            else if(loggedStudentId.equals(invitation.getMemTwoId())){
                query = String.format("update applicationdetails set mem2Status = true where researchTopicName = '%s' and supervisorName = '%s'",
                        invitation.getResearchTopicName(),
                        invitation.getSupervisorName());
            }
            else{
                query = String.format("update applicationdetails set mem3Status = true where researchTopicName = '%s' and supervisorName = '%s'",
                        invitation.getResearchTopicName(),
                        invitation.getSupervisorName());
            }
            
            statement = connection.createStatement();
            statement.executeUpdate(query);
            
            
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    @FXML
    private void handleFacultyLoginButtonAction(ActionEvent event) {
        String facultyInitial;
        String facultyPassword;
        ResultSet resultSet = null;
        
        facultyInitial = facultyInitialField.getText();
        facultyPassword = facultyPassField.getText();
        
        Connection connection = getConnection();
        
        try{
            String query = String.format("select * from supervisor where facultyInitial = '%s'", facultyInitial);
            
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            
            resultSet.next();
            if(facultyPassword.equals(resultSet.getString("facultyPass"))){
                mainPane.setVisible(false);
                    studentPane.setVisible(false);
                    facultyPane.setVisible(true);
                        facultyLoginPane.setVisible(false);
                        facultyDashboardPane.setVisible(true);
                            facultycontainer.setVisible(true);
                                facultyDashboardContainer.setVisible(true);
                                    facultyApplicatoinsContainer.setVisible(false);
                                    facultyStudentContainer.setVisible(false);

                String facultyName = resultSet.getString("facultyName");
                facultyNameStatus.setText(facultyName);
                facultyInitialsStatus.setText(facultyInitial);
                paneStatusFaculty.setText(facultyDashboardButton.getText());
            }
            else{
                mainPane.setVisible(false);
                    studentPane.setVisible(false);
                    facultyPane.setVisible(true);
                        facultyLoginPane.setVisible(true);
                        facultyDashboardPane.setVisible(false);
            }
            
   
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }        
        clearForm();

    }

    @FXML
    private void handleFacultyPassForgotButtonAction(ActionEvent event) {
    }

    @FXML
    private void handleHomeButtonAction(ActionEvent event) {
        mainPane.setVisible(true);
            studentPane.setVisible(false);
            facultyPane.setVisible(false);
            chairmanPane.setVisible(false);
    }

    @FXML
    private void handleFacultyMenuButtonAction(ActionEvent event) {
        if(event.getTarget() == facultyDashboardButton){
            paneStatusFaculty.setText(facultyDashboardButton.getText());
            mainPane.setVisible(false);
                studentPane.setVisible(false);
                facultyPane.setVisible(true);
                    facultyLoginPane.setVisible(false);
                    facultyDashboardPane.setVisible(true);
                        facultycontainer.setVisible(true);
                            facultyDashboardContainer.setVisible(true);
                                facultyApplicatoinsContainer.setVisible(false);
                                facultyStudentContainer.setVisible(false);
        }
        else if(event.getTarget() == facultyApplicationsButton){
            handleFacultyApplicationContainer();
        }
        else if(event.getTarget() == facultyStudentsInfoButton){
            handleFacultyStudentContainer();
        }
        else if(event.getTarget() == facultyLogOutButton){
            mainPane.setVisible(false);
                studentPane.setVisible(false);
                facultyPane.setVisible(true);
                    facultyLoginPane.setVisible(true);
                    facultyDashboardPane.setVisible(false);
        }
    }

    private void handleFacultyApplicationContainer() {
        paneStatusFaculty.setText(facultyApplicationsButton.getText());
        mainPane.setVisible(false);
            studentPane.setVisible(false);
            facultyPane.setVisible(true);
                facultyLoginPane.setVisible(false);
                facultyDashboardPane.setVisible(true);
                    facultycontainer.setVisible(true);
                        facultyDashboardContainer.setVisible(false);
                            facultyApplicatoinsContainer.setVisible(true);
                                ApplicationListPane.setVisible(false);
                            facultyStudentContainer.setVisible(false);
                            
        String supervisorInitial = facultyInitialsStatus.getText();
        applicationList = FXCollections.observableArrayList();
        setResearchInfo(supervisorInitial, applicationList, ApplicationTableView, 1, 0);
       
            
        researchTopicNameF.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getResearchTopicName()));
            
        mem1NameF.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMemOneName()));
        mem1IDF.setCellValueFactory(data -> new SimpleStringProperty(Integer.toString(data.getValue().getMemOneId())));
            
        mem2NameF.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMemTwoName()));
        mem2IDF.setCellValueFactory(data -> new SimpleStringProperty(Integer.toString(data.getValue().getMemTwoId())));
            
        mem3NameF.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMemThreeName()));
        mem3IDF.setCellValueFactory(data -> new SimpleStringProperty(Integer.toString(data.getValue().getMemThreeId())));
            
        applicationCount.setText(Integer.toString(applicationList.size()));
            
    }

    @FXML
    private void handleSeeApplicationsButtonAction(ActionEvent event) {
        ApplicationListPane.setVisible(true);
    }

    @FXML
    private void handleAcceptGroupButtonAction(ActionEvent event) {
        Application application = ApplicationTableView.getSelectionModel().getSelectedItem();
        String supervisorInitial = facultyInitialsStatus.getText();
        
        LocalDate currentDate = LocalDate.now();
        String currentSemester = semesterComboBoxFT.getValue();
        
        try{
           connection = getConnection();
           String query = String.format("select * from deadline where semesterID = '%s'", currentSemester);
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery(query);
           resultSet.next();
           LocalDate applicationDeadline = LocalDate.parse(resultSet.getString("facultyApprovalDeadline"));
           
           if(currentDate.isAfter(applicationDeadline)){
               String text = "Faculty Approval deadline is over.";
               showErrorNotification(text);
           }
           else{
               try{
                connection = getConnection();
                query = String.format("update applicationdetails set supervisorStatus = true "
                        + "where mem1ID = %d and mem2ID = %d or mem2ID is null and mem3ID = %d or mem3ID is null"
                        + " and researchTopicName = '%s' and supervisorName = '%s'", 
                        application.getMemOneId(),
                        application.getMemTwoId(),
                        application.getMemThreeId(),
                        application.getResearchTopicName(),
                        supervisorInitial
                        );

                statement = connection.createStatement();
                statement.executeUpdate(query);

                } catch (SQLException ex) {
                    System.err.println(ex);
                }
           }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        
        
    }

    private void countStudentUnderSupervision(String supervisorInitial) {
        int countStudent = 0;
        
        try{
            connection = getConnection();
            String query = String.format("select * from applicationdetails where supervisorName = '%s' and supervisorStatus = true", supervisorInitial);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next()){
                boolean memOneStatus = resultSet.getBoolean("mem1Status");
                boolean memTwoStatus = resultSet.getBoolean("mem2Status");
                boolean memThreeStatus = resultSet.getBoolean("mem3Status");
                
                if(memOneStatus) countStudent++;
                if(memTwoStatus) countStudent++;
                if(memThreeStatus) countStudent++;
            }
            
            query = String.format("update supervisor set facultyStudentCount = %d where facultyInitial = '%s'", countStudent, supervisorInitial);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            
            
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    private void addFacultyToComboBox() {
        facultyList = FXCollections.observableArrayList();
        try{
            connection = getConnection();
            String query = String.format("select * from supervisor");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            String facultyInitial;
            String facultyName;
            int facultyStudentCount;
            
            while(resultSet.next()){
                facultyInitial = resultSet.getString("facultyInitial");
                facultyName = resultSet.getString("facultyName");
                facultyStudentCount = resultSet.getInt("facultyStudentCount");
                
                Faculty faculty = new Faculty(facultyInitial, facultyName, facultyStudentCount);
                facultyList.add(faculty); 
            }
            
            facultyComboBox.setItems(facultyList);
            
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    private void updateFacultyStudentCount() {
        try{
            connection = getConnection();
            String query = String.format("select * from supervisor");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next()){
                String faculty = resultSet.getString("facultyInitial");
                countStudentUnderSupervision(faculty);
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    @FXML
    private void handleExpandGroupButtonAction(ActionEvent event) {
        groupListPane.setVisible(true);
        individualStudentListPane.setVisible(false);
    }

    @FXML
    private void handleExpandStudentButtonAction(ActionEvent event) {
        groupListPane.setVisible(false);
        individualStudentListPane.setVisible(true);
    }

    private void handleFacultyStudentContainer() {
        paneStatusFaculty.setText(facultyStudentsInfoButton.getText());
        mainPane.setVisible(false);
            studentPane.setVisible(false);
            facultyPane.setVisible(true);
                facultyLoginPane.setVisible(false);
                facultyDashboardPane.setVisible(true);
                    facultycontainer.setVisible(true);
                        facultyDashboardContainer.setVisible(false);
                            facultyApplicatoinsContainer.setVisible(false);
                            facultyStudentContainer.setVisible(true);
                                groupListPane.setVisible(false);
                                individualStudentListPane.setVisible(false);
        
        String supervisorInitial = facultyInitialsStatus.getText();
        groupList = FXCollections.observableArrayList();
  
        setResearchInfo(supervisorInitial, groupList, groupTableView, 1, 1);

        groupResearchTopicName.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getResearchTopicName()));
            
        groupMem1Name.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMemOneName()));
        groupMem1ID.setCellValueFactory(data -> new SimpleStringProperty(Integer.toString(data.getValue().getMemOneId())));
            
        groupMem2Name.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMemTwoName()));
        groupMem2ID.setCellValueFactory(data -> new SimpleStringProperty(Integer.toString(data.getValue().getMemTwoId())));
            
        groupMem3Name.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMemThreeName()));
        groupMem3ID.setCellValueFactory(data -> new SimpleStringProperty(Integer.toString(data.getValue().getMemThreeId())));
        
        groupCount.setText(Integer.toString(groupList.size()));
       
        individualStudentList = FXCollections.observableArrayList();
        
        try{
            connection = getConnection();
            String query = String.format("select S.studentId, S.studentName, app.researchTopicName "
                    + "from student S, applicationdetails App "
                    + "where (S.studentId = App.mem1ID or S.studentId = App.mem2ID or S.studentId = App.mem3ID)"
                    + " and supervisorName = '%s' and supervisorStatus = true", supervisorInitial);
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next()){
                String topicName = resultSet.getString("researchTopicName");
                String stName = resultSet.getString("studentName");
                int stID = resultSet.getInt("studentId");
                
                StudentsInfo stInfo = new StudentsInfo(topicName, stName, stID);
                individualStudentList.add(stInfo);
            }

            facultyStudentInfoTableView.setItems(individualStudentList);
            
            studentResearchTopicName.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getResearchTopicName()));
            studentName.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getStudentName()));
            studentID.setCellValueFactory(data -> new SimpleStringProperty(Integer.toString(data.getValue().getStudentId())));
            
            studentCount.setText(Integer.toString(individualStudentList.size()));
            
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        
    }

    private void setResearchInfo(String supervisorInitial, ObservableList<Application> tempList, TableView<Application> tempTableView, int spStatus1, int spStatus2) {
        
        try{
            connection = getConnection();
            String query = String.format("select * from applicationdetails where (mem2ID is null or mem2Status = true) and (mem3ID is null or mem3Status = true) and supervisorName = '%s' and (supervisorStatus = %d or supervisorStatus = %d)", supervisorInitial, spStatus1, spStatus2);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next()){
                String researchTopicName = resultSet.getString("researchTopicName");
                int memOneId = resultSet.getInt("mem1ID");
                String memOneName = resultSet.getString("mem1Name");
                int memTwoId = resultSet.getInt("mem2ID");
                String memTwoName = resultSet.getString("mem2Name");
                int memThreeId = resultSet.getInt("mem3ID");
                String memThreeName = resultSet.getString("mem3Name");
                
                Application application = new Application(researchTopicName, memOneId, memOneName, memTwoId, memTwoName, memThreeId, memThreeName);
                
                tempList.add(application);
            }
            
            tempTableView.setItems(tempList);
            
        }catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    @FXML
    private void handleChairmanLoginButtonAction(ActionEvent event) {
        try {
            connection = getConnection();
            String query = String.format("select * from supervisor where facultyInitial = 'SM'");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            
            String chairmanInitialTried = chairmanInitialField.getText();
            String chairmanPassTried = chairmanPassField.getText();
            
            if(chairmanInitialTried.equals(resultSet.getString("facultyInitial")) && chairmanPassTried.equals(resultSet.getString("facultyPass"))){
                paneStatusChairman.setText(chairmanDashboardButton.getText());
                chairmanPane.setVisible(true);
                    chairmanLoginPane.setVisible(false);
                    chairmanDashboardPane.setVisible(true);
                        chairmanContainer.setVisible(true);
                            chairmanDashboardContainer.setVisible(true);
                            chairmanApplicatoinsContainer.setVisible(false);
                            deadlineContainer.setVisible(false);
                            
                chairmanNameStatus.setText(resultSet.getString("facultyName"));
            }
            else{
                mainPane.setVisible(false);
                studentPane.setVisible(false);
                facultyPane.setVisible(false);
                chairmanPane.setVisible(true);
                    chairmanLoginPane.setVisible(true);
                    chairmanDashboardPane.setVisible(false);
            }
            
            
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    @FXML
    private void handleChairmanPassForgotButtonAction(ActionEvent event) {
    }

    @FXML
    private void handleChairmanMenuButtonAction(ActionEvent event) {
        if(event.getTarget() == chairmanDashboardButton){
            paneStatusChairman.setText(chairmanDashboardButton.getText());
            chairmanPane.setVisible(true);
                chairmanLoginPane.setVisible(false);
                chairmanDashboardPane.setVisible(true);
                    chairmanContainer.setVisible(true);
                        chairmanDashboardContainer.setVisible(true);
                        chairmanApplicatoinsContainer.setVisible(false);
                        deadlineContainer.setVisible(false);
        }
        else if(event.getTarget() == chairmanApplicationsButton){
            handleChairmanApplicationContainer();
        }
        else if(event.getTarget() == setDeadlineButton){
            handleDeadlineContainer();
        }
        else if(event.getTarget() == chairmanLogOutButton){
            mainPane.setVisible(false);
                studentPane.setVisible(false);
                facultyPane.setVisible(false);
                chairmanPane.setVisible(true);
                    chairmanLoginPane.setVisible(true);
                    chairmanDashboardPane.setVisible(false);
        }
    }

    @FXML
    private void handleExpandApplicationButtonAction(ActionEvent event) {
        applicationListPaneFinal.setVisible(true);
        confirmApplicationFinalButton.setVisible(false);
        
        finalApplicationList = FXCollections.observableArrayList();
        
        setFinalApplicationList(finalApplicationList, finalApplicationTableView, 1, 0);
    }

    @FXML
    private void handleConfirmApplicationFinalButtonAction(ActionEvent event) {
        
        try {
            FinalApplication selectedItem = finalApplicationTableView.getSelectionModel().getSelectedItem();
            
            connection = getConnection();
            String query = String.format("update applicationdetails set applicationStatus = true"
                    + " where mem1ID = %d and (mem2ID = %d or mem2ID is null) and (mem3ID = %d or mem3ID is null) "
                    + "and researchTopicName = '%s' and supervisorName = '%s'",
                    selectedItem.getMemOneId(),
                    selectedItem.getMemTwoId(),
                    selectedItem.getMemThreeId(),
                    selectedItem.getResearchTopicName(),
                    selectedItem.getFacultyName());
            
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    private void handleChairmanApplicationContainer() {
        paneStatusChairman.setText(chairmanApplicationsButton.getText());
            chairmanPane.setVisible(true);
                chairmanLoginPane.setVisible(false);
                chairmanDashboardPane.setVisible(true);
                    chairmanContainer.setVisible(true);
                        chairmanDashboardContainer.setVisible(false);
                        chairmanApplicatoinsContainer.setVisible(true);
                            applicationListPaneFinal.setVisible(false);
                        deadlineContainer.setVisible(false);

    }

    private void setFinalApplicationList(ObservableList<FinalApplication> tempList, TableView<FinalApplication> tampTableView, int status1, int status2) {
        try{
            connection = getConnection();
            String query = String.format("select * from applicationdetails where supervisorStatus = %d or supervisorStatus = %d", status1, status2);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next()){
                String researchTopicName = resultSet.getString("researchTopicName");
                int memOneId = resultSet.getInt("mem1ID");
                String memOneName = resultSet.getString("mem1Name");
                int memTwoId = resultSet.getInt("mem2ID");
                String memTwoName = resultSet.getString("mem2Name");
                int memThreeId = resultSet.getInt("mem3ID");
                String memThreeName = resultSet.getString("mem3Name");
                String facultyName = resultSet.getString("supervisorName");
                
                FinalApplication finalApplication = 
                        new FinalApplication(
                            researchTopicName,
                            memOneId,
                            memOneName,
                            memTwoId,
                            memTwoName,
                            memThreeId,
                            memThreeName,
                            facultyName
                        );
                
                tempList.add(finalApplication);
            }
            
            tampTableView.setItems(tempList);
            
            groupResearchTopicNameFinal.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getResearchTopicName()));
            
            groupMem1NameFinal.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMemOneName()));
            groupMem1IDFinal.setCellValueFactory(data -> new SimpleStringProperty(Integer.toString(data.getValue().getMemOneId())));

            groupMem2NameFinal.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMemTwoName()));
            groupMem2IDFinal.setCellValueFactory(data -> new SimpleStringProperty(Integer.toString(data.getValue().getMemTwoId())));

            groupMem3NameFinal.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMemThreeName()));
            groupMem3IDFinal.setCellValueFactory(data -> new SimpleStringProperty(Integer.toString(data.getValue().getMemThreeId())));

            groupSupervisorNameFinal.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getFacultyName()));
            
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    @FXML
    private void handleExpandConfirmedApplicationButtonAction(ActionEvent event) {
        finalApplicationList = FXCollections.observableArrayList();
        
        setFinalApplicationList(finalApplicationList, finalApplicationTableView, 1, 1);
        
        applicationListPaneFinal.setVisible(true);
        confirmApplicationFinalButton.setVisible(true);
    }

    private void handleDeadlineContainer() {
        paneStatusChairman.setText(setDeadlineButton.getText());
            chairmanPane.setVisible(true);
                chairmanLoginPane.setVisible(false);
                chairmanDashboardPane.setVisible(true);
                    chairmanContainer.setVisible(true);
                        chairmanDashboardContainer.setVisible(false);
                        chairmanApplicatoinsContainer.setVisible(false);
                        deadlineContainer.setVisible(true);
                        
    }

    @FXML
    private void handleApplyDeadlineButtonAction(ActionEvent event) {
        String semester = semesterComboBox.getValue();
        LocalDate semesterStart = semesterFromDatePicker.getValue();
        LocalDate semesterEnd = semesterToDatePicker.getValue();
        LocalDate applicationDeadline = applicationDeadlineDatePicker.getValue();
        LocalDate facultyApprovalDeadline = facultyApprovalDataPicker.getValue();
        LocalDate applicationApproval = applicationApprovalDatePicker.getValue();
        
        semester = semester + Integer.toString(semesterStart.getYear());
        try{
            connection = getConnection();
            String query = String.format("insert into semester values('%s', '%s', '%s')", semester, semesterStart.toString(), semesterEnd.toString());
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            
            
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        
        try{
            connection = getConnection();
            String query = String.format("insert into deadline values('%s', '%s', '%s', '%s')", 
                    semester, 
                    applicationDeadline.toString(),
                    facultyApprovalDeadline.toString(),
                    applicationApproval.toString());
            
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    private void showErrorNotification(String text) {
        Notifications notificationBuilder = Notifications.create()
                .title("Error")
                .text(text)
                .graphic(null)
                .position(Pos.CENTER)
                .hideAfter(Duration.seconds(5));
        //notificationBuilder.darkStyle();  
        notificationBuilder.showError();
    }


}
