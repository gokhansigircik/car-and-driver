// Instantiate the driver class and perform the following actions:

// Drive four times.
// Use boosters once.
// Refuel three times.

public class MainDrive {
  public static void main(String[] args) {
    Driver driver = new Driver();
    driver.drive();
    driver.drive();
    driver.drive();
    driver.drive();
    driver.useBoosters();
    driver.refuel();
    driver.refuel();
    driver.refuel();
  }
  
}
