package net.theneverland.java.Basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by aaron on 12/18/2014.
 * 通用一般性的日期工具
 * 不包括GMT时间处理等复杂时间处理
 */
public class DateUtil {

    /***
     * "HH:mm:ss"
     */
    public static final String TIME_PATTERN = "HH:mm:ss";
    /***
     * "yyyy-MM-dd HH:mm:ss.S"
     */
    public static final String DATE_TIME_MS_PATTERN = "yyyy-MM-dd HH:mm:ss.S";//23
    /***
     * "yyyy-MM-dd HH:mm:ss"
     */
    public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";//19
    /***
     * "yyyyMMdd"
     */
    public static final String DATE_YYYYMMDD_PATTERN = "yyyyMMdd";
    /***
     *  "HH:mm"
     */
    public static final String TIME_HHMM_PATTERN = "HH:mm";
    /***
     * "yyyyMMdd HH:mm:ss"
     */
    public static final String DATE_TIME_NO_HORI_PATTERN = "yyyyMMdd HH:mm:ss";//17
    /***
     * "yyyyMMddHHmmss"
     */
    public static final String DATE_TIME_NO_SPACE_PATTERN = "yyyyMMddHHmmss";//14
    /***
     * "yyyyMMdd HH:mm"
     */
    public static final String DATE_TIME_PLAYBILL_PATTERN = "yyyyMMdd HH:mm";//14
    /***
     * "EEE MMM dd HH:mm:ss zzz yyyy"
     */
    public static final String DATE_ENGLISH_FORMAT = "EEE MMM dd HH:mm:ss zzz yyyy";//28
    /***
     * "yyyy"
     */
    public static final String DATE_YYYY_PATTERN = "yyyy";
    /***
     * "yyyyMM"
     */
    public static final String DATE_YYYYMM_PATTERN = "yyyyMM";

