package bg.stemo.web;

import bg.stemo.domain.Fish;
import bg.stemo.service.FishService;
import bg.stemo.service.FishServiceImpl;

public class FishshopApplication {

    public static void main(String[] args) {
        FishService fishService = new FishServiceImpl();
        fishService.createFish(new Fish("Test1"));
        fishService.createFish(new Fish("Test2"));
        System.out.println(fishService.getFishList());
    }
}

