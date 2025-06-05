package com.seolyu.productservice.domain.product.controller;

import com.seolyu.productservice.domain.product.dto.ProductGetDetailResDto;
import com.seolyu.productservice.domain.product.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Tag(name = "product")
@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @Operation(summary = "상품 상세 조회")
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ProductGetDetailResDto get(@PathVariable Long id) {
        return productService.get(id);
    }
}
