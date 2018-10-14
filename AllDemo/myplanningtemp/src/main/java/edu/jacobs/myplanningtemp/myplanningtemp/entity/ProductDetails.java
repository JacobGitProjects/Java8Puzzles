package edu.jacobs.myplanningtemp.myplanningtemp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductDetails {

    @Id
    @GeneratedValue
    private long productDetailsId;

    @NotNull
    private String productName, productDesc;



}
