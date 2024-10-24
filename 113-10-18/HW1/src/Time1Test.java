import java.util.Scanner;

public class Time1Test {
    public  static void main(String[] args){
        Time1 time = new Time1(23, 59, 59);//Time1 time = new...

        //呼叫printUniversal()
        System.out.println("Initial time (24-hour format):");
        time.printUniversal();

        //呼叫printStander()
        System.out.println("Initial time (12-hour format):");
        time.printStandard();

        //使用者輸入時間過了幾秒，用迴圈呼叫tick
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of seconds to add: ");
        int secondsToAdd = scanner.nextInt();

        for (int i = 0; i < secondsToAdd; i++) {
            time.tick();
        }
        //呼叫printUniversal()
        System.out.println("\nTime after adding seconds (24-hour format):");
        time.printUniversal();

        //呼叫printStander()
        System.out.println("Time after adding seconds (12-hour format):");
        time.printStandard();     
        
        scanner.close();
    }

}
