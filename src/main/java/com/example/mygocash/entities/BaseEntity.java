package com.example.mygocash.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@MappedSuperclass
@ToString
public abstract class  BaseEntity {
//    @Id
//    @SequenceGenerator(name = "id",
//            sequenceName = "id", allocationSize = 1)
//    @GeneratedValue(generator = "id",
//            strategy = GenerationType.SEQUENCE)
//    private Long id;
}
