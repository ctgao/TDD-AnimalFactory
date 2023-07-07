package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName() {
        // Given (cat and expected output)
        String expected = "ewwww";
        Cat cat = new Cat("", new Date(), 0);

        // When (name changes)
        cat.setName(expected);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, retrievedName);
    }

    @Test
    public void testSetBirthDate() {
        // Given (cat and expected output)
        Date expected = new Date(2015, 05, 26);
        Cat cat = new Cat("", new Date(), 0);

        // When (birthdate changes)
        cat.setBirthDate(expected);

        // When (we retrieve data from the cat)
        Date retrievedBirthDate = cat.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, retrievedBirthDate);
    }

    @Test
    public void testSpeak() {
        // Given (cat and expected)
        String expected = "meow!";
        Cat cat = new Cat("", new Date(), 0);

        // When (we make the cat speak)
        String result = cat.speak();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testEat() {
        // Given (cat and expected value)
        Integer expectedMealsEaten = 1;
        Cat cat = new Cat("", new Date(), 0);

        // When (we make the cat eat)
        cat.eat(new Food());

        // When (we retrieve the meals eaten)
        Integer retrievedMealsEaten = cat.getNumberOfMealsEaten();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedMealsEaten, retrievedMealsEaten);
    }

    @Test
    public void testGetID1() {
        // Given (cat data)
        Integer expectedID = 0;

        // When (a cat is constructed)
        Cat cat = new Cat("", new Date(), expectedID);

        // When (get the ID of the cat)
        Integer retrievedID = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedID, retrievedID);
    }
    @Test
    public void testGetID2() {
        // Given (cat data)
        Integer expectedID = 13;

        // When (a cat is constructed)
        Cat cat = new Cat("", new Date(), expectedID);

        // When (get the ID of the cat)
        Integer retrievedID = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedID, retrievedID);
    }

    @Test
    public void testAnimalInheritance() {
        // Given (cat)
        Cat cat = new Cat("", new Date(), 0);
        boolean expectedIsCatAnimal = true;

        // When (get the ID of the cat)
        boolean isCatAnimal = cat instanceof Animal;

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedIsCatAnimal, isCatAnimal);
    }

    @Test
    public void testMammalInheritance() {
        // Given (cat)
        Cat cat = new Cat("", new Date(), 0);
        boolean expectedIsCatMammal = true;

        // When (get the ID of the cat)
        boolean isCatMammal = cat instanceof Mammal;

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedIsCatMammal, isCatMammal);
    }
}
