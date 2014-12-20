package net.theneverland.Basic;

/**
 * Created by Administrator on 2014/12/20 0020.
 * 简答的Json工具，只是按照json的字符串特性进行处理，复杂的处理应交给gson等工具<br>>
 * json字符串支持"Key":"Value" 或者 Key:Value形式;并且不处理Json中的嵌套等格式，统一按照平坦字符串数据处理
 */
public class SimpleJsonUtil {

//判定型方法

    /***
     * 主要用于工具内部使用 判断json中是否包含key 后期待扩展
     * @param json 待判定json
     * @param key 待查找key
     * @return 查找结果
     */
    public static boolean haveKey(String json, String key){
        return json.contains(key+":");
    }
}