    public static final SimpleDateFormat simpleTimeFormat = new SimpleDateFormat(TIME_PATTERN);
    public static final SimpleDateFormat timeFormat = new SimpleDateFormat(DATE_TIME_MS_PATTERN);
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_TIME_PATTERN);
    public static final SimpleDateFormat yyyyMMdd = new SimpleDateFormat(DATE_YYYYMMDD_PATTERN);
    public static final SimpleDateFormat yyyyMM = new SimpleDateFormat(DATE_YYYYMM_PATTERN);
    public static final SimpleDateFormat yyyy = new SimpleDateFormat(DATE_YYYY_PATTERN);
    public static final SimpleDateFormat HHmm = new SimpleDateFormat(TIME_HHMM_PATTERN);
    public static final SimpleDateFormat yyyyMMddHHmmss = new SimpleDateFormat(DATE_TIME_NO_HORI_PATTERN);
    public static final SimpleDateFormat yyyyMMddHHmmssFile = new SimpleDateFormat(DATE_TIME_NO_SPACE_PATTERN);
    public static final SimpleDateFormat PLAYBILL_TIME_PATTERN = new SimpleDateFormat(DATE_TIME_PLAYBILL_PATTERN);
    public static final SimpleDateFormat ENGLISH_SDF = new SimpleDateFormat(DATE_ENGLISH_FORMAT, Locale.ENGLISH);

    private static Map<String, SimpleDateFormat> patternFormatMap;

    public static Map<String, SimpleDateFormat> getInstance(){

        if(patternFormatMap ==null){
            patternFormatMap = new HashMap<String, SimpleDateFormat>();
            patternFormatMap.put(TIME_PATTERN, simpleTimeFormat);
            patternFormatMap.put(DATE_TIME_MS_PATTERN, timeFormat);
            patternFormatMap.put(DATE_TIME_PATTERN, dateFormat);
            patternFormatMap.put(DATE_YYYYMMDD_PATTERN, yyyyMMdd);
            patternFormatMap.put(DATE_YYYYMM_PATTERN, yyyyMM);
            patternFormatMap.put(DATE_YYYY_PATTERN, yyyy);
            patternFormatMap.put(TIME_HHMM_PATTERN, HHmm);
            patternFormatMap.put(DATE_TIME_NO_HORI_PATTERN, yyyyMMddHHmmss);
            patternFormatMap.put(DATE_TIME_NO_SPACE_PATTERN, yyyyMMddHHmmssFile);
            patternFormatMap.put(DATE_TIME_PLAYBILL_PATTERN, PLAYBILL_TIME_PATTERN);
            patternFormatMap.put(DATE_ENGLISH_FORMAT, ENGLISH_SDF);
        }
        return patternFormatMap;
    }

    /***
     * 日期转换成字符串
     * @param pattern 日期模式
     * @param adate 待转换日期
     * @return 按照模式输出的日期字符串
     */
    public static String formatDate(String pattern, Date adate){
        SimpleDateFormat sdf = DateUtil.getInstance().get(pattern);
        if(sdf==null){
            sdf = new SimpleDateFormat(pattern);
            DateUtil.getInstance().put(pattern, sdf);
        }
        return sdf.format(adate);
    }

    /***
     * 字符串转换成日期 异常信息直接打印而不再抛出
     * @param pattern 日期模式
     * @param dateStr 待转换字符串
     * @return 按照模式输出的日期对象
     */
    public static Date parseDate(String pattern, String dateStr){

        SimpleDateFormat sdf = DateUtil.getInstance().get(pattern);

        if(sdf==null){

            sdf = new SimpleDateFormat(pattern);
            DateUtil.getInstance().put(pattern, sdf);
        }

        try {
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 把日期字符串date转换成pattern形式 并输出字符串
     * @param date 输入的日期字符串
     * @param pattern 输出日期字符串的格式
     * @return 输出日期字符串
     * @throws java.lang.Exception 异常
     */
    public static String strToString(String date,String pattern) throws Exception{
        if(StringUtil.isNullOrEmpty(date) || StringUtil.isNullOrEmpty(pattern)){
            return date;
        }
        if(date.length() < pattern.length()){
            throw new Exception("Input date is shorter than pattern!");
        }
        if(DateUtil.getInstance().get(getDatePattern(date)) == null
                || DateUtil.getInstance().get(pattern) == null){
            throw new Exception("No DatePatten matched the date or pattern");
        }
        Date dateStr = DateUtil.getInstance().get(getDatePattern(date)).parse(date);
        return DateUtil.getInstance().get(pattern).format(dateStr);
    }

    /***
     * 转换日期字符串到Calendar对象，其中日期格式自主判定
     * @param str 日期字符串
     * @return Calendar对象
     */
    public static Calendar strToCalendar(String str){
        return new Calendar.Builder().setInstant(DateUtil
                .parseDate(str, DateUtil.getDatePattern(str))).build();
    }



    //日期整理工具
    /***
     * 返回匹配的日期日期格式字符串，目前只按照对应日期字符串的长度来判定,
     * <br>并不保证日期转换可以成功，一般用于工具内部处理或者对确定的类型进行判定转换
     * 如果无法匹配，返回null
     * @param date 待判定日期
     * @return 返回日期格式字符串 如果无法匹配，返回null
     */
    public static String getDatePattern(String date){
        switch (date.length()){
            default: {return  null;}
            case 4 : {return DATE_YYYY_PATTERN;}
            case 5 : {return TIME_HHMM_PATTERN;}
            case 6 : {return DATE_YYYYMM_PATTERN;}
            case 8 : {return date.contains(":") ? TIME_PATTERN : DATE_YYYYMMDD_PATTERN;}
            case 14: {return date.contains(":") ? DATE_TIME_PLAYBILL_PATTERN
                                                    : DATE_TIME_NO_SPACE_PATTERN;}
            case 17: {return DATE_TIME_NO_HORI_PATTERN;}
            case 19: {return DATE_TIME_PATTERN;}
            case 23: {return DATE_TIME_MS_PATTERN;}
            case 29: {return DATE_ENGLISH_FORMAT;}
        }
        /*
        for(String str : DateUtil.getInstance().keySet()){
            if(str.length() == date.length()){
                return str;
            }
        }
        */
        //return null;
    }

}
