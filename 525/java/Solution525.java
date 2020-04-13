import java.util.HashMap;

public class Solution525 {
	public static void main(String[] args) {
		System.out.println(findMaxLength(new int[]{0,0,1,0,0,0,1,1}));
	}

	public static int findMaxLength(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>(nums.length);
		map.put(0, -1);
		int max = 0, sum = 0;
		for (var x = 0; x < nums.length; x++) {
			sum += nums[x] == 0 ? -1 : 1;
			if (map.containsKey(sum)) {
				max = Math.max(max, x - map.get(sum));
			} else {
				map.put(sum, x);
			}
		}

		return max;
	}
}