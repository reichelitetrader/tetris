package jednostkowe;

import org.junit.Test;
import static org.junit.Assert.*;

public class JednostkoweTest {

    @Test
    public void testAdd_2plus2() {
        System.out.println("add");
        int liczbaA = 2;
        int liczbaB = 2;
        int expResult = 4;
        int result = Jednostkowe.add(liczbaA, liczbaB);
        assertEquals(expResult, result);//sprawdz czy rowne
    }

    @Test
    public void testAdd_3plus3() {
        System.out.println("add");
        int liczbaA = 3;
        int liczbaB = 3;
        int expResult = 6;
        int result = Jednostkowe.add(liczbaA, liczbaB);
        assertEquals(expResult, result);
    }

    @Test
    public void testAdd_2plus3() {
        System.out.println("add");
        int liczbaA = 2;
        int liczbaB = 3;
        int expResult = 5;
        int result = Jednostkowe.add(liczbaA, liczbaB);
        assertEquals(expResult, result);//sprawdz czy rowne
    }

    @Test
    public void testAdd_4plus1() {
        System.out.println("add");
        int liczbaA = 4;
        int liczbaB = 1;
        int expResult = 5;
        int result = Jednostkowe.add(liczbaA, liczbaB);
        assertEquals(expResult, result);//sprawdz czy rowne
    }

    @Test
    public void testAddBorderCasses() {
        assertEquals(0, Jednostkowe.add(-2000, 2000));
        assertEquals(-4000, Jednostkowe.add(-2000, -2000));
    }

    @Test
    public void testPercentage() {
        System.out.println("percentage");
        assertEquals(80, Jednostkowe.percentage(40, 50));
        assertEquals(60, Jednostkowe.percentage(30, 50));
        assertEquals(100, Jednostkowe.percentage(50, 50));
        assertEquals(0, Jednostkowe.percentage(0, 1));
        assertEquals(200, Jednostkowe.percentage(20, 10));
    }

    @Test
    public void testPower() {
         System.out.println("power");
        assertEquals(1,Jednostkowe.Power(2, 0));
        assertEquals(2,Jednostkowe.Power(2, 1));
        assertEquals(4, Jednostkowe.Power(2, 2));
        assertEquals(8,Jednostkowe.Power(2, 3));
        assertEquals(16,Jednostkowe.Power(2, 4));
        assertEquals(9,Jednostkowe.Power(3, 2));
        assertEquals(27,Jednostkowe.Power(3, 3));
        assertEquals(81,Jednostkowe.Power(3, 4));  
    }

    @Test
    public void testSilnia() {
         System.out.println("silnia");
        assertEquals(1, Jednostkowe.Silnia(0));
        assertEquals(1, Jednostkowe.Silnia(1));
        assertEquals(2, Jednostkowe.Silnia(2));
        assertEquals(6, Jednostkowe.Silnia(3));
        assertEquals(24, Jednostkowe.Silnia(4));
        assertEquals(120, Jednostkowe.Silnia(5));
        assertEquals(720, Jednostkowe.Silnia(6));
        assertEquals(5040, Jednostkowe.Silnia(7));
    }
    
    @Test
    public void testChangeLettersCase(){
        System.out.println("changing letters");
        assertEquals("aLa mA KoTa",Jednostkowe.Letters("ALA MA KOTA") );
        
        assertEquals("aLa mA KoTa",Jednostkowe.Letters("AlA Ma kOtA") );
        
        assertEquals("aLa mA KoTa",Jednostkowe.Letters("ala ma kota"));
       
       
    }

}
