package bg.stemo.web;

import bg.stemo.domain.Fish;
import bg.stemo.service.FishService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FishshopApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(FishConfig.class);
        FishService fishService = ac.getBean(FishService.class);
        fishService.createFish(new Fish("Test1"));
        fishService.createFish(new Fish("Test2"));
        System.out.println(fishService.getFishList());
    }
}

