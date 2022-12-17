package com.qnet.account.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    private int customerId;
    private String name;
    private String email;
    @Column(name="mobile_no")
    private Long mobileNumber;
    @Column(name="create_dt")
    private LocalDate createDt;
}
