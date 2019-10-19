public class Exercise1 {
    //这篇我就继续写关于 String的用法
    //public int indexOf(String str,int fromIndex)----从指定位置开始查找字符串位置
    //public int lastIndexOf(String str)-----从后向前开始查找字符串位置
    //public boolean startsWith(String prefix)----判断是否以指定字符串开头
    //public boolean  startsWith(String prefix,int toffset)--从指定位置开始判断是否以指定字符串开头
    //public boolean endsWith(String suffix)-----判断是否以指定字符串结尾
    //contains()是最好用的
    //indexOf()只能返回查找的第一个位置
    // 4.字符串替换
    //public String replaceAll(String regex,String replaceAll)----替换所有指定内容‘
    //public String replaceFirst(String regex,String replaceAll)----------替换首个内容
    //字符串拆分
    //public String []split(String regex(按什么分开)) ------将字符串全部拆
    //public String
    /*
eg:    public static void main(String[] args) {
             String str = "name=zhangsan&age=18" ;
        String[] result = str.split("&") ;
        for (int i = 0; i < result.length; i++) {
            String[] temp = result[i].split("=") ;
            System.out.println(temp[0]+" = "+temp[1]);
        }
    }
     */
//字符串截取
    //public String substring(int beginIndex)------从指定位置开始截取到结尾
    //public String  substring(int beginIndex,int endIndex)--部分截取
    // 注意前闭后开区间的写法, substring(0, 5) 表示包含 0 号下标的字符, 不包含 5 号下标

    //其他操作
    /*
    public String trim()--------去掉字符串中的左右空格，保留中间空格
    public  String toUpperCase()----字符串转大写
    public String toLowerCase(0-------字符串转小写
    public boolean isEmpty()-------判断字符串是否长度为0
     */




















}
