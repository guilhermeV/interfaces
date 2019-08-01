package interfaces;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import interfaces.Predicates;

public class PredicatesTest
{
    static final String TEXT = "texto";
    static final Integer INTEGER = 1;
    static final double DOUBLE = 2.0;
    static final Long LONG = 3l;

    @Test
    public void predicateTest()
    {
        assertThat( Predicates.predicate.test( INTEGER ) ).isEqualTo( false );
    }

    @Test
    public void predicateNegateTest()
    {
        assertThat( Predicates.predicate.negate().test( INTEGER ) ).isEqualTo( true );
    }

    @Test
    public void predicateAndTest()
    {
        assertThat( Predicates.predicate.and( Predicates.predicate ).test( INTEGER ) ).isEqualTo( false );
    }

    @Test
    public void predicateOrTest()
    {
        assertThat( Predicates.predicate.or( Predicates.predicate ).test( INTEGER + 2 ) ).isEqualTo( true );
    }

    @Test
    public void doublePredicateTest()
    {
        assertThat( Predicates.doublePredicate.test( DOUBLE ) ).isEqualTo( false );
    }

    @Test
    public void intPredicateTest()
    {
        assertThat( Predicates.intPredicate.test( INTEGER ) ).isEqualTo( false );
    }

    @Test
    public void longPredicateTest()
    {
        assertThat( Predicates.longPredicate.test( LONG ) ).isEqualTo( true );
    }
    
    @Test
    public void biPredicateTest()
    {
        assertThat( Predicates.biPredicate.test( INTEGER, DOUBLE ) ).isEqualTo( true );
    }

}
