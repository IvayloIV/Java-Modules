package bg.stemo.service;

import bg.stemo.domain.Fish;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FishServiceImpl implements FishService {

    private List<Fish> fishLish = new ArrayList<>();

    public void createFish(Fish fish) {
        fishLish.add(fish);
    }

    public List<Fish> getFishList() {
        return fishLish;
    }
}
