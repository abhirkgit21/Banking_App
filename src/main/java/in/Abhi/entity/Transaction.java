package in.Abhi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Transaction_table")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double amount;



}
