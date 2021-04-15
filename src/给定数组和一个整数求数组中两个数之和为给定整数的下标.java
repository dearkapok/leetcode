import java.util.HashMap;

public class 给定数组和一个整数求数组中两个数之和为给定整数的下标 {

    /**
     * 最常规的写法，两次for循环遍历，时间复杂度为O(n*n)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int nums[], int target){

        for(int i=0;i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    /**
     * 使用HashMap，hashMap的get方法如果只找key时间复杂度是O(1)，因为是根据key的hash值直接找到key所在位置，而不是去循环比较
     * 以空间换时间
     *
     *
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int nums[], int target){
        HashMap<Integer, Integer> hashMap = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(target -nums[i])){
                return new int[]{hashMap.get(target -nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args){
        int nums[] = new int[]{3,1,3,5,7,9};
        int target = 6;
        //int indexs[] = twoSum1(nums, target);
        int indexs[] = twoSum1(nums, target);
        for(int i=0;i<indexs.length;i++){
            System.out.println(indexs[i]);
        }
    }
}
