package com.cydeo.cervice;

import com.cydeo.model.Product;

public interface StockService {

        boolean checkStockIsAvailable(Product product, int quantity);

    }




