package com.github.sx.datacontrol.utils;


import com.github.sx.datacontrol.utils.exception.ValidationException;

import java.util.Collection;

/**
 * @author sunxiao
 * @date 2020/4/25 6:11 下午
 */
public class AssertUtil {

    public static <T> void isNotEmpty(T[] data, String msg) {
        if (DataUtil.isEmpty(data)) {
            throw new ValidationException(msg);
        }
    }

    public static <T> void isEmpty(T[] data, String msg) {
        if (DataUtil.isNotEmpty(data)) {
            throw new ValidationException(msg);
        }
    }

    public static <T,C extends Collection<T>> void isEmpty(C data, String msg) {
        if (DataUtil.isNotEmpty(data)) {
            throw new ValidationException(msg);
        }
    }

    public static <T,C extends Collection<T>> void isNotEmpty(C data, String msg) {
        if (DataUtil.isEmpty(data)) {
            throw new ValidationException(msg);
        }
    }

    public static void isTrue(Boolean data, String msg) {
        if (!data) {
            throw new ValidationException(msg);
        }
    }

    public static void isFalse(Boolean data, String msg) {
        if (data) {
            throw new ValidationException(msg);
        }
    }

    public static <T> void isNull(T data, String msg) {
        if (DataUtil.isNotNull(data)) {
            throw new ValidationException(msg);
        }
    }

    public static <T> void isNotNull(T data, String msg) {
        if (DataUtil.isNull(data)) {
            throw new ValidationException(msg);
        }
    }
}
