package com.github.youssfbr.api.services.impl;

import com.github.youssfbr.api.entities.Product;
import com.github.youssfbr.api.repositories.IProductRepository;
import com.github.youssfbr.api.services.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

    private final IProductRepository productRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
