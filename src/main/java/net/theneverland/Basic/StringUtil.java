package net.theneverland.Basic;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by aaron on 12/18/2014.
 * 字符串处理工具类
 * <br>设计原则
 * <ul>
 *     <li> 易用，高效，可重入
 *     <li> 尽量减少程序执行中的对象生成，减少诸如"".equals()判定中生成的临时的对象
 */
public class StringUtil {

    public static final String emptyStr = "";
    public static final String Zero = "0";
    public static final String NullStr = "null";
    public static final String Confirm = "yes";
    public static final String Reject = "no";

//判定型功能区    用于字符串判定的方法如下
    public  static boolean StrEquals(String value,String constStr){
        if(value == null && constStr ==null){
            return true;
        }else if(value == null || constStr ==null){
            return false;
        }
        return value.equals(constStr);
    }


    /**
     * 判断是否是符合标准的日期字符串 用尝试转化成日期的方式，性能消耗较大
     * @param str_input 待检测字符串
     * @param rDateFormat 日期格式
     * @return 匹配则返回true
     */
    public static boolean isDate(String str_input, String rDateFormat) {
        if (!isNull(str_input)) {
            SimpleDateFormat formatter = new SimpleDateFormat(rDateFormat);
            formatter.setLenient(false);
            try {
                formatter.format(formatter.parse(str_input));
            } catch (Exception e) {
                return false;
            }
            return true;
        }
        return false;
    }

    /***
     * 是否是null
     * @param str 待检测字符串
     * @return 字符串为null 返回true
     */
    public static boolean isNull(String str) {
        return str == null;
    }

    /***
     * 是否是null或者空字符串
     * @param str 待检测字符串
     * @return 字符串为null或 长度为0 或 只包含英文空格 返回true
     */
    public static boolean isNullOrEmpty(String str){
        return isNull(str) || emptyStr.equals(str) || str.length() == 0 || str.trim().length() == 0;
    }

    /***
     * 判断对象toString之后是否是null或者空字符串，也可用于特殊情况下的对象判空
     * @param obj 待检测对象
     * @return 对象为null 或者 对象的toString()用{@link StringUtil#isNullOrEmpty}判定之后的结果
     */
    public static boolean isNullStr(Object obj){
        return obj == null || isNullOrEmpty(obj.toString());
    }

    /***
     * 判断字符串是否是0 ，包含 0 和 "0"两种情况
     * @param str 待验证字符串
     * @return 内容为0和 "0"都返回true
     */
    public static boolean isZero(String str) {
        return !isNullOrEmpty(str) &&
                !(isNullOrEmpty(str.replace("\"", "")) || !Zero.equals(str.replace("\"", "")));
    }

    /**
     * 判断字符串是否是数字 完全是数字返回true
     * @param str 待检测字符串
     * @return 完全是数字返回true
     */
    public static boolean isNumeric(String str) {
        return org.apache.commons.lang3.StringUtils.isNumeric(str);
    }

    /**
     * 判断字符串是否是浮点数 浮点数必须包括英文小数点
     * @param value 待判定字符串
     * @return 符合浮点数判定情况为true
     */
    public static boolean isDouble(String value) {
        try {
            Double d=Double.parseDouble(value.trim());
            String tempD=d.toString();
            return tempD.contains(".");
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * 判断字符串是否是数字 包括整数和浮点数
     * @param value 待判定字符串
     * @return 符合浮点数或整数定义的返回true
     */
    public static boolean isNumber(String value) {
        return !(value == null || StringUtil.isNullStr(value))
                && (isNumeric(value) || isDouble(value));
    }

//转换型功能区   用于字符串转换、分割的方法
    /***
     * 将逗号分隔的数字字符串转换成List<Long>
     * @param value 逗号分隔的数字字符串
     * @return 返回List或者null
     */
    public static List<Long> stringToLongArray(Object value){
        if(value == null || StringUtil.isNullStr(value.toString())){
            return null;
        }
        List<Long> ls = new ArrayList<Long>();
        String[] ids = value.toString().split(",");
        for (String id : ids) {
            try {
                if (StringUtil.isNumber(id)) {
                    ls.add(Long.parseLong(id));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ls;
    }

    /***
     * 获取从指定位置到指定字符之间的字符串<br>
     * 字符串先通过{@link StringUtil#isNullOrEmpty}判空，对于空字符串，直接返回null，index大于字符串长度或者split字符未定义的，返回null
     * <br>指定的split字符在字符串中不存在时，则返回从index到字符串结尾的字串
     * @param str 待处理字符串
     * @param index 起始位置
     * @param split 结尾判定分隔符
     * @return 符合条件的子串
     */
    public static String subStringByChar(String str, int index, char split){
        if(StringUtil.isNullOrEmpty(str) || index >= str.length() || split == '\0'){
            return null;
        }
        if(str.indexOf(split,index) == -1){
            return  str.substring(index);
        }
        return str.substring(index, str.indexOf(split, index));
    }

    /***
     * 获取从指定字符串indexStr到指定字符split之间的字符串，并且不包括indexStr字符串
     * <br>如果指定的字符串在str串中不存在，则返回str字符串
     * @param str 待处理字符串
     * @param indexStr 判定字符串
     * @param split 结尾判定分隔符
     * @return 符合条件的子串
     */
    public static String subStringByChar(String str, String indexStr, char split){
        if(isNullOrEmpty(indexStr)){
            return subStringByChar(str, 0, split);
        }
        if(!str.contains(indexStr)){
            return str;
        }
        return subStringByChar(str, str.indexOf(indexStr) + indexStr.length(), split);
    }
}
