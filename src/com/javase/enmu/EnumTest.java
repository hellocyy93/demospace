package com.javase.enmu;

/**
 * @author chenyy
 * @version V1.0.0
 * @company lhfinance.com
 * @description: Enmu test
 * @className: EnumTest.java
 * @package com.javase.enmu
 * @date 2019/11/22 14:46
 */
public class EnumTest {
    public static void main(String[] args) {
        String desc = Color.getValue("R").getDesc();
        System.out.println(desc);

        Color color =Color.valueOf("GREEN");
        System.out.println(color.getDesc());

        Color s2 = Color.getValue("R") ;
        System.out.println("获取的值为:"+ s2.toString());
    }
}
