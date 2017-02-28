package xiaozhao;

import java.util.Scanner;

/**
 * n的阶乘末尾0的个数
 * 其实，从"那些数相乘可以得到10"这个角度，问题就变得比较的简单了。
 * 首先考虑，如果N的阶乘为K和10的M次方的乘积，那么N!末尾就有M的0。如果将N的阶乘分解后，那么
 * N的阶乘可以分解为： 2的X次方，3的Y次方，4的5次Z方，.....的成绩。由于10 = 2 * 5,所以M只能和X和Z有关，每一对2和5相乘就可以得到一个10，于是M = MIN(X,Z),不难看出X大于Z，因为被2整除的频率比被5整除的频率高的多。所以可以把公式简化为M=Z.   
 * 由上面的分析可以看出，只要计算处Z的值，就可以得到N!末尾0的个数
 * Created by nibnait on 2016/9/18.
 */
public class DD_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = 0;
        while (n!=0){
            ret += n/5;
            n /= 5;
        }
        System.out.println(ret);
    }
}
