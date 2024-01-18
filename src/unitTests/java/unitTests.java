import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.example.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class unitTests {
@Test
    public void positive_DataSet1_hackerRank1(){
        List<Integer> ranks = Arrays.asList(100,100,50,40,40,20,10);
        List<Integer> player = Arrays.asList(5,25,50,120);
        List<Integer> expectedResult = Arrays.asList(6,4,2,1);

        List<Integer> actualResult = Main.rankedList(ranks,player);
        Assert.assertEquals(actualResult,expectedResult);
    }

@Test
public void positive_DataSet2(){
    List<Integer> ranks = Arrays.asList(130,100,100,50,40,40,20,10);
    List<Integer> player = Arrays.asList(5,25,50,120);
    List<Integer> expectedResult = Arrays.asList(7,5,3,2);

    List<Integer> actualResult = Main.rankedList(ranks,player);
    Assert.assertEquals(expectedResult,actualResult);
}

    @Test
    public void positive_DataSet3(){
        List<Integer> ranks = Arrays.asList(100);
        List<Integer> player = Arrays.asList(5,25,50,120);
        List<Integer> expectedResult = Arrays.asList(2,2,2,1);

        List<Integer> actualResult = Main.rankedList(ranks,player);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void positive_DataSet4(){
        List<Integer> ranks = Arrays.asList(130,100,100,50,40,40,20,10,-1,-5);
        List<Integer> player = Arrays.asList(-1);
        List<Integer> expectedResult = Arrays.asList(7);

        List<Integer> actualResult = Main.rankedList(ranks,player);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void negative_DataSet5(){
        List<Integer> ranks = Arrays.asList(-5);
        List<Integer> player = Arrays.asList(-1);
        List<Integer> expectedResult = Arrays.asList(2);

        List<Integer> actualResult = Main.rankedList(ranks,player);
        Assert.assertNotEquals(expectedResult,actualResult);
    }

    @Test
    public void positive_DataSet6_hackerRank2(){
        List<Integer> ranks = Arrays.asList(100,90,90,80);
        List<Integer> player = Arrays.asList(70,80,105);
        List<Integer> expectedResult = Arrays.asList(4,3,1);

        List<Integer> actualResult = Main.rankedList(ranks,player);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void positive_DataSet7_hackerRank3(){
        List<Integer> ranks = Arrays.asList(100,90,90,80,75,60);
        List<Integer> player = Arrays.asList(50,65,77,90,102);
        List<Integer> expectedResult = Arrays.asList(6,5,4,2,1);

        List<Integer> actualResult = Main.rankedList(ranks,player);
        Assert.assertEquals(expectedResult,actualResult);
    }
}
