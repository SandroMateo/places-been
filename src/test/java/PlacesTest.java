import org.junit.*;
import static org.junit.Assert.*;

public class PlacesTest{


  @Test
  public void Places_instantiatesCorectly_true() {
    Places myPlaces = new Places("suburbia");
    assertEquals(true, myPlaces instanceof Places);
  }

  @Test
  public void Places_getDescription_suburbia() {
    Places myPlaces = new Places ("suburbia");
    assertEquals("suburbia", myPlaces.getDescription());

  }
}
