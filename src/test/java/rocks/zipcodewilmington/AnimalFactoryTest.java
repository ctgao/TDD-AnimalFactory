package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog() {
        // Given (Dog data and Animal Factory)
        String givenName = "Peppy";
        Date givenBirthDate = new Date(2021, 04, 26);

        // When (create a dog through the animal factor)
        Dog doggo = AnimalFactory.createDog(givenName, givenBirthDate);

        // When (retrieve data from dog)
        String retrievedName = doggo.getName();
        Date retrievedBirthDate = doggo.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }

    @Test
    public void testCreateCat() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date(2015, 05, 26);

        // When (create a cat through animal factory)
        Cat kitty = AnimalFactory.createCat(givenName, givenBirthDate);

        // When (we retrieve data from cat)
        String retrievedName = kitty.getName();
        Date retrievedBirthDate = kitty.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }
}
