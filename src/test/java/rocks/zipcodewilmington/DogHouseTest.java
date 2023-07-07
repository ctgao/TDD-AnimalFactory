package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testAddDog(){
        // Given: a dog
        Dog doggo = AnimalFactory.createDog("Peppy", new Date());
        Integer doggoID = doggo.getId();

        // When: you add dog to the house
        DogHouse.clear();
        DogHouse.add(doggo);

        // Then: can you get dog from house
        Assert.assertEquals(doggo, DogHouse.getDogById(doggoID));
    }

    @Test
    public void testRemoveDogByID(){
        // Given a dog in a doghouse
        Dog doggo = AnimalFactory.createDog("Peppy", new Date());
        Integer doggoID = doggo.getId();
        DogHouse.clear();
        DogHouse.add(doggo);

        // When: you remove cat from house based on ID
        DogHouse.remove(doggoID);

        // Then: can you get cat from house
        Assert.assertEquals(null, DogHouse.getDogById(doggoID));
    }

    @Test
    public void testRemoveDogByObject(){
        // Given: a dog in a doghouse
        Dog doggo = AnimalFactory.createDog("Peppy", new Date());
        Integer doggoID = doggo.getId();
        DogHouse.clear();
        DogHouse.add(doggo);

        // When: you remove dog from house based on doggo
        DogHouse.remove(doggo);

        // Then: can you get dog from house
        Assert.assertEquals(null, DogHouse.getDogById(doggoID));
    }

    @Test
    public void testGetDogByID(){
        // Given: a dog in a doghouse
        Dog doggo = AnimalFactory.createDog("Peppy", new Date());
        Integer doggoID = doggo.getId();
        DogHouse.clear();
        DogHouse.add(doggo);

        // When: you add cat to the house
        DogHouse.add(doggo);
        Dog retrievedDog = DogHouse.getDogById(doggoID);

        // Then: can you get cat from house
        Assert.assertEquals(doggo, retrievedDog);
    }
}
