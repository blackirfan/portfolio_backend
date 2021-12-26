package com.portfolio.portfolio.model;



import javax.persistence.*;
//import java.util.List;
import lombok.Data;
@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name = "book_name")
    private String book_name;
    @Column(name = "author")
    private String author;
    @Column(name = "publisher_name")
    private String publisher_name;

    @Column(name = "publishing_year")
    private String publishing_year;

    @Column(name = "source_link")
    private String source_link;
}

