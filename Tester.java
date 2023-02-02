import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);

        boolean active = true;
        System.out.println("write 'stop' top stop ya!");
        while (active){
            System.out.println("please enter a command!");
           String str=a.nextLine();
            System.out.println("oh u entered: "+str+"... thank you!");
            if (str.equals("stop")){
                System.out.println("better stop then! cya");
                active = false;
            }

        }
    }

}
