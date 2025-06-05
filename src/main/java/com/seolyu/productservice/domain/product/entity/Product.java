package com.seolyu.productservice.domain.product.entity;

import com.seolyu.productservice.common.model.BaseEntityDateAggregate;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Product extends BaseEntityDateAggregate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false)
    private int price = 0;

    @Column(nullable = false)
    private int discountPrice = 0;

    private String description;
}
