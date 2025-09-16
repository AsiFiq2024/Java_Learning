import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int number;
        number = random.nextInt(1,7);
        System.out.println("The dice shows: "+number);

        /*double dnum;
        dnum = random.nextDouble();

        boolean isHeads;
        isHeads = random.nextBoolean();

        System.out.println(number);
        System.out.println(dnum);

        if(isHeads){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }*/

    }
}
