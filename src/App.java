import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

    // Part 1 (Main)

        spacer();

        System.out.println("Please Enter 10 Temperatures");
       
        double[] temps = new double[10];

        spacer();

        for (int x = 0; x < temps.length; x++)
            {
                System.out.print("Temperature Number " + (x + 1) + ": ");
    
                temps[x] = input.nextDouble();
            }

        spacer();
        
    // Part 2 (Main)

        printArray(temps);

        spacer();

        System.out.println("Sum: " + sumArray(temps));

        spacer();

    // Part 7 (Main)

        menuOptions();

        spacer();

        System.out.print("Please enter a number to perform the action or 999 to stop: ");

        int select = input.nextInt();

        while (select != 999)
        {
            spacer();

            menu(select, temps);

            spacer();

            menuOptions();

            spacer();

            System.out.print("Please enter a number to perform the action or 999 to stop: ");

            select = input.nextInt();
        }

    // Part 8 (Main)

        spacer();

        System.out.print("Please enter a temperature to locate its index or 999 to stop: ");

        int userInput = input.nextInt();

        while (userInput != 999)
        {
            spacer();

            index(userInput, temps);

            spacer();

            System.out.print("Please enter a temperature to locate its index or 999 to stop: ");

            userInput = input.nextInt();
        }
    
    // Goodbye
        
        spacer();

        System.out.println("Goodbye!");

        spacer();
    }

    // Spacing Organizer

        public static void spacer()
        {
        System.out.println();
        }

    // Part 2 (Method)

        public static void printArray(double[] temps)
        {
            for (int x = 0; x < temps.length; x++)
            {
                System.out.println("Temp " + (x + 1) + ": " + temps[x]);
            }
        }

        public static double sumArray(double[] temps)
        {
            double sum = 0;

            for (int x = 0; x < temps.length; x++)
            {
                sum = sum + temps[x];
            }

            return sum;
        }

    // Part 3 (Method)

        public static void avgArray(double[] temps)
        {
            double avg = sumArray(temps) / temps.length;

            System.out.println("Average: " + avg);
        }

    // Part 4 (Method)
        
        public static void freezingTemps(double[] temps)
        {
            int freezingCount = 0;
            int notFreezingCount = 0;

            for (int x = 0; x < temps.length; x++)
            {
                if (temps[x] <= 32)
                {
                    freezingCount++;
                }
                else                
                {
                    notFreezingCount++;
                }
            }

            System.out.println(freezingCount + " at or below freezing");
                        
            System.out.println(notFreezingCount + " above freezing");
        }

    // Part 5 & 6 (Method)

        public static void highOrLowTemp(double[] temps)
        {
            double lowest = temps[0];

            double highest = temps[0];

            for (int x = 0; x < temps.length; x++)
            {
                if (temps[x] > highest)
                {
                    highest = temps[x];
                }

                if (temps[x] < lowest)
                {
                    lowest = temps[x];
                }
            }

            System.out.println("The Highest Temperature is: " + highest);

            System.out.println("The Lowest Temperature is: " + lowest);
        }

    // Part 7 (Method)

        public static void menuOptions()
        {
            System.out.println("Please select from the following: ");

            spacer();

            System.out.println("1: Average Temperature");
            System.out.println("2: Freezing Temperatures");
            System.out.println("3: Highest and Lowest Temperature");
        }

        public static void menu(int select, double[] temps)
        {
            switch(select)
            {
                case 1: avgArray(temps);
                break;
                case 2: freezingTemps(temps);
                break;
                case 3: highOrLowTemp(temps);
                break;
            }
        }
    
    // Part 8 (Method)

        public static void index(int userInput, double[] temps)
        {
            boolean found = true;

            for (int x = 0; x < temps.length; x++)
            {
                if (userInput == temps[x])
                {
                    found = false;
                    System.out.println(userInput + " is found! Located at index " + x);
                }
            }
            if (found)
            {
                System.out.println("Not found!");
            }
        }
}