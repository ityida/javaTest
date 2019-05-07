package cn.test.time;

import com.sun.deploy.util.StringUtils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/27
 */
public class TimeTest {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        long v = 1515427200000L;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s = sdf.format(v);
        System.out.println(s);

        long c = System.currentTimeMillis();
        System.out.println("c:"+c);
        System.out.println("v:"+v);
        System.out.println("===========");
        long t = (c-v) / (1000 * 60 * 60 * 24);
        System.out.println(t);

    }
}
