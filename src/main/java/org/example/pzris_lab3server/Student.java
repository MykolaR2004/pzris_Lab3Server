package org.example.pzris_lab3server;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;

@Setter
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;

    @Column(name = "student_group")
    private Integer studentGroup;

    @Column(name = "paid_form")
    private String paidForm;

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("surname")
    public String getSurname() {
        return surname;
    }

    @JsonProperty("studentGroup")
    public Integer getStudentGroup() {
        return studentGroup;
    }

    @JsonProperty("paidForm")
    public String getPaidForm() {
        return paidForm;
    }

}


