package 복습230818;
// Arrays 로 배열 다루기

import java.util.Arrays;

public class Arrays_tmp {



    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] arr2D = {{11,12} , {21,22} };

        System.out.println(Arrays.toString(arr)); // 1차원 배열
        System.out.println(Arrays.deepToString(arr2D)); // 2차원 배열

        //String[] str2D = new String[]{"aaa" , "bbb"}; // true , eqauls 로 1차원 배열을 비교할때는 주소를 비교하지 않고 요소만 비교함
        //String[] str2D2 = new String[]{"aaa" , "bbb"};

        String[][] str2D = new String[][]{{"aaa" , "bbb"},{"AAA" , "BBB"}}; // false , 2차원 배열의각 요소는 1차원 배열의 주소를 담고 있어서 비교시에 가리키는 위치가 다르다고 판단 -> false
        String[][] str2D2 = new String[][]{{"aaa" , "bbb"},{"AAA" , "BBB"}}; // true , deepEquals 메서드로 1차원이든 2차원이든 요소만 비교를 하기때문에 true

        System.out.println(Arrays.equals(str2D,str2D2 ));
        System.out.println(Arrays.deepEquals(str2D,str2D2));



    }
}
