package com.seolyu.productservice.domain.product.service;

import com.seolyu.productservice.common.error.ErrorCode;
import com.seolyu.productservice.common.error.exception.SeolyuException;
import com.seolyu.productservice.domain.product.dto.ProductGetDetailResDto;
import com.seolyu.productservice.domain.product.entity.Product;
import com.seolyu.productservice.domain.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product getById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new SeolyuException(ErrorCode.PRODUCT_NOT_FOUND));
    }

    public ProductGetDetailResDto get(Long id) {
        Product product = getById(id);
        return ProductGetDetailResDto.of(product);
    }
}
