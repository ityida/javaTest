package cn.test2.time;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/7/16
 */
public class Test {
    public static void main(String[] args) {
        long time = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse("2018-12-0612:34:45", new ParsePosition(0)).getTime() / 1000;
        System.out.println(time);
    }
}
