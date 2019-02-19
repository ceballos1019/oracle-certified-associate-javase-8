package statements;

/**
 * Shows the usage of the switch sentence
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @version 1.0
 * @since 2019/02/19
 */
public class SwitchStatement {

    /**
     * Illustrates the basic usage of a switch-case
     */
    public static void switchBasicUsage(int i) {        
        switch (i) 
        { 
        case 0: 
            System.out.println("i is zero."); 
            break; 
        case 1: 
            System.out.println("i is one."); 
            break; 
        case 2: 
            System.out.println("i is two."); 
            break; 
        default: 
            System.out.println("i is greater than 2."); 
        } 
    }


    /**
     * Shows an example of a switch statement without break
     * If we omit the break, execution will continue on into the next case.
     * It is sometimes desirable to have multiple cases without
     * break statements between them.
     * The example display whether a day is a weekday or a weekend day.
     */
    public static void switchOmittingBreak() {
        int day = 2; 
        String dayType; 
        String dayString; 
  
        switch (day) { 
        case 1: 
            dayString = "Monday"; 
            break; 
        case 2: 
            dayString = "Tuesday"; 
            break; 
        case 3: 
            dayString = "Wednesday"; 
            break; 
        case 4: 
            dayString = "Thursday"; 
            break; 
        case 5: 
            dayString = "Friday"; 
            break; 
        case 6: 
            dayString = "Saturday"; 
            break; 
        case 7: 
            dayString = "Sunday"; 
            break; 
        default: 
            dayString = "Invalid day"; 
        } 
  
        switch (day) { 
        // multiple cases without break statements 
  
        case 1: 
        case 2: 
        case 3: 
        case 4: 
        case 5: 
            dayType = "Weekday"; 
            break; 
        case 6: 
        case 7: 
            dayType = "Weekend"; 
            break; 
  
        default: 
            dayType = "Invalid daytype"; 
        } 
  
        System.out.println(dayString + " is a " + dayType); 
    }
    
    /**
     * We can use a switch as part of the statement sequence of an outer switch. 
     * This is called a nested switch. Since a switch statement defines its own block,
     * no conflicts arise between the case constants in the inner switch and those 
     * in the outer switch
     */
    public static void nestedSwitches() {
        String Branch = "CSE"; 
        int year = 2; 
  
        switch (year) { 
        case 1: 
            System.out.println("elective courses : Advance english, Algebra"); 
            break; 
        case 2: 
            switch (Branch) // nested switch 
            { 
            case "CSE": 
            case "CCE": 
                System.out.println("elective courses : Machine Learning, Big Data"); 
                break; 
  
            case "ECE": 
                System.out.println("elective courses : Antenna Engineering"); 
                break; 
  
            default: 
                System.out.println("Elective courses : Optimization"); 
            } 
        } 
    }   

    public static void main(String[] args) {
        switchBasicUsage(10);
        switchOmittingBreak();
        nestedSwitches();
    }

}