package com.example.estore.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address_tbl")

public class address {

    @Id
    @GeneratedValue
    private int address_id;
    private String line1;
    private String line2;
    private String city;
    private String province;
    private String country;
    private String phone;
    private int zip_code;


}
