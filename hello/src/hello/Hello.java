package hello;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collections; // ���� Collections��,��������
import javax.swing.JTable;
//idea�Ļ�����JTable�ҵ�TableModel�ӿڣ���һ�£���סalt+enter
//		ѡ��implement interface����ѡ��kcb�����������

public class Hello {// public�������Hello�����java�ļ�����ͬ

    public static int cjk(int a, int b) {// �Զ���static����,���ÿ���ֱ��cjk(a,b);������Ҫobject_name.cjk(a,b);
        return a * b;
    }

    public static void main(String[] args) {
        /************************** ������� ****************************************/
        Scanner in = new Scanner(System.in);// ����ɨ��
        String s;
//		final int num;//���峣��
        int num = 3;
//		s = in.nextLine();//����һ��what is this,sΪ"what is this"
//		s = in.next();//����һ��what is this,sΪ"what"
//		num = in.nextInt();//����int������

//		System.out.println("2+"+num+"="+2+num);//���"2+3=23\n"		
//		System.out.println("2+"+num+"="+(2+num));//���"2+3=5\n"
//		System.out.print("2+"+num+"="+(2+num));//���"2+3=5"
//		System.out.printf("%d",num);//��C����һ��
        /************************** if�ж� ****************************************/
        if (num > 1)
            System.out.println(">");
        else if (num < 1)
            System.out.println("<");
        else {
            System.out.println("=");
            System.out.println("");
        }
        /************************ ��·��֧ ******************************************/
        //
        switch (num) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("default");
        }
        /************************** ѭ�� ****************************************/
        // ѭ��1
        while (1 > 0) {
            break;
        }
        // ѭ��2
        do {
            System.out.println("");
        } while (1 == 0);
        // ѭ��3
        for (int i = 1; i >= 0; i--) {
            System.out.println("");
        }
        /************************** �������� ****************************************/
        boolean a = true;// �߼�����,����������
        boolean b = false;
        // System.out.println(!a); //a&&b,a||b
        /*************************** ���� ***************************************/
        int[] numbers = new int[3];// numbers[i]:i=0~2
        int[] scores = {1, 2};
        System.out.println(numbers.length + scores.length);
        int[] new_numbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
            new_numbers[i] = numbers[i];// #���鸳ֵ,ֻ��ѭ������ֱ����b=a
        for (int k : numbers)// for-eachѭ��,ֻ�������������ö��
            // ����numbers����Ԫ��,k��Ϊ����Ԫ��
            k = 2 * k;//
        int[][] two_numbers = new int[3][3];
        int[][] two_scores = {{1, 2, 3}, {4, 5, 6}};
        /*************************** Math ***************************************/
        int i = Math.abs(-12);
        double j = Math.round(12.45);
        j = Math.random();// j=0~1
        j = Math.pow(2, j);// 2**j
        /*************************** �ַ�(��) ***************************************/
        char c = 'a';// c++��Ϊ'b','A'-'a'=32,
        String d = "hello,world!";
        String e = "hello,china!";
//		c.equals(d);�Ƚϴ�С
//		d.compareTo(e);//�൱��d-e:d>eΪ��,d=eΪ0,d<eΪ��
//		d.compareToIgnoreCase(e);//�����ִ�Сд�ıȽ�
//		a.length;//�ַ�������
//		d.charAt(0)//���ص�һ���ַ�0,������d[0]
//		d.substring(3);�õ�λ��3��ĩβ��ȫ������
//		d.substring(0,3);//�õ���λ��0��λ��3��ȫ������(������3)
//		d.indexOf(c);//�õ��ַ�(��)c����λ��,-1��ʾ������
//		d.indexOf(c,3);//��λ��3��ʼѰ���ַ�(��)c����λ��,-1��ʾ������
//		d.startsWith("ok");//���ز���ֵ,d�Ƿ���"ok"��ͷ
//		d.endsWith("ok");//���ز���ֵ,d�Ƿ���"ok"��β
//		d.trim();//ȥ���ַ������ߵĿո�
//		d.replace(oldChar, newChar);//new�滻old
//		d.toLowerCase();//�ַ����������ַ����Сд
//		d.toUpperCase();//�ַ����������ַ���ɴ�д
        /*************************** ArrayList ***************************************/
        ArrayList<String> sites = new ArrayList<String>(); // ��ʼ��
        sites.add("Google");
        sites.add("Runoob");// ����Ԫ��
        sites.set(1, "Wiki"); // �޸�Ԫ��
        // sites.remove(1);//ɾ��Ԫ��
        System.out.println(sites);// ���
        sites.get(1);// ���ʵ�1��Ԫ��
        Collections.sort(sites); // ����
        int sites_size = sites.size();// �����С
        // ���忴csdn��java�ʼ�

        /*************************** HashSet ***************************************/
        HashSet<String> sss = new HashSet<String>(); // ��ʼ��
        // HashSet��ArrayList����һ��,������Ϊ�Ǽ���,�����ڲ����ӵĸ���������Զ�ȥ��.
        /*************************** HashMap ***************************************/
        // hash��
        HashMap<Integer, String> coinnames = new HashMap<Integer, String>();
        coinnames.put(1, "penny");// ����Ԫ��
        coinnames.put(10, "dime");
        coinnames.put(25, "quarter");
        coinnames.put(50, "half-dolar");
        System.out.println(coinnames);
        Collection tmp = coinnames.keySet();// ��ȡkeyת�����б�
        System.out.println(tmp);
        /***************************�쳣***************************************/
        try {
            numbers[999] = 10;
        } catch (ArrayIndexOutOfBoundsException error_first) {
            //��1���쳣����
            System.out.println("999 is too large!");
        } catch (BootstrapMethodError error_second) {
            //��2���쳣����
            System.out.println("999 is too large!");
        }
        finally{
            System.out.println("");//����try��catch���֮��,��󶼿϶�Ҫ��finnaly
        }
    }
}