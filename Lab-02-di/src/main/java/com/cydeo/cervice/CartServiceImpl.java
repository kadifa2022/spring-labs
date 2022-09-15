package com.cydeo.cervice;

import com.cydeo.model.Cart;
import com.cydeo.model.Product;
import com.cydeo.repository.CartRepository;

public class CartServiceImpl implements CartService{

    private CartRepository cartRepository;
    private StockService service;
    @Override
    public Cart addCart(Product product, int quantity) {
        return null;
    }
}
