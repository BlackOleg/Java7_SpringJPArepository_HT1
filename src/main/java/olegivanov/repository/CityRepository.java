package olegivanov.repository;

import olegivanov.entity.City;
import olegivanov.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface CityRepository extends JpaRepository<City,Integer> {
    List<City> findByNameIsLike(String name);

    List<City> findByName(String name);
}
