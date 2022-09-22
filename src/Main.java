public class Main
{
    public static void main(String[] args)
    {
        int age = 3;
        int bot = 1;
        int top = 12;

        if(rangeCheck(age, bot, top))
        {
            System.out.println("Your birth month is " + age );
        }
        else
        {
            System.out.println("You entered an incorrect month value " + age);
        }

    }
    public static boolean rangeCheck(int age, int min, int max)
    {
        return age > min && age < max;
    }
}

