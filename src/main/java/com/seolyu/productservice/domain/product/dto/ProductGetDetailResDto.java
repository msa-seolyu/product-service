package com.seolyu.productservice.domain.product.dto;

import com.seolyu.productservice.domain.product.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProductGetDetailResDto {
    private String name;
    private String description;
    private int price;
    private int discountPrice;

    public static ProductGetDetailResDto of(Product product) {
        return new ProductGetDetailResDto(
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getDiscountPrice()
        );
    }
}
