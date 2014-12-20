package net.theneverland.Basic;

import org.joda.time.DateTime;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by aaron on 12/20/2014.
 */
public class CustomTestDate {

    @Test
    public void testJodaDateTime(){
        Date date = new Date();
        System.out.println(System.currentTimeMillis());
        long start = System.currentTimeMillis();
        DateTime dateTime = new DateTime(date);
        Method[] methods = DateTime.class.getDeclaredMethods();
        System.out.println(dateTime.dayOfMonth().withMaximumValue());
        System.out.println(dateTime.millisOfDay().withMaximumValue());
        System.out.println(dateTime.dayOfYear().withMaximumValue().millisOfDay().withMaximumValue());
        System.out.println(dateTime.minusYears(-1));
        for (int i=0;i<1000000;i++){ //对100万数据的一次操作大约450毫秒
            DateTime dateTime1 = new DateTime(new Date());
            dateTime1 = dateTime1.minusYears(i);
            dateTime1.dayOfMonth().withMaximumValue();
            dateTime1.millisOfDay().withMaximumValue();
            dateTime1.dayOfYear().withMaximumValue().millisOfDay().withMaximumValue();
        }
        System.out.println("Time"+(System.currentTimeMillis()-start));
    }

    @Test
    public void testString(){
        String strroot = "20141010";
        long start = System.currentTimeMillis();
        for (int i=0;i<1000000;i++){
            new Date();
            strroot = strroot.substring(0,3)+"1231235959";
            strroot = strroot.substring(0,3)+"0101000000";
        }
        System.out.println("Time:"+(System.currentTimeMillis()-start));
    }
}
