package interfaces;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import interfaces.Functions;

public class FunctionsTest
{
    static final String TEXT = "texto";
    static final String UM = "1";
    static final String DOIS = "2";
    static final String TRES = "3";
    static final Integer INTEGER = 1;
    static final double DOUBLE = 2.0;
    static final Long LONG = 3l;

    @Test
    public void functionTest()
    {
        assertThat( Functions.function.apply( UM ) ).isEqualTo( INTEGER );
    }
    
    @Test
    public void andThenFunctionTest()
    {
        assertThat( Functions.function.andThen( Functions.composeFunction ).apply( UM ) ).isEqualTo( UM );
    }

    @Test
    public void composeFunctionTest()
    {
        assertThat( Functions.function.compose( Functions.composeFunction ).apply( INTEGER ) ).isEqualTo( INTEGER );
    }
    
    @Test
    public void intFunctionTest()
    {
        assertThat( Functions.intFunction.apply( INTEGER ) ).isEqualTo( INTEGER + "" );
    }

    @Test
    public void doubleFunctionTest()
    {
        assertThat( Functions.doubleFunction.apply( DOUBLE ) ).isEqualTo( DOUBLE + "" );
    }

    @Test
    public void longFunctionTest()
    {
        assertThat( Functions.longFunction.apply( LONG ) ).isEqualTo( LONG + "" );
    }

    @Test
    public void toIntFunctionTest()
    {
        assertThat( Functions.toIntFunction.applyAsInt( UM ) ).isEqualTo( INTEGER );
    }

    @Test
    public void toDoubleFunctionTest()
    {
        assertThat( Functions.toDoubleFunction.applyAsDouble( DOIS ) ).isEqualTo( DOUBLE );
    }

    @Test
    public void toLongFunctionTest()
    {
        assertThat( Functions.toLongFunction.applyAsLong( TRES ) ).isEqualTo( LONG );
    }

    @Test
    public void intToDoubleFunctionTest()
    {
        assertThat( Functions.intToDoubleFunction.applyAsDouble( INTEGER ) ).isEqualTo( (double) INTEGER );
    }

    @Test
    public void intToLongFunctionTest()
    {
        assertThat( Functions.intToLongFunction.applyAsLong( INTEGER ) ).isEqualTo( (long) INTEGER );
    }

    @Test
    public void longToDoubleFunctionTest()
    {
        assertThat( Functions.longToDoubleFunction.applyAsDouble( LONG ) ).isEqualTo( (double) LONG );
    }

    @Test
    public void doubleToIntFunctionTest()
    {
        assertThat( Functions.doubleToIntFunction.applyAsInt( DOUBLE ) ).isEqualTo( (int) DOUBLE );
    }

    @Test
    public void doubleToLongFunction()
    {
        assertThat( Functions.doubleToLongFunction.applyAsLong( DOUBLE ) ).isEqualTo( (long) DOUBLE );
    }

    @Test
    public void longToIntFunction()
    {
        assertThat( Functions.longToIntFunction.applyAsInt( LONG ) ).isEqualTo( LONG.intValue() );
    }

}
