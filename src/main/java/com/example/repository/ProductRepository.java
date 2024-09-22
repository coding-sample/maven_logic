package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Product;

/**
 * ProductRepositoryインターフェースは、商品情報のデータアクセスを提供します。
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}