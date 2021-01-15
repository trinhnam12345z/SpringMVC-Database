package com.codegym.model;
import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="majors")
public class majors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(targetEntity = student.class)
    private Set<student> students;
    public majors() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
