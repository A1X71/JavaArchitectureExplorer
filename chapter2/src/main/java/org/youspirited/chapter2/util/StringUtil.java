package org.youspirited.chapter2.util;
import org.apache.commons.lang3.StringUtils;
/**
 * ----------------------------------------------
 * ${DESCRIPTION}
 * ----------------------------------------------
 *
 * @Author: Wang Dongxu
 * @Date: Created in 8:53 2018/11/30
 * @Modified By:
 * ----------------------------------------------
 */
public final class StringUtil {
    public static boolean isEmpty(String str){
        if(str!=null)
        {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
