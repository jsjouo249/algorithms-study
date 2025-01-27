package leetcode;

//1122 relative sort array

public class relativeSortArray {
    public static void main(String[] agrs) {
        relativeSortArray(new int[]{2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31}, new int[]{2,42,38,0,43,21});
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        int[] result = new int[arr1.length];
        int index = 0;

        //arr1의 갯수 세기
        for (int num: arr1) {
            count[num]++;
        }

        //arr2의 값 먼저 넣기
        for (int num: arr2) {
            while(count[num] > 0) {
                result[index] = num;
                count[num]--;
                index++;
            }
        }

        for (int i = 0; i < count.length; ++i) {
            while(count[i] > 0) {
                result[index] = i;
                count[i]--;
                index++;
            }
        }

        return result;
    }

    //기존 풀이
//    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        int[] result = new int[arr1.length];
//        ArrayList<Integer> ll = new ArrayList<>();
//        int index = 0;
//
//        for (int i = 0; i < arr1.length; ++i) {
//            hm.put(arr1[i], hm.getOrDefault(arr1[i], 0) + 1);
//        }
//
//        for (int i = 0; i < arr2.length; ++i) {
//            int num = hm.remove(arr2[i]);
//
//            for (int j = 0; j < num; ++j) {
//                result[index] = arr2[i];
//                index++;
//            }
//        }
//
//        for (int key : hm.keySet()) {
//            for (int i = 0; i < hm.get(key); ++i) {
//                ll.add(key);
//            }
//        }
//
//        Collections.sort(ll);
//
//        for (int i = 0; i < ll.size(); ++i) {
//            result[index] = ll.get(i);
//            index++;
//        }
//
//        for (int i = 0; i < result.length; ++i) {
//            System.out.println(result[i]);
//        }
//
//        return result;
//    }
}
