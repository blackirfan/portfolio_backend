package com.portfolio.portfolio.model;
import javax.persistence.*;
//import java.util.List;
import lombok.Data;
        @Data
        @Entity
        @Table(name = "eduInformation")
        public class EducationalInformation {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
        private int id;
        @Column(name = "institution_type")
        private String institution_type;
        @Column(name = "institution_name")
        private String institution_name;
        @Column(name = "certificate_type")
        private String certificate_type;

        @Column(name = "passing_year")
        private String passing_year;

        @Column(name = "grade")
        private String grade;
}
