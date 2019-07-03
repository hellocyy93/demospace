package com.javase.dateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author chenyy
 * @version V1.0.0
 * @company lhfinance.com
 * @description: 测试修改日期
 * @className: DateTest.java
 * @package com.javase.test
 * @date 2019/4/18 17:59
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
       /* SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("2019-04-30");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cr = Calendar.getInstance();
        cr.setTime(date);
        int year = cr.get(Calendar.YEAR);
        int month = cr.get(Calendar.MONTH);
        int day = cr.get(Calendar.DAY_OF_MONTH);
        System.out.println("年:" + year + ",月:" + month + ",日:" + day);
        cr.set(year, month, 28);
        Date time = cr.getTime();
        int days = cr.get(Calendar.DAY_OF_MONTH);
        System.out.println(time);
        System.out.println(days);*/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Calendar calendar = Calendar.getInstance();

        calendar.set(2018,9,10);
        //calendar.add(Calendar.MONTH,-1)
        Date startDate = calendar.getTime();
        String  startDateString= sdf.format(startDate);

        System.out.println("格式化日期输出 "+startDateString);
       /* SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sf.parse("2019-05-13");
        System.out.println("Before Date: " +date);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DAY_OF_MONTH,1);
        System.out.println("After Date: " + c.getTime());*/

        //业务日期Calendar
      /*  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar bizDateCal = Calendar.getInstance();
        bizDateCal.setTime(new Date());
        System.out.println(sdf.format(bizDateCal.getTime()));
        //账单日Calendar
        Calendar statMntCal = Calendar.getInstance();
        statMntCal.set(bizDateCal.get(Calendar.YEAR), bizDateCal.get(Calendar.MONTH)+2, 10);;
        Date stateMentDate = statMntCal.getTime();

        String format = sdf.format(stateMentDate);
        System.out.println(format);*/

    }
}
