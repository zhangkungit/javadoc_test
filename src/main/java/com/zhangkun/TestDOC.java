package com.zhangkun;

import java.io.Serializable;

/**
 * @author zhangkun
 * @version 1.0
 * @date 2017/7/11 16:07
 * @description
 */
public class TestDOC implements Serializable {
    private static final long serialVersionUID = 7125887157956252462L;
    /**
     * 变量anInt
     */
    int anInt;
    /**
     * 变量string
     */
    String string;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
