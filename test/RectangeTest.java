import com.thoughtworks.shapes.Rectangle;
import org.junit.Assert;

import static org.hamcrest.core.Is.is;

/**
 * Created by ksundeep on 5/30/16.
 */
public class RectangeTest {
    @org.junit.Test
    public void RectangeTest() throws Exception {

        Assert.assertThat(new Rectangle(10, 20).area(),is(10.0));

    }
}
