package pat.basic;

import java.util.Scanner;
public class Pat1003//PATƽ̨�ύʱ��Ҫ��������ΪMain
{
    public static void main(String[] agrs)
    {
        Scanner in = new Scanner(System.in);//��ȡ��������
        int n = in.nextInt();//��ȡ����ĵ�һ�����֣������˺��������������
        in.nextLine();//������ֺ�Ļس���

        for(int i = 0; i < n; i++)//��ÿ���������ж�
        {
            String str = in.nextLine();//����������ַ���
            if(onlyPAT(str))//���ֻ����PAT�����ַ������ж��Ƿ���ϵ�2��3������
            {
                if(aPbTc(str))
                {
                    yes();//�������YES
                }
                else
                {
                    no();//���������NO
                }
            }
            else//��ֹ����PAT�����ַ������NO
            {
                no();
            }
        }
    }

    public static void yes()//���YES
    {
        System.out.println("YES");
    }

    public static void no()//���NO
    {
        System.out.println("NO");
    }

    public static boolean onlyPAT(String str)
    {//���ַ�������һ�飬�в���PAT�ַ����򷵻�false
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
        int a = str.indexOf("P");//aPbTc �ַ����У�a��ֵ�������ַ�Pǰ���A����
        int c = str.length() - str.indexOf("T") - 1;//aPbTc �ַ����У�c��ֵ�������ַ�T����A�ĸ���
        int b = str.indexOf("T") - str.indexOf("P") - 1;//aPbTc �ַ����У�b��ֵ������P��T�м�A�ĸ���
        if((b == 0 ) || (a * b != c))//ͨ��������֪b����Ϊ0
            return false;
        else
            return true;
    }
}
