package Day14.a02packagesdemo02.demo01;

import Day14.a02packagesdemo02.domain1.Teacher;

public class Test {
    public static void main(String[] args) {
        // 使用同一个包类时，不需要导包
        Stundent s = new Stundent();
        s.setName("张三");
        s.setAge(23);
        System.out.println(s.getAge() + s.getName());

        // 使用java.lang包中的类时，不需要导包
        String str = "abc";
        System.out.println(str);

        // 其他情况都需要导包
        Teacher t = new Teacher();
        t.setName("XXX");
        System.out.println(t.getName());

        // 如果同时使用两个包中的同名类，需要用全类名
    //     Day14.a02packagesdemo02.domain1.Teacher t1 = new Day14.a02packagesdemo02.domain1.Teacher();
    //     Day14.a02packagesdemo02.domain2.Teacher t2 = new Day14.a02packagesdemo02.domain2.Teacher();
    // }
}
}