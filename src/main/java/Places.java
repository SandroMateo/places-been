public class Places {
  private String mName;
  private String mPlaces;
  private String mDescription;

  public Places(String name, String place, String description) {
    mName = name;
    mPlaces = place;
    mDescription = description;
  }

  public String getDescription() {
    return mDescription;
  }

  public String getName() {
    return mName;
  }

  public String getPlace() {
    return mPlaces;
  }

}
