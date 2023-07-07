package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testAddCat(){
        // Given: a cat
        int catID = 42;
        Cat cat = new Cat("Loki", new Date(), catID);

        // When: you add cat to the house
        CatHouse.clear();
        CatHouse.add(cat);

        // Then: can you get cat from house
        Assert.assertEquals(cat, CatHouse.getCatById(catID));
    }

    @Test
    public void testRemoveCatByID(){
        // Given: a cat
        int catID = 42;
        Cat cat = new Cat("Loki", new Date(), catID);
        CatHouse.clear();
        CatHouse.add(cat);

        // When: you remove cat from house based on ID
        CatHouse.remove(catID);

        // Then: can you get cat from house
        Assert.assertEquals(null, CatHouse.getCatById(catID));
    }

    @Test
    public void testRemoveCatByObject(){
        // Given: a cat
        int catID = 42;
        Cat cat = new Cat("Loki", new Date(), catID);
        CatHouse.clear();
        CatHouse.add(cat);

        // When: you remove cat from house based on cat
        CatHouse.remove(cat);

        // Then: can you get cat from house
        Assert.assertEquals(null, CatHouse.getCatById(catID));
    }

    @Test
    public void testGetCatByID(){
        // Given: a cat
        int catID = 42;
        Cat cat = new Cat("Loki", new Date(), catID);

        // When: you add cat to the house
        CatHouse.add(cat);
        Cat retrievedCat = CatHouse.getCatById(catID);

        // Then: can you get cat from house
        Assert.assertEquals(cat, retrievedCat);
    }

    @Test
    public void testGetNumberOfCats(){
        // Given: a clear cathouse except for one cat
        int result = 1;
        Cat cat = new Cat("Loki", new Date(), 42);
        CatHouse.clear();
        CatHouse.add(cat);

        // When: you get number of cats
        int actualNumOfCats = CatHouse.getNumberOfCats();

        // Then: see how many cats you have
        Assert.assertEquals(result, actualNumOfCats);
    }
}
