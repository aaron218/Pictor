package net.theneverland.Basic;

import net.theneverland.ConstantType;
import net.theneverland.ConstantType.DateType;
import org.joda.time.DateTime;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by aaron on 12/20/2014.
 * 日期范围工具 处理不同的输入日期，返回起止两个日期对象(这两个对象在参数中传入) 该日期处理依赖于joda-time包
 */
public class DateRangUtil {

    /**
     * 按照处理类型将日期处理成起止日期形式
     * <br>和Calendar的处理方式不同，这里的时间返回的不是自当前时间到某个时间的时间段，而是符合当前时间和时间类型情况的时间段
     * <br>例如，输入类型为月，则返回input对应日期的所在月的开始和结尾。而（Calendar.MONTH,-1）的返回是从当前时间起到一个月前
     * <ul>
     * <li>如果输入的input为null，则相当于输入当前时间
     * <li>如果输入的type为null，则自动赋值为{@link DateType#DATE_DAY}，相当于返回一天范围内的日期
     *
     * @param input 输入的日期
     * @param type  输入的日期类型
     * @param start 返回的开始时间
     * @param end   返回的结束时间
     */
    public static void getByType(Date input, DateType type, Date start, Date end) {
        if (start == null || end == null) {
            return;
        }
        if (input == null) {
            input = new Date();
        }
        if (type == null) {
            type = DateType.DATE_DAY;
        }
        DateTime dateTime = new DateTime(input);
        switch (type) {
            case DATE_YEAR: {
                end = dateTime.dayOfYear().withMaximumValue().millisOfDay().withMaximumValue().toDate();
                start = dateTime.dayOfYear().withMinimumValue().millisOfDay().withMinimumValue().toDate();
                break;
            }
            case DATE_MONTH: {
                end = dateTime.dayOfMonth().withMaximumValue().millisOfDay().withMaximumValue().toDate();
                start = dateTime.dayOfMonth().withMinimumValue().millisOfDay().withMinimumValue().toDate();
                break;
            }
            case DATE_WEEK: {
                end = dateTime.dayOfWeek().withMaximumValue().millisOfDay().withMaximumValue().toDate();
                start = dateTime.dayOfWeek().withMinimumValue().millisOfDay().withMinimumValue().toDate();
                break;
            }
            case DATE_DAY: {
                end = dateTime.millisOfDay().withMaximumValue().toDate();
                start = dateTime.millisOfDay().withMinimumValue().toDate();
                break;
            }
            case DATE_HOUR: {
                end = dateTime.minuteOfHour().withMaximumValue().secondOfMinute().withMaximumValue().toDate();
                start = dateTime.minuteOfHour().withMinimumValue().secondOfMinute().withMaximumValue().toDate();
                break;
            }
            case DATE_MINUTE: {
                end = dateTime.secondOfMinute().withMaximumValue().toDate();
                start = dateTime.secondOfMinute().withMinimumValue().toDate();
            }
            case DATE_SECOND: {
                end = dateTime.millisOfSecond().withMaximumValue().toDate();
                start = dateTime.millisOfSecond().withMinimumValue().toDate();
            }
            default:
                break;
        }

    }
}
