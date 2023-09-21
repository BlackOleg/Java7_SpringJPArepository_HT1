package olegivanov.repository;

import olegivanov.entity.PersonId;
import olegivanov.entity.Persons;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonsRepository extends JpaRepository <Persons, PersonId> {
    List<Persons> findByPersonId_AgeLessThan(int age, Sort sort);
   Optional<Persons> findByPersonId_NameAndPersonId_Surname(String name, String surname);
}
