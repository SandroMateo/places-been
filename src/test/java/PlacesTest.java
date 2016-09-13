import org.junit.*;
import static org.junit.Assert.*;

public class PlacesTest{


  @Test
  public void Places_instantiatesCorectly_true() {
    Places myPlaces = new Places("suburbia");
    assertEquals(true, myPlaces instanceof Places);
  }

  @Test
  public void Places_getDescription_Altitude() {
    Places myPlaces = new Places ("Sandro", "Peru", "Altitude");
    assertEquals("Altitude", myPlaces.getDescription());
  }

  @Test
  public void Places_getName_Sandro() {
    Places myPlaces = new Places ("Sandro", "Peru", "Altitude");
    assertEquals("Sandro", myPlaces.getName());
  }

  @Test
  public void Places_getPlace_Peru() {
    Places myPlaces = new Places ("Sandro", "Peru", "Altitude");
    assertEquals("Peru", myPlaces.getPlace());
  }
}
