package in.Abhi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Account_table")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    private String name;
    private double balance;
}
