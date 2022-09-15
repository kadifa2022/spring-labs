package com.cydeo.cervice;

import com.cydeo.model.Product;

public class StockServiceImpl implements StockService{
    @Override
    public boolean checkStockIsAvailable(Product product, int quantity) {
        return product.getRemainingQuantity()>quantity;
    }
}
