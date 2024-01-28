import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = new int[]{2, 3, 4, 2, 4, 6, 10};
        System.out.println(removeDuplicates(nums1));

    }
    public static int removeDuplicates(int[] nums){
        int result = nums.length;
        HashSet<Integer> states = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!states.add(nums[i])){
                result--;
            }
        }
        return result;
    }
}