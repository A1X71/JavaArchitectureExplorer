package org.youspirited.chapter2.util;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

import java.util.Collection;
import java.util.Map;

/**
 * ----------------------------------------------
 * ${DESCRIPTION}
 * ----------------------------------------------
 *
 * @Author: Wang Dongxu
 * @Date: Created in 8:58 2018/11/30
 * @Modified By:
 * ----------------------------------------------
 */
public final class CollectionUtil {
    public static boolean isEmpty(Collection<?> collection){
        return CollectionUtils.isEmpty(collection);
    }
    public static boolean isNotEmpty(Collection<?> collection){
        return  !isEmpty(collection);
    }
    public static boolean isEmpty(Map<?,?> map){
        return MapUtils.isEmpty(map);
    }
    public static boolean isNotEmpty(Map<?,?> map){
        return !MapUtils.isEmpty(map);
    }

}
