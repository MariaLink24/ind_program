import org.junit.Test;
import org.testng.Assert;

public class StopwatchTest {
    @Test
    public void testStart() {
    Stopwatch stopwatch = new Stopwatch();
    stopwatch.start();
    stopwatch.stop();
    Assert.assertEquals(stopwatch.toString(), 1643);
    }
}
