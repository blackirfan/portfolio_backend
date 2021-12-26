package com.portfolio.portfolio.model;

import javax.persistence.*;
//import java.util.List;
import lombok.Data;
@Data
@Entity
@Table(name = "paper")
public class Paper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "journal_name")
    private String journal_name;

    @Column(name = "publishing_year")
    private String publishing_year;

    @Column(name = "source_link")
    private String source_link;
}


