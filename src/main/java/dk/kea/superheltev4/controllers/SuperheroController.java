package dk.kea.superheltev4.controllers;

import dk.kea.superheltev4.dto.HeroCityDTO;
import dk.kea.superheltev4.dto.HeroDTO;
import dk.kea.superheltev4.dto.SuperpowerCountDTO;
import dk.kea.superheltev4.dto.SuperpowerDTO;
import dk.kea.superheltev4.repositories.IRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("superhero")
public class SuperheroController {

    IRepository repository;

    public SuperheroController(ApplicationContext context, @Value("${superhero.repository.impl}") String impl){
        repository = (IRepository) context.getBean(impl);
    }

    @GetMapping("")
    public ResponseEntity<?> getAllHeroes(@RequestParam(required = false) String format){
        List<HeroDTO> getAllHeroes = repository.getAllHeroes();

        if (format != null && format.equals("html")){
            StringBuilder htmlFormat = new StringBuilder();
            htmlFormat.append("<table>");
            htmlFormat.append("<tr><th>Superhero Name</th><th>Real Name</th><th>Creation Year</th></tr>");
            for (HeroDTO hero : getAllHeroes){
                htmlFormat.append("<tr><td>").append(hero.getHeroName()).append("</td>");
                htmlFormat.append("<td>").append(hero.getRealName()).append("</td>");
                htmlFormat.append("<td>").append(hero.getCreationDate()).append("</td></tr>");
            }
            htmlFormat.append("</table>");

            HttpHeaders headers = new HttpHeaders();
            headers.add("content-type", "text/html");
            return new ResponseEntity<>(htmlFormat.toString(), headers, HttpStatus.OK);
        } else{
            return new ResponseEntity<>(getAllHeroes, HttpStatus.OK);
        }
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<HeroDTO>> getHeroesByHeroName(@PathVariable String name){
        List<HeroDTO> searchResults = repository.getHeroesByHeroName(name);
        return new ResponseEntity<>(searchResults, HttpStatus.OK);
    }

    @GetMapping("/superpower/count/{name}")
    public ResponseEntity<List<SuperpowerCountDTO>> getSuperpowersCountByHeroName(@PathVariable String name) {
        List<SuperpowerCountDTO> superpowers = repository.getSuperpowersCountByHeroName(name);
        return new ResponseEntity<>(superpowers, HttpStatus.OK);
    }

    @GetMapping("/superpower/count")
    public ResponseEntity<List<SuperpowerCountDTO>> getSuperpowersCountByHeroName() {
        List<SuperpowerCountDTO> superpowers = repository.getSuperpowersCount();
        return new ResponseEntity<>(superpowers, HttpStatus.OK);
    }

    @GetMapping("/superpower/{name}")
    public ResponseEntity<List<SuperpowerDTO>> getSuperpowersByHeroName(@PathVariable String name) {
        List<SuperpowerDTO> superpowers = repository.getSuperpowersByHeroName(name);
        return new ResponseEntity<>(superpowers, HttpStatus.OK);
    }

    @GetMapping("/superpower")
    public ResponseEntity<List<SuperpowerDTO>> getSuperpowersByHeroName() {
        List<SuperpowerDTO> superpowers = repository.getSuperpowers();
        return new ResponseEntity<>(superpowers, HttpStatus.OK);
    }

    @GetMapping("/city/{name}")
    public ResponseEntity<List<HeroCityDTO>> getCityByHeroName(@PathVariable String name) {
        List<HeroCityDTO> heroesAndCities = repository.getHeroesAndCityByHeroName(name);
        return new ResponseEntity<>(heroesAndCities, HttpStatus.OK);
    }

    @GetMapping("/city")
    public ResponseEntity<List<HeroCityDTO>> getCityByHeroName() {
        List<HeroCityDTO> heroesAndCities = repository.getHeroesAndCity();
        return new ResponseEntity<>(heroesAndCities, HttpStatus.OK);
    }
}
