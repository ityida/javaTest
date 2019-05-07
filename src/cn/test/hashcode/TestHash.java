package cn.test.hashcode;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2019/1/9
 */
public class TestHash {
    public static void main(String[] args) {
        Integer i = 100;
        int i1 = i.hashCode();
        String s = "hello";
        System.out.println("hashcode:"+i1);

        System.out.println("s:"+s.hashCode());
        System.out.println(s.hashCode() + 1);
    }
}
