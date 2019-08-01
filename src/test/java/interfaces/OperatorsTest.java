package interfaces;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import interfaces.Operators;

public class OperatorsTest
{
    static final String TEXT = "texto";
    static final Integer INTEGER = 1;
    static final double DOUBLE = 2.0;
    static final Long LONG = 3l;

    @Test
    public void unaryOperatorTest()
    {
        assertThat( Operators.unaryOperator.apply( INTEGER ) ).isEqualTo( INTEGER * 2 );
    }

    @Test
    public void operatorComposeTest()
    {
        assertThat( Operators.unaryOperator.compose( Operators.unaryOperator ).apply( INTEGER ) ).isEqualTo( INTEGER * 4 );
    }

    @Test
    public void operatorAndThenTest()
    {
        assertThat( Operators.unaryOperator.andThen( Operators.unaryOperator ).apply( INTEGER ) ).isEqualTo( INTEGER * 4 );
    }

    @Test
    public void doubleUnaryOperatorTest()
    {
        assertThat( Operators.doubleUnaryOperator.applyAsDouble( DOUBLE ) ).isEqualTo( DOUBLE * 2 );
    }

    @Test
    public void intUnaryOperatorTest()
    {
        assertThat( Operators.intUnaryOperator.applyAsInt( INTEGER ) ).isEqualTo( INTEGER * 2 );
    }

    @Test
    public void longUnaryOperatorTest()
    {
        assertThat( Operators.longUnaryOperator.applyAsLong( LONG ) ).isEqualTo( LONG * 2 );
    }

    @Test
    public void binaryOperatorTest()
    {
        assertThat( Operators.binaryOperator.apply( INTEGER, INTEGER ) ).isEqualTo( INTEGER + INTEGER );
    }

    @Test
    public void doubleBinaryOperatorTest()
    {
        assertThat( Operators.doubleBinaryOperator.applyAsDouble( DOUBLE, DOUBLE ) ).isEqualTo( DOUBLE + DOUBLE );
    }

    @Test
    public void intBinaryOperatorTest()
    {
        assertThat( Operators.intBinaryOperator.applyAsInt( INTEGER, INTEGER ) ).isEqualTo( INTEGER + INTEGER );
    }

    @Test
    public void longBinaryOperatorTest()
    {
        assertThat( Operators.longBinaryOperator.applyAsLong( LONG, LONG ) ).isEqualTo( LONG + LONG );
    }

}
