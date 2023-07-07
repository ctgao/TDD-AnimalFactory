package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void constructorTest() {
        // Given (Dog data)
        String givenName = "Peppy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a Dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the Dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void testSetBirthDate() {
        // Given (Dog and expected output)
        Date expected = new Date(2015, 05, 26);
        Dog dog = new Dog(null, null, null);

        // When (birthdate changes)
        dog.setBirthDate(expected);

        // Then (we expect the given data, to match the retrieved data)
        Date retrievedBirthDate = dog.getBirthDate();
        Assert.assertEquals(expected, retrievedBirthDate);
    }


    @Test
    public void testSpeak() {
        // Given (Dog and expected)
        String expected = "bark!";
        Dog dog = new Dog(null, null, null);

        // When (we make the Dog speak)
        String result = dog.speak();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testEat() {
        // Given (Dog and expected value)
        Integer expectedMealsEaten = 1;
        Dog dog = new Dog(null, null, null);

        // When (we make the Dog eat)
        dog.eat(new Food());

        // When (we retrieve the meals eaten)
        Integer retrievedMealsEaten = dog.getNumberOfMealsEaten();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedMealsEaten, retrievedMealsEaten);
    }

    @Test
    public void testGetID1() {
        // Given (Dog with an ID)
        Integer expectedID = 0;
        Dog dog = new Dog("", new Date(), expectedID);

        // When (get the ID of the Dog)
        Integer retrievedID = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedID, retrievedID);
    }
    @Test
    public void testGetID2() {
        // Given (Dog data)
        Integer expectedID = null;
        Dog dog = new Dog("", new Date(), expectedID);

        // When (get the ID of the Dog)
        Integer retrievedID = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedID, retrievedID);
    }
    @Test
    public void testGetID3() {
        // Given (Dog data)
        Integer expectedID = 13;
        Dog dog = new Dog("", new Date(), expectedID);

        // When (get the ID of the Dog)
        Integer retrievedID = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedID, retrievedID);
    }


    @Test
    public void testAnimalInheritance() {
        // Given (Dog)
        Dog dog = new Dog("", new Date(), 0);
        boolean expectedIsDogAnimal = true;

        // When (get the ID of the Dog)
        boolean isDogAnimal = dog instanceof Animal;

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedIsDogAnimal, isDogAnimal);
    }

    @Test
    public void testMammalInheritance() {
        // Given (Dog)
        Dog dog = new Dog("", new Date(), 0);
        boolean expectedIsDogMammal = true;

        // When (get the ID of the Dog)
        boolean isDogMammal = dog instanceof Mammal;

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedIsDogMammal, isDogMammal);
    }
}
