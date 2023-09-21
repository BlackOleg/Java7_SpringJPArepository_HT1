package olegivanov.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import olegivanov.entity.City;
import olegivanov.entity.Persons;
import olegivanov.service.CityService;
import olegivanov.service.PersonsService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
@RestController
public class WebController {
    private final CityService cityService;
    private final PersonsService personsService;

    @GetMapping("/")
    public String hello() {
        return "First Greatings";
    }

    @GetMapping("/persons/by-age")
    @ResponseBody
    public List<Persons> findByPersonId_AgeLessThan(@RequestParam("age") int age) {
        return personsService.findByPersonId_AgeLessThan(age);
    }
    @GetMapping("/persons/by-name")
    @ResponseBody
    public Optional<Persons> findByPersonNameAndPersonSurname(@RequestParam("name") String name, @RequestParam("surname") String surname ) {
        return personsService.findByPersonId_NameAndPersonId_Surname(name,surname);
    }
    @GetMapping("/city/by-name")
    @ResponseBody
    public List<City> findByNameIsLike(@RequestParam("name") String city) {
        return cityService.findByName(city);
    }


}
