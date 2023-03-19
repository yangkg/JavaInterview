public class Outer {
    
    private String outerField = "OuterField";
    private static String outerStaticField = "OuterStaticField";

    public void outerMethod() {
        System.out.println("OuterMethod");
    }

    // 成员内部类
    public class MemberInnerClass {
        public void memberInnerMethod() {
            System.out.println(outerField);
            System.out.println("MemberInnerMethod");
            outerMethod();
        }
    }

    // 静态内部类
    public static class StaticInnerClass {
        public void staticInnerMethod() {
            System.out.println(outerStaticField);
            System.out.println("StaticInnerMethod");
        }
    }

    // 局部内部类
    public void localInnerClassMethod() {
        final String localVariable = "LocalVariable";
        class LocalInnerClass {
            public void localInnerMethod() {
                System.out.println(localVariable);
                System.out.println("LocalInnerMethod");
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.localInnerMethod();
    }

    // 匿名内部类
    public void anonymousInnerClassMethod() {
        Runnable anonymousInnerClass = new Runnable() {
            @Override
            public void run() {
                System.out.println("AnonymousInnerClass");
            }
        };
        anonymousInnerClass.run();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();

        // 成员内部类
        MemberInnerClass memberInnerClass = outer.new MemberInnerClass();
        memberInnerClass.memberInnerMethod();

        // 静态内部类
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        staticInnerClass.staticInnerMethod();

        // 局部内部类
        outer.localInnerClassMethod();

        // 匿名内部类
        outer.anonymousInnerClassMethod();
    }
}
