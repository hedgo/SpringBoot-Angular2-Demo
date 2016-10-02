package net.orekyuu.angulardemo.controller;

import net.orekyuu.angulardemo.domain.Hero;
import net.orekyuu.angulardemo.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/hero")
public class HeroController {

    @Autowired
    private HeroService heroService;

    @GetMapping("/all")
    public List<Hero> getAll() {
        return heroService.getHeroList();
    }

    @PutMapping
    public void update(@RequestBody Hero hero) {
        heroService.update(hero);
    }
}
