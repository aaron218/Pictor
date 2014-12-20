package net.theneverland.Judge;

import java.util.Date;

/**
 * Created by Administrator on 2014/12/20 0020.
 * 判定时间范围的工具
 */
public class TimeRangeJudge {

    /***
     * 简单的时间是否在范围内的判定
     * @param input 待判定时间
     * @param start 时间开始
     * @param end 时间结束
     * @return 判定结果
     */
    public static boolean dateInRange(Date input, Date start, Date end){
        return start.compareTo(input) > 0 && end.compareTo(input) < 0;
    }


}
