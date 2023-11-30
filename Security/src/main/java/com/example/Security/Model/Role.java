package com.example.Security.Model;

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
@Table(name = "role")
public class Role {
    @PrePersist
    protected void onCreate() {
        this.created_At = new Date(System.currentTimeMillis());
    }

    @PreUpdate
    protected void onUpdate() {
        this.updated_At = new Date(System.currentTimeMillis());
    }
    @Id
    @SequenceGenerator(name = "role_sequance", allocationSize = 1, sequenceName = "role_sequance")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "role_sequance")
    private Long id;
    private String name;
    private String description;
    private Date created_At;
    private Date updated_At;
    @JsonIgnore
    @Fetch(value = FetchMode.SELECT)
    @ManyToMany(mappedBy = "roles")
    private Set<User> user = new HashSet<>();

    public Role(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Role(String name) {
        this.name = name;
    }


}
