
public class Main extends Thread {
  public static int amount = 0;

  public static void main(String[] args) throws InterruptedException {
    Main thread = new Main();
    Main thread1 = new Main();
    thread.start();
    thread1.start();
    // Wait for the thread to finish
  //   while(thread.isAlive()) {
  //   System.out.println("Waiting...");
  // }
  // Update amount and print its value
  System.out.println("Main: " + amount);
  amount++;
  System.out.println("Main: " + amount);
  }
  public void run() {
    amount++;
  }
}
