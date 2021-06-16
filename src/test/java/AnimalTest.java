// import org.junit.*;
// import static org.junit.Assert.*;
// import org.sql2o.*;
// import java.sql.Timestamp;
// import java.util.Date;
// import java.text.DateFormat;
//
// public class AnimalTest {
//
//   @Rule
//   public DatabaseRule database = new DatabaseRule();
//
//   @Test
//   public void Animal_instantiatesCorrectly_true() {
//     Animal testAnimal = new Animal("Simba", 1);
//     assertEquals(true, testAnimal instanceof Animal);
//   }
//
//   @Test
//   public void Animal_instantiatesWithName_String() {
//     Animal testAnimal = new Animal("Simba", 1);
//     assertEquals("Simba", testAnimal.getName());
//   }
//
//   @Test
//   public void Animal_instantiatesWithId_int() {
//     Animal testAnimal = new Animal("Simba", 1);
//     assertEquals(1, testAnimal.getId());
//   }
//
//   @Test
//   public void equals_returnsTrueIfNameAndIdAreSame_true() {
//     Animal testAnimal = new Animal("Simba", 1);
//     Animal anotherAnimal = new Animal("Simba", 1);
//     assertTrue(testAnimal.equals(anotherAnimal));
//   }
//
//   @Test
//   public void find_returnsAnimalWithSameId_secondAnimal() {
//     Animal firstAnimal = new Animal("Simba", 1);
//     firstAnimal.save();
//     Animal secondAnimal = new Animal("Spud", 3);
//     secondAnimal.save();
//     assertEquals(Animal.find(secondAnimal.getId()), secondAnimal);
//   }
//
//   @Test
//   public void save_savesIdIntoDB_true() {
//      test = new ("Simba", 1);
//     test.save();
//     Animal testAnimal = new Animal("Simba", test.getId());
//     testAnimal.save();
//     Animal savedAnimal = Animal.find(testAnimal.getId());
//     assertEquals(savedAnimal.getId(), test.getId());
//   }
//
// }