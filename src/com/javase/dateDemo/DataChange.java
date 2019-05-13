package com.javase.dateDemo;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author chenyy
 * @version V1.0.0
 * @company lhfinance.com
 * @description: java不同数据类型转换
 * @className: DataChange.java
 * @package com.javase.test
 * @date 2019/4/22 18:09
 */
public class DataChange {
    public static void main(String[] args) throws ParseException {
        int num = 123;
        String numStr = Integer.toString(num);
        String numStr2 = String.valueOf(num);
        String str = "321";
        int str1 = Integer.parseInt(str);
        BigDecimal bl = new BigDecimal("567");
        String bl1 = bl.toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s = sdf.format(new Date());
        String s1 = "2019-05-01";
        Date dates = sdf.parse(s1);
        System.out.println(dates);
    }
}
