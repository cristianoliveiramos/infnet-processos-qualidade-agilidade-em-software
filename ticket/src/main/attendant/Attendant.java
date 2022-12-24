package src.main.attendant;

public class Attendant {

  private String name;
  private int registration;
  private String message;

  private Attendant(String name, int registration) {
    this.name = name;
    this.registration = registration;
  }

  public String getName() {
    return this.name;
  }

  public int getRegistration() {
    return this.registration;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRegistration(int registration) {
    this.registration = registration;
  }

  private String message(String message) {
    this.message = message;
    return this.message;
  }
}