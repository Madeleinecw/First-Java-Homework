import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTest {

    Calculator calculator;
    WaterBottle waterBottle;
    Printer printer;


    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
        calculator = new Calculator();
        printer = new Printer(100, 100);
    }


    @Test
    public void add(){
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void subtract(){
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    public void multiply(){
        assertEquals(12, calculator.multiply(6, 2));
    }

    @Test
    public void divide(){
        assertEquals(4.5, calculator.divide(9.0, 2.0), 0.01);
    }

    @Test
    public void drink(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void empty(){
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void fill(){
        assertEquals(100, waterBottle.fill());
    }

    @Test
    public void print(){
        assertEquals(0, printer.print(2, 50));
    }
}