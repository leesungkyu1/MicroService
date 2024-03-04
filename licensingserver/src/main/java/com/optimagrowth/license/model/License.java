package com.optimagrowth.license.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;

@Getter @Setter @ToString
@Entity
@Table(name="licenses")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class License extends RepresentationModel<License> {

    @Id
    @Column(name = "license_id", nullable = false)
    private String licenseId;
    private String description;
    @Column(name = "organization_id", nullable = false)
    private String organizationId;
    @Column(name = "product_name", nullable = false)
    private String productName;
    @Column(name = "license_type", nullable = false)
    private String licenseType;
    @Column(name="comment")
    private String comment;
    @Transient
    private String organizationName;
    @Transient
    private String contactName;
    @Transient
    private String contactPhone;
    @Transient
    private String contactEmail;


    public License withComment(String comment){
        this.setComment(comment);
        return this;
    }
}
