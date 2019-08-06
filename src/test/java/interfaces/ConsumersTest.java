package interfaces;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

import interfaces.ConsumerClass;
import interfaces.Consumers;

public class ConsumersTest
{
    static final String TEXT = "texto";
    static final Integer INTEGER = 1;
    static final double DOUBLE = 2.0;
    static final Long LONG = 3l;

    @Test
    public void consumerTest()
    {
        Consumers.consumer.accept( TEXT );
        assertThat( Consumers.lastStringResult ).isEqualTo( TEXT );
    }

    @Test
    public void consumerClassTest()
    {
        ConsumerClass subject = ConsumerClass.instance();
        subject.accept( TEXT );
        assertThat( subject.lastResult ).isEqualTo( TEXT );
    }

    @Test
    public void consumerComposeTest()
    {
        Consumer<String> composedConsumer = Consumers.consumer.andThen( Consumers.consumer );
        composedConsumer.accept( TEXT );
        assertThat( Consumers.lastStringResult ).isEqualTo( TEXT );
    }

    @Test
    public void biConsumerTest()
    {
        Consumers.biConsumer.accept( TEXT, INTEGER );
        assertThat( Consumers.lastStringResult ).isEqualTo( TEXT + INTEGER );
    }

    @Test
    public void doubleConsumerTest()
    {
        Consumers.doubleConsumer.accept( DOUBLE );
        assertThat( Consumers.lastDoubleResult ).isEqualTo( DOUBLE );
    }

    @Test
    public void intConsumerTest()
    {
        Consumers.intConsumer.accept( INTEGER );
        assertThat( Consumers.lastIntegerResult ).isEqualTo( INTEGER );
    }

    @Test
    public void objDoubleConsumerTest()
    {
        Consumers.objDoubleConsumer.accept( TEXT, DOUBLE );
        assertThat( Consumers.lastStringResult ).isEqualTo( TEXT + DOUBLE );
    }
    
    @Test
    public void objIntConsumerTest()
    {
        Consumers.objIntConsumer.accept( TEXT, INTEGER );
        assertThat( Consumers.lastStringResult ).isEqualTo( TEXT + INTEGER );
    }
    
    @Test
    public void objLongConsumerTest()
    {
        Consumers.objLongConsumer.accept( TEXT, LONG );
        assertThat( Consumers.lastStringResult ).isEqualTo( TEXT + LONG );
    }

}
