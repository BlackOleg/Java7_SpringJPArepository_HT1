package olegivanov;

import olegivanov.entity.City;
import olegivanov.entity.PersonId;
import olegivanov.entity.Persons;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java7SpringJpaRepositoryHt1Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Java7SpringJpaRepositoryHt1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var w = 0;
//        createData();

    }

    public void createData() {
        var person1 = Persons.builder()
                .personId(PersonId.builder()
                        .name("Vasiliy")
                        .surname("Potemkin")
                        .age(50)
                        .build())
                .phone_number("+75550009623")
                .city_of_living(City.builder().name("MOSCOW").build())
                .build();
        var person2 = Persons.builder()
                .personId(PersonId.builder()
                        .name("Liliya")
                        .surname("Belova")
                        .age(22)
                        .build())
                .phone_number("+75550009777")
                .city_of_living(City.builder().name("MOSCOW").build())
                .build();
        var person3 = Persons.builder()
                .personId(PersonId.builder()
                        .name("Olga")
                        .surname("Svetlova")
                        .age(25)
                        .build())
                .phone_number("+755500099999")
                .city_of_living(City.builder().name("ST.PETERSBURG").build())
                .build();
//        List.of(person1, person2, person3).forEach(p -> PersonsRepository.  repository.savePersons(p));
    }

}
