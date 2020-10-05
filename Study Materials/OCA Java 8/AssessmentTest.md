# Java Assessment Test

1. What is the output of the following program?
    ```java
    public class SkyBisonCounter {
        private static int $;
        private static void main(String[] args) {
            String northernAirTemple;
            System.out.print(northernAirTemple + ": ");
            System.out.println($);
        }
    }
    ```
1. What is the result of the following code snippet?
    ```java
    String c1 = "Katara";
    String c2 = "Katara";
    StringBuilder c3 = new StringBuilder(8);
    c3.append("Kat").append("ara");
    System.out.println(c1 == c2);
    System.out.println(c1.equals(c2));
    System.out.println(c3.toString() == c1);
    System.out.println(c3.toString().equals(c1));
    ````
1. What is the output of the following program?
    ```java
    interface HasLegs { int getLegCount(); }

    abstract class FlyingBison implements HasLegs {
        protected int getLegCount() { return 6; }
    }

    public class SkyBison extends FlyingBison {
        public static void main(String[] args) {
            FlyingBison flyingBison = new FlyingBison();
            System.out.println(flyingBison.getLegCount());
        }

        public int getLegCount(int legs) { return 4; }
    }
    ```
1. What is the output of the following program?
    ```java
    public class FeedingSchedule {
        public static void main(String[] args) {
            boolean keepGoing = true;
            int counter = 0;
            int happinessLevel = 5;
            while(counter++ < 3) {
                int pelletsFed = (1 + 2*counter) % 3;
                switch(pelletsFed) {
                    default:
                    case 0: happinessLevel -= 1; break;
                    case 1: happinessLevel += 6;
                }
            }
            System.out.println(happinessLevel);
        }
    }
    ```
5. What is the result of the following code snippet?
    ```java
    System.out.print("Cabbage");
    try {
        System.out.print("Corp");
        throw new IllegalArgumentException();
    } catch (RuntimeException re) {
        System.out.print("Stands");
    } finally {
        System.out.print("Strong");
    }
    System.out.print("!!!");
    ```
1. What is the output of the following program?
    ```java
    public class ElementaryMath {
        public static void addToByte(int b1, int amountToAdd) {
            b1 = (byte) (b1 + amountToAdd);
        }

        public static void main(String[] args) {
            byte b1 = 10;
            byte b2 = 32;
            ElementaryMath.addToByte(b1, b2);
            System.out.println(b1);
        }
    }
    ```
1. What is the result of the following code snippet?
    ```java
    String[] flora = {"Mango", "Papaya", "Watermelon"};
    List<String> floraList = new ArrayList<>();
    floraList.add(flora[0]);
    floraList.add(flora[2]);
    floraList.set(1, flora[1]);
    floraList.remove(0);
    System.out.println(floraList);
    System.out.println(flora);
    ```
1. What is the output of the following program?
    ```java
    public class Lemur {
        public Lemur() { System.out.print("Lemur"); }
        public Lemur(int age) {
            System.out.println("Lemur age: " + age);
        }
        private boolean hasWings() { return false; }

        public static void main(String[] args) {
            Lemur lemur = new FlyingLemur();
            System.out.println("," + lemur.hasWings());
        }
    }

    class FlyingLemur extends Lemur {
        public FlyingLemur(int age) { System.out.print("FlyingLemur"); }
        public boolean hasWings() { return true; }
    }
    ```
1. Which of the following statements are true?  
    A. Runtime exceptions are intended to be thrown by the JVM, not by the programmer.  
    B. Runtime exceptions are required to caught or declared.  
    C. Checked exceptions are intended to be thrown by the JVM, not by the programmer.  
    D. Checked exceptions are required to caught or declared.  
    E. Errors are intended to be thrown by the JVM, not by the programmer.  
    F. Errors are required to caught or declared.
10. In the following program, how many items are eligible for garbage collection at each line?
    ```java
    1:  import java.util.*;
    2:  
    3:  public class MongooseLizard {
    4:      public MongooseLizard(String name) {
    5:          this.name = name;
    6:      }
    7:      public static void main(String[] args) {
    8:          MongooseLizard ml1 = new MongooseLizard("Bruce");
    9:          MongooseLizard ml2 = new MongooseLizard("Jackie");
    10:         ml1 = ml2;
    11:         ml2 = null;
    12:         ml1 = null;
    13:     }
    14:     private String name;
    15: }
    ```
1. What is the output of the following program?
    ```java
    ```
1. What is the output of the following program?
    ```java
    ```
1. What is the output of the following program?
    ```java
    ```
1. What is the output of the following program?
    ```java
    ```
15. What is the output of the following program?
    ```java
    ```
1. What is the output of the following program?
    ```java
    ```
1. What is the output of the following program?
    ```java
    ```
1. What is the output of the following program?
    ```java
    ```
1. What is the output of the following program?
    ```java
    ```
20. What is the output of the following program?
    ```java
    ```