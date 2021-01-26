package mock;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;

public class DivisionTest {

    Division division=new Division();
    Division2 division2=new Division2();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void divid() {
        Assert.assertThat(division.divid(10, 5), Matchers.equalTo(2));
    }

    @Test
    public void dividReturnWithZero(){
        Assert.assertThat(division.divid(1, 2), Matchers.equalTo(0));
    }

    @Test
    public void dividByZero(){
        Assert.assertThat(division.divid(100, 0), Matchers.equalTo(null));
    }

//    @Test
//    public void dividWithAG100(){
//        assertThat(division.divid(1000, 20), equalTo(null));
//    }


    @Test
    public void divid2(){
        Assert.assertThat(division2.divid2(100, 10 ,5, division), Matchers.equalTo(2));
        Division mockDivision= Mockito.mock(Division.class);
        Mockito.when(mockDivision.divid(ArgumentMatchers.anyInt(), ArgumentMatchers.anyInt())).thenReturn(11);
        System.out.println(mockDivision.divid(0, 2));

        Assert.assertThat(division2.divid2(0, 1 ,5, mockDivision), Matchers.equalTo(0));

    }

    @Test
    public void divid3(){
        Division2 mockDivision2= Mockito.mock(Division2.class);
        Mockito.when(mockDivision2.divid3(ArgumentMatchers.anyInt(), ArgumentMatchers.anyInt(), ArgumentMatchers.anyInt())).thenCallRealMethod();

        Mockito.when(mockDivision2.divid(ArgumentMatchers.anyInt(), ArgumentMatchers.anyInt())).thenReturn(10);
        Assert.assertThat(mockDivision2.divid3(0, 0, 5), Matchers.equalTo(2));

        Mockito.when(mockDivision2.divid(ArgumentMatchers.anyInt(), ArgumentMatchers.anyInt())).thenReturn(100);
        Assert.assertThat(mockDivision2.divid3(0, 0, 5), Matchers.equalTo(0));


    }
}