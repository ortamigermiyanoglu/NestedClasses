package MemberInnerClasses;
/*
 *  Can be declared public, private, or protected or use default access
 *  Can extend any class and implement interfaces
 *  Can be abstract or final
 *  Cannot declare static fields or methods *
 *  Can access members of the outer class including private members
 */

/*
 *   A member inner class declaration looks just like a stand‐alone class declaration except
 *   that it happens to be located inside another class—oh, and that it can use the instance variables
 *   declared in the outer class.
 */

public class Outer {
    private int i = 3;
    private String greeting = new String("merhabalar");

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();

        System.out.println("---------------------");

        //a way  to instantiate Inner
        Inner inner = new Outer().new Inner();
        inner.go();
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    protected class Inner {
        public void go() {
            while (i-- > 0) {
                System.out.println(greeting);
            }
        }
    }

    /*
     * Since a member inner class is not static, it has to be used with an instance of the outer
     * class.  An instance of the outer class can instantiate Inner normally. This
     * works because callInner() is an instance method on Outer. Both Inner and callInner()
     * are members of Outer. Since they are peers, they just write the name.
     */
}
