import java.util.Scanner;
public class WeekdayName {
    public static void main(String[] args){
        int dayNum;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weekday number: ");
        dayNum = input.nextInt();

        switch(dayNum){
            case 1:
                System.out.println("It is Sunday.");
                break;
            case 2:
                System.out.println("It is Monday.");
                break;
            case 3:
                System.out.println("It is Tuesday.");
                break;
            case 4:
                System.out.println("It is Wednesday.");
                break;
            case 5:
                System.out.println("It is Thursday.");
                break;
            case 6:
                System.out.println("It is Friday.");
                break;
            case 7:
                System.out.println("It is Saturday.");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + dayNum);
        }
    }
}
