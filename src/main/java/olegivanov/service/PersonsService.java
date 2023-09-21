package olegivanov.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import olegivanov.entity.City;
import olegivanov.entity.Persons;
import olegivanov.repository.CityRepository;
import olegivanov.repository.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@NoArgsConstructor
@Service
public class PersonsService {
    PersonsRepository personsRepository;
    @Autowired
    public PersonsService(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    public List<Persons> findByPersonId_AgeLessThan(int age) {
        return personsRepository.findByPersonId_AgeLessThan(age, Sort.by(Sort.Direction.ASC,"age"));
    }

    public Optional<Persons> findByPersonId_NameAndPersonId_Surname(String name, String surname) {
        var q=personsRepository.findByPersonId_NameAndPersonId_Surname(name,surname);
        if (!q.isPresent()) return Optional.empty();
        return personsRepository.findByPersonId_NameAndPersonId_Surname(name,surname);
    }
}
