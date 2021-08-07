public class Test2 {

    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        //s1 == s2? true or false
        System.out.println(s1 == s2);

        String s3 = s1.intern();
        //s2 == s3? true or false
        System.out.println(s2 == s3);

        //解答
        /**
         * intern()这个方法会首先检查字符串池中是否有”ab”这个字符串，
         * 如果存在则返回这个字符串的引用，
         * 否则就将这个字符串添加到字符串池中，
         * 然会返回这个字符串的引用。
         *
         *    栈        堆       字符串常量池
         *    s1 ->  string   ->   abc
         *    s2--------------->   abc
         *    s3--------------->   abc
         *
         */

    }
}
