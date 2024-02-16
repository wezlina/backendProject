package com.productservice.serhathar.product.api;

import com.productservice.serhathar.category.api.CategoryDto;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Getter
@Builder
public class ProductDto {

    private String id;
    private String barcode;
    private String name;
    private String brand;
    private String description;
    private String categoryName;
    private Date creaDate;
    private Boolean status;
    private BigDecimal price;
    private CategoryDto category;
}