package com.example.supplychain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("facility")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Facility {
    
    @Id
    private String _id;
    private String facilityName;
    private String facilityLocation;
    private String supplierName;
    private String certifications;
}
