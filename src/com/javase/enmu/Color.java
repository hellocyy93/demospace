package com.javase.enmu;

public enum Color {
    RED("R", "红色"),
    BLUE("B", "蓝色"),
    GREEN("G", "绿色");
    private String code;
    private String desc;

    Color(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Color getValue(String code) {
        for (Color color : values()) {
            if (color.getCode().equals(code)) {
                return color;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
