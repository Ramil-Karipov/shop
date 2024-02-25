package controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.StoreService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Long> id) {
        storeService.add(id);

    }

    @GetMapping("/get")
    public List<Long> get() {
        return storeService.get();

    }
}
