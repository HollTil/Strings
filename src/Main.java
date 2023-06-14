import java.util.Arrays;

public class Main {
    // bei strings, arrays, listen gibt es immer eine Funktion: length/size
    public static void main(String[] args) {
        String text = "Hello, World!";
        System.out.println(text.length());

        System.out.println(text.isEmpty()); //.isEmpty prüft ob der String leer ist

        String leer = "";
        System.out.println(leer.isEmpty());

        String leerzeichen = " ";
        System.out.println(leerzeichen.isEmpty());
        System.out.println(leerzeichen.isBlank()); //.isBlank ist nicht sichtbar (leeres blatt papier)
        System.out.println("\n###############################################\n");
        String keinObjekt = null;
        System.out.println(leerzeichen.isBlank());
        //System.out.println(keinObjekt.isEmpty()); NullPointer

        String trim = " Hallo "; //trim schneidet vorne und hinten alle Leerzeichen ab
        System.out.println("'" + trim + "' length: " + trim.length());
        System.out.println("'" + trim.trim() + "' length: " + trim.trim().length());

        String split = "Hallo zusammen, heute ist ein schöner Tag!";
        String[] gesplittet = split.split(",");
        System.out.println(Arrays.toString(gesplittet));
        System.out.println(gesplittet[0]);

        String[] gesplittet2 = split.split(" ");
        System.out.println(Arrays.toString(gesplittet2));

        System.out.println("Hallo Tilman, dein Name ist Hollmann.");
        String firstName = "Tilman";
        String lastName = "Hollmann";
        System.out.println("Hallo "+firstName +", dein Name ist " +lastName +".");


        System.out.println("\n###############################################\n");

        String name = "Hallo %s, dein Name ist %s.".formatted(firstName, lastName); //%s ist ein Platzhalter für Strings

        String welcomeMsg = "Hallo %s, dein Name ist %s. \nHeute ist ein schöner Tag - %b!";
        boolean weather = true;
        String name2 = String.format(welcomeMsg, firstName, lastName, weather);
        System.out.println(name2);

        System.out.println("\n###############################################\n");

        String name3 = String.format(welcomeMsg, "GROSS,\n", lastName, weather);
        System.out.println(name3);

        System.out.println("\n###############################################\n");

        welcomeMsg += " \nIch bin %d"; //%d ist ein Platzhalter für eine Zahl (Decial) - %b für ein Boolean - %c ascii chars
        int age = 40;
        String name4 = String.format(welcomeMsg, firstName, lastName, weather, age);
        System.out.println(name4);

//Platzhalter in JAVA:
// %d - decial
// %f - float
// %s - string
// %b - boolean
// %c - ascii chars

        System.out.println("\n###############################################\n");

        System.out.println(lastName.charAt(0)); //erstes Zeichen des String ausgeben
        System.out.println(lastName.charAt(lastName.length()-1)); //letztes Zeichen des String ausgeben

        System.out.println(lastName.substring(1));
        System.out.println(lastName.substring(1,lastName.length()-1));

        System.out.println("\n###############################################\n");

        String sonderzeichen = "schön";
        System.out.println(sonderzeichen);
        System.out.println(sonderzeichen.replace("ö","oe"));

        System.out.println("\n###############################################\n");

        // Bei Strings sollte man Equals verwenden und nicht ==

    }
}

