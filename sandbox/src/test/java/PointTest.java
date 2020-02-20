import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void distanceCalculation() {
        Point dot1 = new Point(2, 4);
        Point dot2 = new Point(3, 7);
        Assert.assertEquals(dot1.distance(dot2), 3.1622776601683795);
    }

}
