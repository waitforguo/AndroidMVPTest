package com.fausgoal.mvptest.utils;

import java.util.Collection;

/**
 * Description：
 * <br/><br/>Created by Fausgoal on 16/8/1.
 * <br/><br/>
 */
public class GLListUtil {
    public static boolean isEmpty(Collection<?> list) {
        return null == list || list.isEmpty();
    }

    public static int getSize(Collection<?> list) {
        if (isEmpty(list)) {
            return 0;
        }
        return list.size();
    }
}
