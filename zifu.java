package duotai;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 16:55 2020/12/6
 * @ Description：
 * @ Modified By：
 */
/**
 *1、编写程序完成如下功能：输出字符串“www.google.com”的长度，并分别计算并显示出‘o’ 与‘g’的个数
 * ，截取其中“google”进行输出显示。
 * 2、编写程序，尝试用“==”与equals()方法比较“Hello java”与“Hello java”是否相等。
 * 3、分别使用String和StringBuffer类实现字符串的链接，分析比较它们的特点。
 *
*/

public class zifu {


    public static void main(String[] args) {
        String str=new String("www.goole.com");
        System.out.println(str.length());
        String str1=str.substring(4,9);
        System.out.println(str1);

        String str2=new String("Hello java");
        String str3=new String("Hello java");
        if(str2==str3){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
        if(str2.equals(str3)){
            System.out.println("是相等");
        }else{
            System.out.println("是不相等");
        }

        String str4=new String("cyd");
        System.out.println(str4+" is the best !");

        StringBuffer s=new StringBuffer("cyd");
        System.out.println(s.append(" is the best !"));


    }

}
