package jednostkowe;

public class Jednostkowe {

    public static int add(int liczbaA, int liczbaB) {
        return liczbaA + liczbaB;
    }

    public static int percentage(int number, int total) {
        double result = 0;
        result = ((double) number / (double) total * 100); //rzutowanie na double i int
        return (int) result;
    }

    public static int Power(int podstawa, int wykladnik) {
        int result = podstawa;
        if (wykladnik == 0) {
            result = 1;
        }
        for (int i = 0; i < (wykladnik - 1); i++) {
            result = result * podstawa;
        }
        return result;
    }

    public static int Silnia(int n) {
        int iloczyn = 1;
        for (int i = 1; i <= n; i++) {
            iloczyn = iloczyn * i;
        }
        return iloczyn;
    }

    public static String Letters(String name) {
        String result = "";
        char[] characters = name.toCharArray();
        for (int i = name.length() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                String lowLetter = String.valueOf(characters[i]).toLowerCase();
                characters[i] = lowLetter.charAt(0);

            }if(i % 2 != 0){
                String upperLetter = String.valueOf(characters[i]).toUpperCase();
                characters[i] = upperLetter.charAt(0);
            }
        }

        return String.valueOf(characters);
    }

    public static void main(String[] args) {
    }
}
