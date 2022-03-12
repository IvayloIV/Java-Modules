package bg.stemo.service;

import bg.stemo.domain.Fish;

import java.util.ArrayList;
import java.util.List;

public class FishServiceImpl implements FishService {

    private List<Fish> fishLish = new ArrayList<>();

    public void createFish(Fish fish) {
        fishLish.add(fish);
    }

    public List<Fish> getFishList() {
        return fishLish;
    }
}
