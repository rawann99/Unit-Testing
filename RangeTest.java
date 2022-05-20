package org.jfree.data.test;

import org.jfree.data.Range;
import org.junit.Assert;
import org.junit.Test;

public class RangeTest {

    Range range_n=new Range(-20,-10);
    Range range_p=new Range(12,20);
    Range range_null=new Range(12,18);
    Range range1=new Range(-15,-10);
    Range range2=new Range(-20,-15);

    Range range3=new Range(12,18);
    Range range4=new Range(15,20);
    Range range5=new Range(12,21);
    Range range6=new Range(1,18);
    Range range7=new Range(-15,18);
    Range range8=new Range(-15,18);
    Range range9=new Range(13,15);
    Range range10=new Range(-18,-12);
    Range range11=new Range(20,30);
    Range range12=new Range(11,11);

    //Assert.assertEquals(true,range.contains(-8));
    @Test
/*
    public void test_combine() {

        Assert.assertEquals(range_n,range_n.combine(range1,range2));// error in compile upper bound
        Assert.assertEquals(range_p,range_p.combine(range3,range4));// error in compile upper bound
     Assert.assertEquals(range7,range1.combine(range1,range3));// error in compile upper bound
      Assert.assertEquals(range_null,range_p.combine(null,range_null));//sucessfully
       Assert.assertEquals(range_null,range_p.combine(range_null,null));//sucessfully
        Assert.assertEquals(null,range3.combine(null,null));//sucessfully
    }

 */


        //////////////////////////////////////////
/*

    public void test_constrain() {
         Assert.assertEquals(18,range3.constrain(20.9),0);//sucessfully
        Assert.assertEquals(12,range3.constrain(2.1),0);//sucessfully
      Assert.assertEquals(13.6,range3.constrain(13.6),0);//sucessfully
      Assert.assertEquals(12,range3.constrain(12),0);//sucessfully
        Assert.assertEquals(18,range3.constrain(18),0);//sucessfully
        Assert.assertEquals(-10,range1.constrain(-4),0);
       Assert.assertEquals(-11,range1.constrain(-11),0);
        Assert.assertEquals(-15,range1.constrain(-30),0);
    }*/





        /////////////////////
/*
    public void test_contains() {

        Assert.assertEquals(false,range3.contains(-8));//sucessfully
        Assert.assertEquals(false,range3.contains(20));//sucessfully
        Assert.assertEquals(true,range3.contains(15));//sucessfully
        Assert.assertEquals(true,range3.contains(18));//sucessfully
        Assert.assertEquals(true,range3.contains(12));//error when the value is equal to lower bound


    }


 */
/*
    public void test_equals() {

        Assert.assertTrue(range3.equals(range_null));//sucessfully
        Assert.assertFalse(range3.equals(range6));//sucessfully
         Assert.assertFalse(range3.equals(range5));//sucessfully
        Assert.assertTrue(range3.equals(range3));//sucessfully


       Assert.assertFalse(range3.equals(range9));//sucessfully
        Assert.assertFalse(range3.equals(range10));//sucessfully
        Assert.assertFalse(range3.equals(range11));//sucessfully
    }

*/


    //////////////////////////////////////

/*
    public void test_getCentralValue() {


        Assert.assertEquals(15,range3.getCentralValue(),0);//sucessfully
        Assert.assertEquals(-15,range_n.getCentralValue(),0);//sucessfully
        Assert.assertEquals(17,range3.getCentralValue(),0);//sucessfully
        Assert.assertEquals(13,range3.getCentralValue(),0);//sucessfully
        Assert.assertEquals(9.5,range6.getCentralValue(),0);//sucessfully
    }


 */


        /////////////////
/*
    public void test_getLength() {
        Assert.assertEquals(5,range1.getLength(),0);//sucessfully
        Assert.assertEquals(6,range3.getLength(),0);//sucessfully
        Assert.assertEquals(0,range12.getLength(),0);//sucessfully
    }


 */


        ///////////////////////
   /*
    public void test_getLowerBound() {
        Assert.assertEquals(12,range3.getLowerBound(),0);//sucessfully
        Assert.assertEquals(-15,range1.getLowerBound(),0);//sucessfully
    }

    */


        /////////////////////////////
/*
    public void test_getUpperBound() {
        Assert.assertEquals(18,range3.getUpperBound(),0);//sucessfully
        Assert.assertEquals(-10,range1.getUpperBound(),0);//sucessfully
    }

 */


