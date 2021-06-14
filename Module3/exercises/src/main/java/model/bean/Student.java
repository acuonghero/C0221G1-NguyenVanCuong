package model.bean;

public class Student {
    private int studentId;
    private String studentName;
    private String studentGender;
    private String studentEmail;
    private String studentPhone;
    private String studentBirthday;
    private String studentAddress;

    public Student() {
    }

    public Student(String studentName, String studentGender, String studentEmail, String studentPhone, String studentBirthday, String studentAddress) {
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.studentEmail = studentEmail;
        this.studentPhone = studentPhone;
        this.studentBirthday = studentBirthday;
        this.studentAddress = studentAddress;
    }

    public Student(int studentId, String studentName, String studentGender, String studentEmail, String studentPhone, String studentBirthday, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.studentEmail = studentEmail;
        this.studentPhone = studentPhone;
        this.studentBirthday = studentBirthday;
        this.studentAddress = studentAddress;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(String studentBirthday) {
        this.studentBirthday = studentBirthday;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
}