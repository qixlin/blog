package io.redos.blog.model;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/24 15:18
 * @copyright ©2018
 */
public enum TypeEnum {
    GLOABLE_CONFIG(0,"全局配置");
    private String name;
    private int value;

    TypeEnum(int value, String name){
        this.value = value;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }

    public TypeEnum getValue(int value) {
        if (1 == value) {
            return GLOABLE_CONFIG;
        } else {
            return null;
        }
    }
}
