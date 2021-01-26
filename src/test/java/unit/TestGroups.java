package unit;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.Matchers.closeTo;

public class TestGroups {

    @Category({SlowGroup.class, FastGroup.class})
    @Test
    public void testDemo1(){
        Assert.assertTrue(false);
    }

    @Category(SlowGroup.class)
    @Test
    public void testDemo2(){
        Assert.assertEquals("diff two values", 100, 10);
        Assert.assertTrue(false);
    }

    @Category(SlowGroup.class)
    @Test
    public void testDemo3(){
        Assert.assertThat("actual value close to 10",
                9.88,
                CoreMatchers.anyOf(Matchers.closeTo(10.0, 0.1), CoreMatchers.equalTo(9.88) ));
    }


    @Category(FastGroup.class)
    @Test
    public void testDemo4(){
        Assert.assertTrue(false);
    }
}
