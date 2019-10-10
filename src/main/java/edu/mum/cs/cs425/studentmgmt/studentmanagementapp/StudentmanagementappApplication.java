package edu.mum.cs.cs425.studentmgmt.studentmanagementapp;

import edu.mum.cs.cs425.studentmgmt.studentmanagementapp.model.ClassRoom;
import edu.mum.cs.cs425.studentmgmt.studentmanagementapp.model.Student;
import edu.mum.cs.cs425.studentmgmt.studentmanagementapp.model.Transcript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManager;
import java.time.LocalDate;

@SpringBootApplication
public class StudentmanagementappApplication implements CommandLineRunner
{

    @Autowired
    private LocalContainerEntityManagerFactoryBean factory;

    public static void main(String[] args)
    {
        SpringApplication.run(StudentmanagementappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        System.out.println( "Starting StudentMgmtApp..." );
        Transcript transcript = new Transcript("BS Computer Science");
        ClassRoom classRoom = new ClassRoom("McLaughlin building","M105");
        Student s = new Student("000-61-0001","Anna","Lynn","Smith",3.45, LocalDate.of(2019, 5, 24),transcript,classRoom);
        saveStudent(s);
        System.out.println( "Finishing StudentMgmtApp..." );
        System.out.printf( "Saved Student: { studentId:%d, first_name:%s, cgpa:%.2f, dateofenrollment:%s }\n",
                s.getStudentId(), s.getFirstName(), s.getCgpa(), s.getDateOfEnrollment());


    }

    private void saveStudent(Student s) {
        if (s != null) {
            EntityManager em = factory.getObject().createEntityManager();
            em.getTransaction().begin();
            em.persist(s);
            em.getTransaction().commit();
            em.close();
        }
    }
}
