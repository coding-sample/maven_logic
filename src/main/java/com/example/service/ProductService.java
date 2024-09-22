package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

import java.util.List;

/**
 * ProductServiceクラスは、商品に関するビジネスロジックを提供します。
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    /**
     * 商品リストを取得します。
     * 
     * @return 商品名のリスト
     */
    public List<Product> getProductList() {
        return productRepository.findAll();
    }

    /**
     * 指定されたIDの商品詳細を取得します。
     * 
     * @param id 商品ID
     * @return 商品の詳細情報
     */
    public Product getProductDetails(long id) {
        return productRepository.findById(id).orElse(null);
    }

    /**
     * 指定された商品を購入します。
     * 
     * @param productId 購入する商品のID
     * @param quantity 購入する数量
     * @return 購入結果のメッセージ
     */
    public String purchaseProduct(long productId, int quantity) {
        Product product = productRepository.findById(productId).orElse(null);
        if (product == null) {
            return "Product not found";
        }
        return "Purchased " + quantity + " of " + product.getName();
    }
}