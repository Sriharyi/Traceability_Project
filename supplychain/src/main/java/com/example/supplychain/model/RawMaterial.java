package com.example.supplychain.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("rawmaterial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RawMaterial {

    private String _id;
    private String rawMaterialName;
    private String rawMaterialNumber;
    private String rawMaterialUniqueId;
    private String rawMaterialType;
    private String facilityName;
    private String supplierName;
    private String materialComposition;
    private String Certificates;


}

