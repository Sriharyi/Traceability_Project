package com.example.supplychain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("style")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Style {
    @Id
    private String _id;
    private String styleName;
    private String styleNumber;
    private String sytleUniqueId;
    private String styleType;
    private String supplierId;
    private String facilityId;
    private String materialComposition;
    private String Certificates;

}
