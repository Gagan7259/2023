package com.example.Security2.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @SequenceGenerator(name = "role_squance", allocationSize = 1, sequenceName = "role_squance")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "role_squance")
    private Long id;
    private String name;
    private String description;
    @ManyToMany(mappedBy = "roles")
    @Fetch(FetchMode.SELECT)
    @JsonIgnore
    private Set<User> user = new HashSet<>();
    private Date created_At;
    private Date updated_At;


    public Role(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;

    }

    public Role(String name) {
        this.name = name;
    }

    @PrePersist
    protected void onCreate() {
        this.created_At = new Date(System.currentTimeMillis());
    }

    @PreUpdate
    protected void onupdate() {
        this.updated_At = new Date(System.currentTimeMillis());
    }
}
