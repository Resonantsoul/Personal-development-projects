package cn.project;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class repeat {

    static int score;
    //分数
    static int number = 1;
    //题目序号
    static int digit1;
    static int digit2;
    static int digit3;
    static int digit4;
    static int digit5;
    static int digit6;
    //digit用于计算题目的值

    public static void method() {
        String[] scs7 = {"加减运算", "乘除运算"};
        //创建一个String类型的数组来存放关键字

        System.out.println("请选择加减运算练习或乘除运算练习（请输入加减运算或乘除运算以选择）（除法运算取商即可）");
        Scanner sc3 = new Scanner(System.in);
        String scs10 = sc3.next();
        //获取用户输入并赋值以选择运算模式

        String[] scs1 = {"一位数", "二位数", "三位数"};
        //创建一个String类型的数组来存放关键字

        System.out.println("请选择要进行几位数的计算练习(请输入一位数，二位数或三位数进行运算) ");
        Scanner sc = new Scanner(System.in);
        String scs = sc.next();
        //获取用户输入并赋值以选择几位数

        String[] scs3 = {"是","否"};
        //创建一个String类型的数组来存放关键字

        System.out.println("是否开始？");
        //制定开始指令

        Scanner sc1 = new Scanner(System.in);
        String scs2 = sc1.next();
        //获取用户输入并赋值以开始

        Calendar calendar = Calendar.getInstance();
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        //开始时获取开始时间

        if (scs2.equals(scs3[1])) {
            method();
        }
        //判断是否执行开始命令

        int[] arg1 = new int[10];
        //创建数组，后面用来生成随机数

        if (scs2.equals(scs3[0])) {
            //通过equals对比数组元素得到开始指令
            for (int j =1; j <=10;j++) {
                //开始生成随机数
                int x = 1;
                //用来标示数字序号
                System.out.println("数组：");
                for (int i = 0; i < arg1.length; i++) {
                    Random rand1 = new Random();
                    if (scs.equals(scs1[0])) {
                        int b = rand1.nextInt(9) + 1;
                        //控制生成的随机数为一位数
                        arg1[i] = b;
                        System.out.print("第"+x+"个数："+arg1[i] + "， ");
                        x++;
                        //生成一位数数组
                    } else if (scs.equals(scs1[1])) {
                        int b = rand1.nextInt(80) + 10;
                        //控制生成的随机数为二位数
                        arg1[i] = b;
                        System.out.print("第"+x+"个数： "+arg1[i] + "， ");
                        x++;
                        //生成二位数数组
                    } else if (scs.equals(scs1[2])) {
                        int b = rand1.nextInt(900) + 100;
                        //控制生成的随机数为三位数
                        arg1[i] = b;
                        System.out.print("第"+x+"个数："+arg1[i] + "， ");
                        x++;
                        //生成三位数数组
                    }
                }
                //最终得到十个随机数数组

                System.out.println();
                //空一行

                //开始获取判断运算模式的指令
                if (scs10.equals(scs7[0])) {
                    //通过equals对比数组元素得到使用加减运算模式指令
                    String scs4[] = {"+", "-"};
                    //创建一个String类型的数组来存放关键字
                    String scs5[] = {"一", "二", "三", "四", "五", "六", "七", "八", "九", "十"};
                    //创建一个String类型的数组来存放关键字
                    Random rand2 = new Random();
                    Random rand3 = new Random();
                    Random rand4 = new Random();
                    int a1 = rand2.nextInt(2);
                    int a2 = rand3.nextInt(2);
                    int a3 = rand4.nextInt(2);
                    //生成三个随机数并赋值
                    Random rand6 = new Random();
                    Random rand7 = new Random();
                    Random rand8 = new Random();
                    Random rand9 = new Random();
                    int a5 = rand6.nextInt(10);
                    int a6 = rand7.nextInt(10);
                    int a7 = rand8.nextInt(10);
                    int a8 = rand9.nextInt(10);
                    //生成四个随机数并赋值
                    System.out.println("第" + number + "题：" + "请问第" + scs5[a5] + "个数" + scs4[a1] + "第" + scs5[a6] + "个数" +
                            scs4[a2] + "第" + scs5[a7] + "个数" + scs4[a3] + "第" + scs5[a8] + "个数等于？");
                    //通过随机数生成随机题目，运算符随机，数字随机

                    //开始计算随机题目的计算值
                    if (scs4[a1] == scs4[0]) {
                        digit1 = arg1[a5] + arg1[a6];
                    } else {
                        digit1 = arg1[a5] - arg1[a6];
                    }

                    if (scs4[a2] == scs4[0]) {
                        digit2 = digit1 + arg1[a7];
                    } else {
                        digit2 = digit1 - arg1[a7];
                    }

                    if (scs4[a3] == scs4[0]) {
                        digit3 = digit2 + arg1[a8];
                    } else {
                        digit3 = digit2 - arg1[a8];
                    }
                    //实现从左到右运算，得出一个值用来检验用户运算是否正确

                    System.out.println("请输入你的答案：");
                    Scanner sc2 = new Scanner(System.in);
                    int date = sc2.nextInt();
                    //获取用户的答案

                    //开始检测用户输入答案与题目计算值是否相等
                    if (date == digit3) {
                        System.out.println("恭喜你回答正确！");
                        score++;
                        //相等则正确，分数加一
                    } else {
                        System.out.println("很遗憾，回答错误！");
                        //反之不相等则错误，分数不变
                    }
                    System.out.println("目前得分：" + score);
                    //检测回答情况，进行计分
                    System.out.println();
                    //空一行

                } else {
                    //反之则进行乘除运算
                    String scs8[] = {"*", "/"};
                    //创建一个String类型的数组来存放关键字
                    String scs9[] = {"一", "二", "三", "四", "五", "六", "七", "八", "九", "十"};
                    //创建一个String类型的数组来存放关键字
                    Random rand10 = new Random();
                    Random rand11 = new Random();
                    Random rand12 = new Random();
                    int a9 = rand10.nextInt(2);
                    int a10 = rand11.nextInt(2);
                    int a11 = rand12.nextInt(2);
                    //生成三个随机数并赋值
                    Random rand13 = new Random();
                    Random rand14 = new Random();
                    Random rand15 = new Random();
                    Random rand16 = new Random();
                    int a12 = rand13.nextInt(10);
                    int a13 = rand14.nextInt(10);
                    int a14 = rand15.nextInt(10);
                    int a15 = rand16.nextInt(10);
                    //生成四个随机数并赋值
                    System.out.println("第" + number + "题：" + "请问第" + scs9[a12] + "个数" + scs8[a9] + "第" + scs9[a13] + "个数" +
                            scs8[a10] + "第" + scs9[a14] + "个数" + scs8[a11] + "第" + scs9[a15] + "个数等于？");
                    //通过随机数生成随机题目，运算符随机，数字随机

                    //开始检测用户输入答案与题目计算值是否相等
                    if (scs8[a9] == scs8[0]) {
                        digit4 = arg1[a12] * arg1[a13];
                    } else {
                        digit4 = arg1[a12] / arg1[a13];
                    }

                    if (scs8[a10] == scs8[0]) {
                        digit5 = digit4 * arg1[a14];
                    } else {
                        digit5 = digit4 / arg1[a14];
                    }

                    if (scs8[a11] == scs8[0]) {
                        digit6 = digit5 * arg1[a15];
                    } else {
                        digit6 = digit5 / arg1[a15];
                    }
                    //实现从左到右运算，得出一个值用来检验用户运算是否正确

                    System.out.println("请输入你的答案：");
                    Scanner sc2 = new Scanner(System.in);
                    int date = sc2.nextInt();
                    //获取用户的答案

                    //开始检测用户输入答案与题目计算值是否相等
                    if (date == digit6) {
                        System.out.println("恭喜你，回答正确！");
                        score++;
                        //相等则正确，分数加一
                    } else {
                        System.out.println("很遗憾，回答错误！");
                        //反之不相等则错误，分数不变
                    }
                    System.out.println("得分：" + score);
                    //检测回答情况，进行计分
                    System.out.println();
                    //空一行
                }
                number++;
                //题目序号增加

            }
            System.out.println("本次练习总分："+ score);
            Calendar calendar1 = Calendar.getInstance();
            int minute1 = calendar1.get(Calendar.MINUTE);
            int second1 = calendar1.get(Calendar.SECOND);
            //获取结束时间并赋值
            int minute2 = minute1 - minute;
            int second2 = second1 - second;
            //开始时间减去结束时间等于通过时间
            System.out.println("本次练习用时："+ minute2+"分"+second2+"秒");
            //输出时长
            System.out.println("是否再次进行练习");
            String [] scs11 = {"是","否"};
            //创建一个String类型的数组来存放关键字
            Scanner sc4 = new Scanner(System.in);
            String scs12 = sc4.next();
            //获取用户输入并赋值以选择是否重新开始练习
            if (scs12.equals(scs11[0])) {
                //用户选择是时
                number = 1;
                //重新开始题目序号为一
                System.out.println();
                //空一行
                method1();
                //调用method1方法再次练习
            }else {
                System.out.println("感谢使用！");
                //用户选择否时，结束
            }
        }
    }

    public static void method1() {
        System.out.println("加减乘除计算练习器");
        System.out.println("规则：1.系统会随机生成相应的十个数字的数组，随后生成一道题目，玩家需要准确的的找到相应数字并计算出准确的答案");
        System.out.println("     " + "2.每答对一题记一分，一共十题");
        //制定游戏规则

        String[] scs7 = {"加减运算", "乘除运算"};
        //创建一个String类型的数组来存放关键字

        System.out.println("请选择加减运算练习或乘除运算练习（请输入加减运算或乘除运算以选择）（除法运算取商即可）");
        Scanner sc3 = new Scanner(System.in);
        String scs10 = sc3.next();
        //获取用户输入并赋值以选择运算模式

        String[] scs1 = {"一位数", "二位数", "三位数"};
        //创建一个String类型的数组来存放关键字

        System.out.println("请选择要进行几位数的计算练习(请输入一位数，二位数或三位数进行运算) ");
        Scanner sc = new Scanner(System.in);
        String scs = sc.next();
        //获取用户输入并赋值以选择几位数

        String[] scs3 = {"是","否"};
        //创建一个String类型的数组来存放关键字

        System.out.println("是否开始？");
        //制定开始指令

        Scanner sc1 = new Scanner(System.in);
        String scs2 = sc1.next();
        //获取用户输入并赋值以开始

        Calendar calendar = Calendar.getInstance();
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        //开始时获取开始时间

        if (scs2.equals(scs3[1])) {
            method();
        }
        //判断是否执行开始命令

        int[] arg1 = new int[10];
        //创建数组，后面用来生成随机数

        if (scs2.equals(scs3[0])) {
            //通过equals对比数组元素得到开始指令
            for (int j =1; j <=10;j++) {
                //开始生成随机数
                int x = 1;
                //用来标示数字序号
                System.out.println("数组：");
                for (int i = 0; i < arg1.length; i++) {
                    Random rand1 = new Random();
                    if (scs.equals(scs1[0])) {
                        int b = rand1.nextInt(9) + 1;
                        //控制生成的随机数为一位数
                        arg1[i] = b;
                        System.out.print("第"+x+"个数："+arg1[i] + "， ");
                        x++;
                        //生成一位数数组
                    } else if (scs.equals(scs1[1])) {
                        int b = rand1.nextInt(80) + 10;
                        //控制生成的随机数为二位数
                        arg1[i] = b;
                        System.out.print("第"+x+"个数： "+arg1[i] + "， ");
                        x++;
                        //生成二位数数组
                    } else if (scs.equals(scs1[2])) {
                        int b = rand1.nextInt(900) + 100;
                        //控制生成的随机数为三位数
                        arg1[i] = b;
                        System.out.print("第"+x+"个数："+arg1[i] + "， ");
                        x++;
                        //生成三位数数组
                    }
                }
                //最终得到十个随机数数组

                System.out.println();
                //空一行

                //开始获取判断运算模式的指令
                if (scs10.equals(scs7[0])) {
                    //通过equals对比数组元素得到使用加减运算模式指令
                    String scs4[] = {"+", "-"};
                    //创建一个String类型的数组来存放关键字
                    String scs5[] = {"一", "二", "三", "四", "五", "六", "七", "八", "九", "十"};
                    //创建一个String类型的数组来存放关键字
                    Random rand2 = new Random();
                    Random rand3 = new Random();
                    Random rand4 = new Random();
                    int a1 = rand2.nextInt(2);
                    int a2 = rand3.nextInt(2);
                    int a3 = rand4.nextInt(2);
                    //生成三个随机数并赋值
                    Random rand6 = new Random();
                    Random rand7 = new Random();
                    Random rand8 = new Random();
                    Random rand9 = new Random();
                    int a5 = rand6.nextInt(10);
                    int a6 = rand7.nextInt(10);
                    int a7 = rand8.nextInt(10);
                    int a8 = rand9.nextInt(10);
                    //生成四个随机数并赋值
                    System.out.println("第" + number + "题：" + "请问第" + scs5[a5] + "个数" + scs4[a1] + "第" + scs5[a6] + "个数" +
                            scs4[a2] + "第" + scs5[a7] + "个数" + scs4[a3] + "第" + scs5[a8] + "个数等于？");
                    //通过随机数生成随机题目，运算符随机，数字随机

                    //开始计算随机题目的计算值
                    if (scs4[a1] == scs4[0]) {
                        digit1 = arg1[a5] + arg1[a6];
                    } else {
                        digit1 = arg1[a5] - arg1[a6];
                    }

                    if (scs4[a2] == scs4[0]) {
                        digit2 = digit1 + arg1[a7];
                    } else {
                        digit2 = digit1 - arg1[a7];
                    }

                    if (scs4[a3] == scs4[0]) {
                        digit3 = digit2 + arg1[a8];
                    } else {
                        digit3 = digit2 - arg1[a8];
                    }
                    //实现从左到右运算，得出一个值用来检验用户运算是否正确

                    System.out.println("请输入你的答案：");
                    Scanner sc2 = new Scanner(System.in);
                    int date = sc2.nextInt();
                    //获取用户的答案

                    //开始检测用户输入答案与题目计算值是否相等
                    if (date == digit3) {
                        System.out.println("恭喜你，回答正确！");
                        score++;
                        //相等则正确，分数加一
                    } else {
                        System.out.println("很遗憾，回答错误！");
                        //反之不相等则错误，分数不变
                    }
                    System.out.println("目前得分：" + score);
                    //检测回答情况，进行计分
                    System.out.println();
                    //空一行

                } else {
                    //反之则进行乘除运算
                    String scs8[] = {"*", "/"};
                    //创建一个String类型的数组来存放关键字
                    String scs9[] = {"一", "二", "三", "四", "五", "六", "七", "八", "九", "十"};
                    //创建一个String类型的数组来存放关键字
                    Random rand10 = new Random();
                    Random rand11 = new Random();
                    Random rand12 = new Random();
                    int a9 = rand10.nextInt(2);
                    int a10 = rand11.nextInt(2);
                    int a11 = rand12.nextInt(2);
                    //生成三个随机数并赋值
                    Random rand13 = new Random();
                    Random rand14 = new Random();
                    Random rand15 = new Random();
                    Random rand16 = new Random();
                    int a12 = rand13.nextInt(10);
                    int a13 = rand14.nextInt(10);
                    int a14 = rand15.nextInt(10);
                    int a15 = rand16.nextInt(10);
                    //生成四个随机数并赋值
                    System.out.println("第" + number + "题：" + "请问第" + scs9[a12] + "个数" + scs8[a9] + "第" + scs9[a13] + "个数" +
                            scs8[a10] + "第" + scs9[a14] + "个数" + scs8[a11] + "第" + scs9[a15] + "个数等于？");
                    //通过随机数生成随机题目，运算符随机，数字随机

                    //开始检测用户输入答案与题目计算值是否相等
                    if (scs8[a9] == scs8[0]) {
                        digit4 = arg1[a12] * arg1[a13];
                    } else {
                        digit4 = arg1[a12] / arg1[a13];
                    }

                    if (scs8[a10] == scs8[0]) {
                        digit5 = digit4 * arg1[a14];
                    } else {
                        digit5 = digit4 / arg1[a14];
                    }

                    if (scs8[a11] == scs8[0]) {
                        digit6 = digit5 * arg1[a15];
                    } else {
                        digit6 = digit5 / arg1[a15];
                    }
                    //实现从左到右运算，得出一个值用来检验用户运算是否正确

                    System.out.println("请输入你的答案：");
                    Scanner sc2 = new Scanner(System.in);
                    int date = sc2.nextInt();
                    //获取用户的答案

                    //开始检测用户输入答案与题目计算值是否相等
                    if (date == digit6) {
                        System.out.println("恭喜你回答正确！");
                        score++;
                        //相等则正确，分数加一
                    } else {
                        System.out.println("很遗憾，回答错误！");
                        //反之不相等则错误，分数不变
                    }
                    System.out.println("得分：" + score);
                    //检测回答情况，进行计分
                    System.out.println();
                    //空一行
                }
                number++;
                //题目序号增加

            }
            System.out.println("本次练习总分："+ score);

            Calendar calendar1 = Calendar.getInstance();
            int minute1 = calendar1.get(Calendar.MINUTE);
            int second1 = calendar1.get(Calendar.SECOND);
            //获取结束时间并赋值

            int minute2 = minute1 - minute;
            int second2 = second1 - second;
            //开始时间减去结束时间等于通过时间
            System.out.println("本次练习用时："+ minute2+"分"+second2+"秒");
            //输出时长

            System.out.println("是否再次进行练习");
            String [] scs11 = {"是","否"};
            //创建一个String类型的数组来存放关键字
            Scanner sc4 = new Scanner(System.in);
            String scs12 = sc4.next();
            //获取用户输入并赋值以选择是否重新开始练习
            if (scs12.equals(scs11[0])) {
                //用户选择是时
                number = 1;
                //重新开始题目序号为一
                System.out.println();
                //空一行
                method1();
                //调用method1方法再次练习
            }else {
                System.out.println("感谢使用！");
                //用户选择否时，结束
            }
        }
    }
}
