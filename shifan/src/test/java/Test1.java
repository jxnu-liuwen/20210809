import java.lang.reflect.Field;

public class Test1 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = new String("abc");
        //在这中间可以添加N行代码，但必须保证s引用的指向不变，最终将输出变成abcd

        //解答，利用反射
        //得到s的所有字段
        Field value = s.getClass().getDeclaredField("value");
        //更改权限，否则在调用的时候进行访问安全检查，会抛出IllegalAccessException异常
        value.setAccessible(true);
        //转成字符数组后替换"abc"
        value.set(s, "abcd".toCharArray());
        //解答结束

        System.out.println(s);
    }
}
