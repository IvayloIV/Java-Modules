package bg.stemo.web;

import bg.stemo.domain.Fish;
import bg.stemo.service.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FishController {

    private FishService fishService;

    @Autowired
    public FishController(FishService fishService) {
        this.fishService = fishService;
    }

    @GetMapping("/list")
    public List<Fish> getFishList() {
        return fishService.getFishList();
    }

    @GetMapping("/create")
    public String createFish() {
        fishService.createFish(new Fish("Test123"));
        return "Good!";
    }
}
