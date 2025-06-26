//package array_2(arr,d);
//    }
//    public static void rotateArray_1(int[] arr,int d){
//        int n = arr.length;
//
//        d %= n;
//
//        int[] temp = new int[n];
//
//        for (int i = 0; i < n - d; i++)
//            temp[i] = arr[d + i];
//
//        for (int i = 0; i < d; i++)
//            temp[n - d + i] = arr[i];
//
//        for (int i = 0; i < n; i++)
//            arr[i] = temp[i];
//        System.out.println("Result 1 :" +Arrays.toString(arr));
//    }
//    private static void rotateArray_2(int[] arr, int d) {
//        int n = arr.length;
//        d %= n;
//
//        revArray(arr,0,d-1);
//        revArray(arr,d,n-1);
//        revArray(arr,0,n-1);
//        System.out.println("Result 2 :" +Arrays.toString(arr));
//    }
//
//    private static void revArray(int[] arr, int i, int i1) {
//        int left =i , right = i1;
//        while(left<right){
//            int tmp = arr[right];
//            arr[right] = arr[left];
//            arr[left] = tmp;
//            left++;
//            right--;
//        }
//    }
//}
