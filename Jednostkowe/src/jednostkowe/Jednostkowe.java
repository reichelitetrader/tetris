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

    public static int power(int podstawa, int wykladnik) {
        int result = podstawa;
        if (wykladnik == 0) {
            result = 1;
        }
        for (int i = 0; i < (wykladnik - 1); i++) {
            result = result * podstawa;
        }
        return result;
    }

    public static int silnia(int n) {
        int iloczyn = 1;
        for (int i = 1; i <= n; i++) {
            iloczyn = iloczyn * i;
        }
        return iloczyn;
    }

    public static String letters(String name) {
        String result = "";
        char[] characters = name.toCharArray();
        for (int i = name.length() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                String lowLetter = String.valueOf(characters[i]).toLowerCase();
                characters[i] = lowLetter.charAt(0);

            }
            if (i % 2 != 0) {
                String upperLetter = String.valueOf(characters[i]).toUpperCase();
                characters[i] = upperLetter.charAt(0);
            }
        }

        return String.valueOf(characters);
    }

    public static double avg(double[] liczby) {
        double suma = 0;
        double srednia = 0;
        double size = liczby.length;

        for (int i = 0; i < liczby.length; i++) {
            suma = suma + liczby[i];

        }
        return suma / size;
    }
    //wyjatki kontrolowane dodajemy w deklaracji metody
    public static double wAvg(double[] liczby, double []wartosciWagi) throws ArraySizeNotEqualsException{
        double suma = 0;
        double srednia_wazona = 0;
        double sumaWag = 0;
        
        for(int i=0; i<wartosciWagi.length; i++){
           sumaWag =  sumaWag + wartosciWagi[i]; 
        }
        
        
        for(int i=0; i<liczby.length; i++){
            if(liczby.length == wartosciWagi.length){
           
        }else if(liczby.length != wartosciWagi.length){
           throw new ArraySizeNotEqualsException();
        }
            
            
            srednia_wazona = srednia_wazona + (liczby[i] * wartosciWagi[i]);
            
        }
        srednia_wazona = srednia_wazona / sumaWag;
        
        
       /* 
        liczby * wagi/ sume wag
        1)dane wejsciowe (5,15)
        wagi wejsciowe (2,1)
        5*2 + 15* 1 = 25
        2+1 = 3
        25/3 = 8,3
        
        2)dane wejsciowe (5,15)
        wagi wejsciowe (2,2)
        5*2 + 15*2 = 40
        2+2 = 4 suma wag
        40/4 = 10
        
       */
       
       return srednia_wazona;
    }
    
    
    

    public static void main(String[] args) {
        double a = 0.1 + 0.2;
        double b = 0.3;

        if (a == b) {
            System.out.println("ok");
        } else {
            System.out.println("nie ok");
        }
    }
}
