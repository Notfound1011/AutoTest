package mock;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class MockTest {
    @Test
    public void testMockDemo(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        Assert.assertThat(list.size(), Matchers.equalTo(5));

    }

    @Test
    public void testMockDemo2(){
        ArrayList<Integer> list= Mockito.mock(ArrayList.class);
        list.add(1);
        list.add(2);
        Mockito.when(list.size()).thenReturn(500);
        Assert.assertThat(list.size(), Matchers.equalTo(500));

    }

    @Test
    public void testSpy(){
        ArrayList<Integer> list= Mockito.mock(ArrayList.class);
        list.add(1);
        list.add(2);
        Mockito.verify(list).add(3);
    }
}
