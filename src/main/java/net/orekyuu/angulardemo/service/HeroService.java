package net.orekyuu.angulardemo.service;

import net.orekyuu.angulardemo.domain.Hero;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HeroService {

    private List<Hero> heroList = new ArrayList<>(Arrays.asList(
            new Hero(11, "Mr. Nice")
    ));

    public List<Hero> getHeroList() {
        return heroList;
    }

    public void update(Hero hero) {
        heroList.stream()
                .filter(it -> it.getId() == hero.getId())
                .forEach(it -> it.setName(hero.getName()));
    }
}
