package edu.mum.cs.cs425.studentmgmt.studentmanagementapp.model;




import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "STUDENTS")
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    long studentId;

    @Column(name = "student_number", nullable = false)
    String studentNumber;

    @Column(name = "first_name", nullable = false)
    String firstName;

    @Column(name = "middle_name")
    String middleName;

    @Column(name = "last_name", nullable = false)
    String lastName;

    @Column(name = "cgpa")
    double cgpa;

    @Column(name = "date")
    LocalDate dateOfEnrollment;

    @OneToOne(cascade = CascadeType.ALL)
    Transcript transcript;

    @ManyToOne(cascade = CascadeType.ALL)
    ClassRoom classroom;


    public Student(String studentNumber, String firstName, String middleName, String lastName, double cgpa, LocalDate dateOfEnrollment,Transcript transcript,ClassRoom classRoom) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
        this.transcript = transcript;
        this.classroom = classRoom;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }






}
