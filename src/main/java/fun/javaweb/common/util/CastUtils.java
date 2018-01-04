package fun.javaweb.common.util;

/**
 * 转型操作工具类
 * @author 李幸
 * @date 2018/1/4
 * @time 22:05
 */
public class CastUtils {
    /**
     * 转化为String类型提供默认值
     * @param object
     * @param defaultValue
     * @return
     */
    public static String castString(Object object,String defaultValue){
        return object != null ? String.valueOf(object) : defaultValue;
    }

    /**
     * 转化为String类型不提供默认值
     * @param object
     * @return
     */
    public static  String castString(Object object){
        return castString(object,"");
    }

    /**
     * 转化为double提供默认值
     * @param object
     * @param defaultValue
     * @return
     */
    public static Double castDouble(Object object,Double defaultValue){
        Double doubleValue = defaultValue;
        if(object != null){
            String strValue = CastUtils.castString(object);
            if(StringUtils.isNotEmpty(strValue)){
                try {
                    doubleValue  = Double.parseDouble(strValue);
                }catch (NumberFormatException e){
                    doubleValue = defaultValue;
                }
            }
        }
        return doubleValue;
    }

    /**
     * 转化为double
     * @param object
     * @return
     */
    public static Double castDouble(Object object){
        return castDouble(object,0.0);
    }

    /**
     * 转化为long提供默认值
     * @param object
     * @param defaultValue
     * @return
     */
    public static Long castLong(Object object,long defaultValue){
        long longValue = defaultValue;
        if(object != null){
            String strValue = castString(object);
            if(StringUtils.isNotEmpty(strValue)){
                try {
                    longValue = Long.parseLong(strValue);
                }catch (NumberFormatException e){
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }

    /**
     * 转化为long类型
     * @param object
     * @return
     */
    public static long castLong(Object object){
        return castLong(object);
    }

    /**
     * 转化为int类型提供默认值
     * @param object
     * @param defaultValue
     * @return
     */
    public static int castInt(Object object,int defaultValue){
        int intValue = defaultValue;
        if(object != null){
            String strValue = castString(object);
            if(StringUtils.isNotEmpty(strValue)){
                try {
                    intValue =  Integer.parseInt(strValue);
                }catch (NumberFormatException e){
                    intValue = defaultValue;
                }
            }
        }
        return intValue;
    }

    /**
     * 转化为int类型
     * @param object
     * @return
     */
    public static int castInt(Object object){
        return castInt(object);
    }


    /**
     * 转化为boolean类型提供默认值
     * @param object
     * @param defaultValue
     * @return
     */
    public static boolean castBoolean(Object object,boolean defaultValue){
        boolean booleanValue = defaultValue;
        if(object != null){
            booleanValue = Boolean.parseBoolean(castString(object));
        }
        return booleanValue;
    }

    /**
     * 转化为boolean类型
     * @param object
     * @return
     */
    public static boolean castBoolean(Object object){
        return castBoolean(object);
    }
}
