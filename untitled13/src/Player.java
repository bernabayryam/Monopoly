import java.util.Random;

public class Player {
    private static int firstPlayer;
    private static int EvilPlan;
    private static Object EvilPlanID;
    public int cycle;
    public int pos;


    //Хвърляне на зарче.
    public static int Dice(int i) {

        System.out.println("Хвърлете зарчето");

        Random random = null;

        int number = 0;

        return random.nextInt(number);

    }

    //Първи играч.
    public static void startFirst() {

        if (firstPlayer == 1) {

            System.out.println("Първи играч е ");
        }
    }

    public void Turn() {

    }

    // Зъл план в полето "Steal"
    public static int EvilPlan() {

        if (EvilPlan == 3) {

            EvilPlanID = 3;

            System.out.println("Зъл план активиран");

            return EvilPlan;

        }
        return 0;
    }



}

