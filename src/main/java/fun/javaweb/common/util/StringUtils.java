package fun.javaweb.common.util;

/**
 * 字符串工具类
 * @author 李幸
 * @date 2018/1/4
 * @time 18:33
 */
public class StringUtils {

    /**
     * 判断字符串是会否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        if(str != null){
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    /**
     * 判断字符串是否非空
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }

}
