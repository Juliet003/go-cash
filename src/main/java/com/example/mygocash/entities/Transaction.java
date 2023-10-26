package com.example.mygocash.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "Transaction")
public class Transaction extends BaseEntity{
        @Id
    @SequenceGenerator(name = "id",
            sequenceName = "id", allocationSize = 1)
    @GeneratedValue(generator = "id",
            strategy = GenerationType.SEQUENCE)
        private Long id;
        private String transactionId;
        @Column(nullable = false)
        private String senderAccountNumber;
        @Column(nullable = false)
        private String receiverAccountNumber;
        @Column(nullable = false)
        private double amount;
        @Column(nullable = false)
        private String transactionType;
        private LocalDateTime timestamp;
        @ManyToOne
        private User users;
}
