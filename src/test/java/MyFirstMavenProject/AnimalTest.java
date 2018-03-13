package MyFirstMavenProject;

import MyFirstMavenProject.domain.Animal;
import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.*;

public class AnimalTest {
    //Animal animal = new Animal();

   //@Test
   private Animal animal = new Animal();
       Animal animal2 = new Animal();



   public void AnimalNameTest () {
       // Animal animal = new Animal();

        animal.setColor("Pink");
        animal.setName("Beast");
        animal.setNumber_of_legs(2);

        assertEquals(animal.getName(), "Beast");
        assertEquals(animal.getColor(), "Pink");
        assertEquals(animal.getNumber_of_legs(), 2);
    }

   @Test
   public void AnimalTest2(){
       animal2.setNumber_of_legs(12);
       assertEquals(animal2.getNumber_of_legs(),11);
   }


}
