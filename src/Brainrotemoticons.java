import java.util.Scanner;

public class Brainrotemoticons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let the brainrot commence!");
        System.out.println("Enter in your favorite brainrot term and watch it come to life");
        System.out.print("Brainrot to emoji: ");
        String type = input.nextLine();

        if (type.equals("skibidi toilet"))
            System.out.println("\uD83D\uDDE3\uFE0F\uD83D\uDEBD");
        else if (type.equals("toilet"))
            System.out.println("\uD83D\uDEBD");
        else if (type.equals("gyatt"))
            System.out.println("\uD83C\uDF51");
        else if (type.equals("ohio"))
            System.out.println("\uD83C\uDFF4\uDB40\uDC75\uDB40\uDC73\uDB40\uDC6F\uDB40\uDC68\uDB40\uDC7F");
        else if (type.equals("grimace shake"))
            System.out.println("\uD83E\uDD64");
        else if (type.equals("lebron"))
            System.out.println("\uD83D\uDC68\uD83C\uDFFF\u200D\uD83E\uDDB2");
        else if (type.equals("rizz") || type.equals("Rizz") || type.equals("Rizzy")|| type.equals("rizzy"))
            System.out.println("\uD83D\uDC96");
        else if (type.equals("freaky") || type.equals("Freaky"))
            System.out.println("\uD83D\uDC45");
        else if (type.equals("sus") || type.equals("sussy") || type.equals("amongus") || type.equals("troll"))
            System.out.println("\uD83E\uDDCC");
        else if (type.equals(""))
        else
            System.out.println("Listed brainrot not found :( try another!");

        System.out.println("Would you like another?");
        String value = input.nextLine();
        if (value.equals("Yes") || value.equals("yes"))
            System.out.println("Excellent");
        else
            System.out.println("No worries! Thank you for participating.");
        }

    }

