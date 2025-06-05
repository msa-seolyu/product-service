package com.seolyu.productservice.domain.product.entity;

import com.seolyu.productservice.common.model.BaseEntityDateAggregate;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class ProductImage extends BaseEntityDateAggregate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    @NotNull
    private Product product;

    @Column(nullable = false, length = 255)
    private String path;

    @Column(nullable = false)
    private boolean isThumbnail = false;

    private Boolean sortOrder;
}