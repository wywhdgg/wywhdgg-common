package com.wywdgg.dzb;

import com.wywdgg.dzb.exception.ArgumentException;
import java.util.Map;

/**
 * @author: dongzhb
 * @date: 2019/8/12
 * @Description:  object data check
 */
public class AssertUtil {

    private static  final int SUCCESS=200;
    private static  final int ERROR=404;

    /**
     * object check
     * @param  obj params
     * @param argument  prompt message
     * */
    public static void notNullOrEmpty(Object obj,String argument) {
        if (obj == null) {
            throw new ArgumentException(argument, "is null", ERROR);
        }
        if (obj instanceof String) {
            if (((String) obj).isEmpty()) {
                throw new ArgumentException(argument, "is empty", ERROR);
            }
        }
        if(obj instanceof Map){
            if (((Map) obj).isEmpty()) {
                throw new ArgumentException(argument, "is empty", ERROR);
            }
        }
    }

}
