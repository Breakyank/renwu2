import java.util.Scanner;

/**
 * Created by Merci on 2017/3/23.
 */
public class renwu2 {
    public static int res(double result){
        System.out.println("请回答：");
        Scanner sc=new Scanner(System.in);
        double s1=sc.nextDouble();
        if (s1==result){
            System.out.println("答案正确");
            return 1;
        }
        else{
            System.out.println("回答错误");
            return 0;
        }
    }
    public static void main(String[] args){
        int jieguo1=0;int count=0;int result =0;int i;
        String jieguo = null;
        System.out.println("题目数量");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b[]=new int[a];
        for(i=0;i<a;i++) {
            int m = (int) (Math.random() * 20);
            int n = (int) (Math.random() * 20);
            int o = (int) (Math.random() * 3);
            {
                if(o==0){
                    jieguo1=m+n;
                    System.out.print(m+"+"+n+"=");
                    result=m+n;
                    if(res(result)==1){
                        count++;
                    }
                    else
                        break;

                }
                if(o==1){
                    jieguo1=m-n;
                    System.out.print(m+"-"+n+"=");
                    result=m-n;
                    if(res(result)==1){
                        count++;
                    }
                    else
                        break;

                }
                if(o==2){
                    jieguo1=m*n;
                    System.out.print(m+"*"+n+"=");
                    result=m*n;
                    if(res(result)==1){
                        count++;
                    }
                    else
                        break;

                }
                if(o==3){
                    jieguo1=m/n;
                    System.out.print(m+"/"+n+"=");
                    result=m/n;
                    if(res(result)==1){
                        count++;
                    }
                    else
                        break;

                }

                b[i]=jieguo1;
            }
            System.out.println(b[i]+"    ");
            System.out.println("做对"+count+"题,正确率为:"+count/a*100+"%");
        }
    }
}
