package dev.francode.microservice.product.service.interfaces;

import dev.francode.microservice.product.dto.ProductRequestDTO;
import dev.francode.microservice.product.dto.ProductResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductService {
    // Basic CRUD
    Optional<ProductResponseDTO> getProductById(Long id);
    ProductResponseDTO createProduct(ProductRequestDTO productRequest);
    ProductResponseDTO updateProduct(Long id, ProductRequestDTO productRequest);
    Page<ProductResponseDTO> getAllProducts(Pageable pageable);
    void deleteProduct(Long id);
}
