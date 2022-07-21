package day07.languageFeatures.Java8.FunctionalProgramming.Advanced;

public class StudentBean {

    private Integer studentId;
    private String studentName;
    private String studentGrade;
    private String studentLocation;
    private String studentSkill;
    private Integer playerRating;

    public StudentBean(Integer studentId, String studentName, String studentGrade, String studentLocation, String studentSkill,Integer playerRating) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.studentLocation = studentLocation;
        this.studentSkill = studentSkill;
        this.playerRating = playerRating;
    }

    public Integer getPlayerRating() {
        return playerRating;
    }

    public void setPlayerRating(Integer playerRating) {
        this.playerRating = playerRating;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getStudentLocation() {
        return studentLocation;
    }

    public void setStudentLocation(String studentLocation) {
        this.studentLocation = studentLocation;
    }

    public String getStudentSkill() {
        return studentSkill;
    }

    public void setStudentSkill(String studentSkill) {
        this.studentSkill = studentSkill;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentGrade='" + studentGrade + '\'' +
                ", studentLocation='" + studentLocation + '\'' +
                ", studentSkill='" + studentSkill + '\'' +
                ", playerRating=" + playerRating +
                '}';
    }
}
