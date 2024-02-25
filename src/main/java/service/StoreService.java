package service;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;

    }

    public void add(List<Long> ids) {

        basket.add(ids);
    }

    public List<Long> get() {
        return basket.get();

    }
}
