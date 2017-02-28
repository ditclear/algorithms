package nowcoder.AlgorithmPrototype;

/**
 * 子数组最大和（leetcode 53）
 * Created by nibnait on 2016/9/10.
 */
public class SubArrayMaxSum {

    public static void main(String[] args) {
        int[] arr = new int[]{3,-2,1,-6,4,3,-2,3};
        System.out.println(maxSum(arr));
    }

    /**
     * 求子数组最大和
     * @param arr
     * @return
     *
     *  cur和res
     */
    public static int maxSum(int[] arr) {
        if (arr==null || arr.length<=0){
            return 0;
        }

        int cur = arr[0];
        int res = cur;
        for (int i = 1; i < arr.length; i++) {
            cur += arr[i];
            res = Math.max(res, cur);
            cur = cur>0? cur:0;
        }
        return res;
    }
    
    /**
     * use rxjava
     * @param arr
     * @return
     */
    public Integer maxSumInRxJava(Integer[] arr) {
        if (arr == null) return 0;
        final Integer[] sum = {0};
        Observable.from(arr)
                .scan(new Func2<Integer, Integer, Integer>() {
                    @Override
                    public Integer call(Integer a, Integer b) {
                        sum[0] = Math.max(a + b, a);
                        return a + b > 0 ? a + b : 0;
                    }
                }).subscribe();
        return sum[0];
    }

}