        ////////////////////
/*
   public void test_intersects() {
       Assert.assertTrue(range3.intersects(13,15));//sucessfully
        Assert.assertTrue(range3.intersects(9,13));//sucessfully
        Assert.assertTrue(range3.intersects(12,18));//sucessfully
        Assert.assertTrue(range3.intersects(13,19));//sucessfully
        Assert.assertTrue(range3.intersects(18,20));//sucessfully
        Assert.assertTrue(range3.intersects(10,12));//sucessfully
        Assert.assertTrue(range3.intersects(10,11));//logic error return error and must be false
        Assert.assertTrue(range3.intersects(19,21));//logic error return error and must be false
    }

*/


        ///////////////////////////////
/*
    public void test_shift_withoutzerocrossing(){

        Range r_p=new Range(14,20);
        Range rn=new Range(-6,0);
        Range rnn=new Range(10,16);
        Range r1=new Range(-10,-10);
        Range r2=new Range(-16,-10);
        Range r3=new Range(-25,-20);


        Assert.assertEquals(r_p,range3.shift(range3,2));//sucess with pos delta

        Assert.assertEquals(range3,range3.shift(range3,0));//sucess with zero delta
        Assert.assertEquals(rn,range_p.shift(range_p,-20));//sucess not allow zero crossing
        Assert.assertEquals(r2,r2.shift(rn,-10));//dealing right with negative intervals
        Assert.assertEquals(r3,range1.shift(range1,-10));//dealing right with negative intervals
        Assert.assertEquals(rnn,range3.shift(range3,-2));//sucess with - delta
        assertThrows(IllegalArgumentException.class,
                () ->{
                    this.range3.shift(null,10);
                });// throw exception with null base

    }


*/




/*
    public void test_shift_withzerocrossing()

    {
        Range r0=new Range(12,18);
        Range r_p=new Range(14,20);
        Range rn=new Range(-6,0);
        Range rnn=new Range(10,16);
        Range r1=new Range(-10,-10);
        Range r2=new Range(10,10);
        Range r3=new Range(-20,-20);

//        Assert.assertEquals(rn,range_p.shift(r_p,-20,true));//sucess  allow zero crossing from right to left
//        Assert.assertEquals(r2,r3.shift(r3,30,true));//dealing right with negative intervals allow zero crossing from left to right
//        Assert.assertEquals(rnn,range3.shift(range3,-2,true));//sucess with - delta
//        Assert.assertEquals(r0,range3.shift(range3,0,true));//sucess with zero delta
//        Assert.assertEquals(r_p,range3.shift(range3,2,true));//sucess with pos delta
        assertThrows(IllegalArgumentException.class,
                () ->{
                    this.range_p.shift(null,-20,true);//thow exception with null base
                });//thow exception with null base

    }
*/






    public void test_expand(){
        Range r1=new Range(2,6);
        Range r1_res=new Range(3,8);
        Range r1_res_n=new Range(1,4);
        Range r_n_res=new Range(-15,-5);
        Range r1_res_2=new Range(2,8);

        Assert.assertEquals(r1_res,r1.expand(r1,.25,.5)); //test with + lower and upper percentage
        Assert.assertEquals(r1_res_n,r1.expand(r1,-.25,-.5));//test with - lower and upper
        Assert.assertEquals(r_n_res,range_n.expand(range_n,.5,.5));// test with - range
        Assert.assertEquals(range_n,range_n.expand(range_n,0,0));// test with 0 percentage
        Assert.assertEquals(r1_res_2,r1.expand(r1,0,.5));
        assertThrows(IllegalArgumentException.class,
                () ->{
                    this.range_n.expand(null,.5,.5);//thow exception with null base
                });//throw exception


    }



/*

    public void test_expendToInclude(){
        Range r1=new Range(2,6);
        Range r1_res=new Range(2,11.7);
        Range r1_res_2=new Range(1,6);
        Range range_p_res=new Range(-20,11.7);
       Assert.assertEquals(r1_res,r1.expandToInclude(r1,11.7));//test with values greater than upper
        Assert.assertEquals(r1,r1.expandToInclude(r1,3));//test with value smaller than upper get the range
        Assert.assertEquals(r1_res_2,r1.expandToInclude(r1,1));//test with value smaller than lower get new range from new lower to upper
        Assert.assertEquals(range_p_res,range_p.expandToInclude(range_n,11.7));//test with - range
        Assert.assertEquals(r1_res,r1.expandToInclude(null,11.7));//test that null range is permitted
        Assert.assertEquals(r1,r1.expandToInclude(r1,6));
        Assert.assertEquals(r1,r1.expandToInclude(r1,2));





    }
    
 */













}
