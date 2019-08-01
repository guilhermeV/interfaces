package interfaces.exercise;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import interfaces.exercise.CollectorsExerciseInterface;
import interfaces.exercise.CollectorsExerciseSolved;
import interfaces.exercise.Signal;

@RunWith( MockitoJUnitRunner.class )
public class CollectorsExerciseTest
{

    @Mock
    private Signal signal1, signal2, signal3, signal4, signal5;

    private List<Signal> allSignals;

    private CollectorsExerciseInterface implementedCollector;

    @Before
    public void setUp()
    {
        allSignals = Arrays.asList( signal1, signal2, signal3, signal4, signal5 );
        implementedCollector = CollectorsExerciseSolved.getInstance();
    }

    @Test
    public void testaCollectorSize()
    {
        // final List<Signal> singletonList2 = allSignals.stream().collect(
        // implementedCollectorInterface );

        final List<Signal> singletonList = allSignals.stream().collect( implementedCollector );
        assertThat( singletonList.size() ).isEqualTo( 1 );
    }

    @Test
    public void testaCollectorMaxSize()
    {
        final List<Signal> singletonList = allSignals.stream().collect( implementedCollector );
        assertThat( implementedCollector.getOriginalSize() ).isEqualTo( 5 );
    }

}
