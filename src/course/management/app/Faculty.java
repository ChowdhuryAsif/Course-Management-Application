package course.management.app;

public class Faculty {
    private String facultyInitial;
    private String facultyName;
    private int facultyStudentCount;

    public Faculty(String facultyInitial, String facultyName, int facultyStudentCount) {
        this.facultyInitial = facultyInitial;
        this.facultyName = facultyName;
        this.facultyStudentCount = facultyStudentCount;
    }

    public String getFacultyInitial() {
        return facultyInitial;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public int getFacultyStudentCount() {
        return facultyStudentCount;
    }

    @Override
    public String toString() {
        return String.format("%s : %s : (%d)", facultyInitial, facultyName, facultyStudentCount);
    }
    
    
}
