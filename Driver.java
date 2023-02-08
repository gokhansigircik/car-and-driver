// Now create a driver class that extends the car class. 
// The driver can choose to drive, use boosters, or refuel.
//  Each method should print the action to the console, 
//  followed by the remaining amount of gas.

// Driving should decrease gas by 1
// Using boosters should decrease gas by 3
// Refueling should increase gas by 2


public class Driver extends Car{
  public Driver(){
    super();
  }

  public void drive(){
    gasLevel -=1;
    status();
  }
  public void useBoosters(){
    gasLevel -=3;
    status();
  }

  public void refuel(){
    gasLevel +=2;
    status();
  }
}
