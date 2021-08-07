public class Test3 {
    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;
        //i1 == i2? true or false
        System.out.println(i1 == i2);

        Integer i3 = 128;
        Integer i4 = 128;
        //i3 == i4? true or false
        System.out.println(i3 == i4);

        //解答
        /**
         * IntegerCache Integer的静态内部类
         * 其中有一个静态块会自动初始化
         *将-128~127中的数字存放到一个cache数组里
         *
         * 赋的值（100和128）先传给valueOf
         * 会判断是否大于127
         * <=127则直接返回一个Integer对象
         * >127则new一个新的Integer对象
         */
    }
}
