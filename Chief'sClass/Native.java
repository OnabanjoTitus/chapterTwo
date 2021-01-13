public class Native {
    private String studentId;
    private String firstName;
    private String surname;

    private int javaGrade;
    private int criticalThinking;
    private int databaseGrade;
    public Native(){
    }
    public Native(String id,String fName,String lastName){
        studentId=id;
        firstName=fName;
        surname=lastName;
    }
    public Native(String id,String fName,String lastName,int[]grades){
        studentId=id;
        firstName=fName;
        surname=lastName;

        javaGrade=grades[0];
        criticalThinking=grades[1];
        databaseGrade=grades[2];
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getJavaGrade() {
        return javaGrade;
    }

    public void setJavaGrade(int javaGrade) {
        this.javaGrade = javaGrade;
    }

    public int getCriticalThinking() {
        return criticalThinking;
    }

    public void setCriticalThinking(int criticalThinking) {
        this.criticalThinking = criticalThinking;
    }

    public int getDatabaseGrade() {
        return databaseGrade;
    }

    public void setDatabaseGrade(int databaseGrade) {
        this.databaseGrade = databaseGrade;
    }
}
