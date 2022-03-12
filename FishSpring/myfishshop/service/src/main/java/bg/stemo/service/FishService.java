package bg.stemo.service;

import bg.stemo.domain.Fish;

import java.util.List;

public interface FishService {

    public void createFish(Fish fish);

    public List<Fish> getFishList();
}
