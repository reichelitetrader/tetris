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
        assertEquals(1, Jednostkowe.power(2, 0));
        assertEquals(2, Jednostkowe.power(2, 1));
        assertEquals(4, Jednostkowe.power(2, 2));
        assertEquals(8, Jednostkowe.power(2, 3));
        assertEquals(16, Jednostkowe.power(2, 4));
        assertEquals(9, Jednostkowe.power(3, 2));
        assertEquals(27, Jednostkowe.power(3, 3));
        assertEquals(81, Jednostkowe.power(3, 4));
    }

    @Test
    public void testSilnia() {
        System.out.println("silnia");
        assertEquals(1, Jednostkowe.silnia(0));
        assertEquals(1, Jednostkowe.silnia(1));
        assertEquals(2, Jednostkowe.silnia(2));
        assertEquals(6, Jednostkowe.silnia(3));
        assertEquals(24, Jednostkowe.silnia(4));
        assertEquals(120, Jednostkowe.silnia(5));
        assertEquals(720, Jednostkowe.silnia(6));
        assertEquals(5040, Jednostkowe.silnia(7));
    }

    @Test
    public void testChangeLettersCase() {
        System.out.println("changing letters");
        assertEquals("aLa mA KoTa", Jednostkowe.letters("ALA MA KOTA"));
        assertEquals("aLa mA KoTa", Jednostkowe.letters("AlA Ma kOtA"));
        assertEquals("aLa mA KoTa", Jednostkowe.letters("ala ma kota"));

    }

    @Test
    public void testAverage() {
        System.out.println("average");
        assertEquals(10.0, Jednostkowe.avg(new double[]{5, 15}), 0.0);
        assertEquals(15.0, Jednostkowe.avg(new double[]{10, 20}), 0.0);
        assertEquals(20.0, Jednostkowe.avg(new double[]{10, 20, 30}), 0.0);
        assertEquals(0.0, Jednostkowe.avg(new double[]{-10, 20, -10}), 0.0);
        assertEquals(10.0, Jednostkowe.avg(new double[]{10}), 0.0);
        //testy implementacja funkcji srednia wazona, 2 parametry wejsciowe, 1 wartosci, 2wagi
    }

    @Test
    public void testWaverage() throws ArraySizeNotEqualsException {
        System.out.println("wAverage");
        assertEquals(10, Jednostkowe.wAvg(new double[]{5, 15}, new double[]{2, 2}), 0.0);
        assertEquals(7.5, Jednostkowe.wAvg(new double[]{0, 15}, new double[]{2, 2}), 0.0);
        assertEquals(4.25, Jednostkowe.wAvg(new double[]{3, 5}, new double[]{3, 5}), 0.0);
        assertEquals(-4.25, Jednostkowe.wAvg(new double[]{-3, -5}, new double[]{3, 5}), 0.0);
       
        /*dane wejsciowe (-3,-5)
        wagi wejsciowe (3,5)
        -3 * 3 + -5 * 5 = -9 -25 = -34
        -34/8 = -4,25
        */
        
    }
    //wyjatki niekontrolowane nie trzeba obslugiwac
    @Test(expected = ArraySizeNotEqualsException.class)
    
    public void avgExceptions() throws ArraySizeNotEqualsException{
       System.out.println("AverageExceptions"); 
       assertEquals(7.5, Jednostkowe.wAvg(new double[]{0, 15}, new double[]{ 2}), 0.0);
    }
    
    @Test
    public void oddNumbers(){
        System.out.println("oddNumbers"); 
        assertArrayEquals(new int[]{2,4,6,8,10},Jednostkowe.oddNumbers(1,10));
    }

}
