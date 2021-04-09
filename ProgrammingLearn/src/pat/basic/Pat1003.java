package pat.basic;

import java.util.Scanner;
public class Pat1003//PAT平台提交时需要把类名改为Main
{
    public static void main(String[] agrs)
    {
        Scanner in = new Scanner(System.in);//读取所有输入
        int n = in.nextInt();//读取输入的第一个数字，代表了后面输入的样例数
        in.nextLine();//清除数字后的回车键

        for(int i = 0; i < n; i++)//对每个样例都判断
        {
            String str = in.nextLine();//输入的样例字符串
            if(onlyPAT(str))//如果只含有PAT三种字符，则判断是否符合第2、3个条件
            {
                if(aPbTc(str))
                {
                    yes();//符合输出YES
                }
                else
                {
                    no();//不符合输出NO
                }
            }
            else//不止含有PAT三种字符，输出NO
            {
                no();
            }
        }
    }

    public static void yes()//输出YES
    {
        System.out.println("YES");
    }

    public static void no()//输出NO
    {
        System.out.println("NO");
    }

    public static boolean onlyPAT(String str)
    {//将字符串遍历一遍，有不是PAT字符的则返回false
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != 'P' && str.charAt(i) != 'A' && str.charAt(i) != 'T')
            {
                return false;
            }
        }
        return true;
    }

    public static boolean aPbTc(String str)
    {
        int a = str.indexOf("P");//aPbTc 字符串中，a的值，代表字符P前面的A个数
        int c = str.length() - str.indexOf("T") - 1;//aPbTc 字符串中，c的值，代表字符T后面A的个数
        int b = str.indexOf("T") - str.indexOf("P") - 1;//aPbTc 字符串中，b的值，代表P和T中间A的个数
        if((b == 0 ) || (a * b != c))//通过样例可知b不能为0
            return false;
        else
            return true;
    }
}
