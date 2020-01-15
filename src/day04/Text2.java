package day04;

public class Text2 {
    public static void main(String[] args) {
        //第一题
        System.out.println("第一题：");
        int[] arr1 = {12, 33, 25, 6, 16};
        int min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (min > arr1[i]) {
                min = arr1[i];
            }
        }
        System.out.println("数组的最小值为" + min);
        System.out.println();

        //第二题
        System.out.println("第二题：");
        int[] arr2 = {11, 22, 33, 44, 55};
        System.out.println("arr2数组：");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println();

        //第三题
        System.out.println("第三题：");
        int[] nums = {5, 10, 15};
        System.out.println("老数组：");
        int[] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            newArr[i] = nums[i] * 2;
        }
        System.out.println();
        System.out.println("新数组：");
        for (int j = 0; j < newArr.length; j++) {
            System.out.print(newArr[j] + " ");
        }
        System.out.println();
        System.out.println();

        //第四题
        System.out.println("第四题：");
        int[] arr3 = {1, 8, 10, 12, 18, 28, 12};
        printBall(arr3);
        System.out.println();
        System.out.println();

        //第五题
        System.out.println("第五题：");
        int[] arr4 = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        int avg = getAvg(arr4);
        int count = 0;
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > avg) {
                count++;
            }
        }
        System.out.println("高于平均分的：" + avg + "的个数有" + count + "个");
        System.out.println();


        //第六题
        System.out.println("第六题：");
        int[] arr6 = {1, 2, 3, 4, 3, 2, 1};
        boolean flag = true;
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] == arr6[arr6.length - 1 - i]) {
                System.out.print(arr6[i] + " ");
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        System.out.println("是否对称：" + flag);
        System.out.println();

        //第七题
        System.out.println("第七题：");
        int[] arr7 = {1, 2, 3, 4, 3, 2, 1};
        int[] arr8 = {1, 2, 3, 4, 3, 2, 1};
        equals(arr7, arr8);
        System.out.println();

        //第八题
        System.out.println("第八题：");
        char[] arr9 = {'A', 'D', 'B', 'C', 'D'};
        char[] arr10 = {'D', 'C', 'B', 'A', 'D'};
        char[] arr11 = {'A', 'D', 'B', 'C', 'D'};
        char[] arr12 = {'A', 'D', 'B', 'C', 'A'};
        char[] arr13 = {'A', 'B', 'C', 'D', 'D'};
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < arr9.length; i++) {
            if (arr9[i] == arr10[i]) {
                sum1 += 2;
            }
            if (arr9[i] == arr11[i]) {
                sum2 += 2;
            }
            if (arr9[i] == arr12[i]) {
                sum3 += 2;
            }
            if (arr9[i] == arr13[i]) {
                sum4 += 2;
            }

        }
        System.out.println("满分10分，小明：得分：" + sum1 + "分");
        System.out.println("满分10分，小红：得分：" + sum2 + "分");
        System.out.println("满分10分，小黄：得分：" + sum3 + "分");
        System.out.println("满分10分，小强：得分：" + sum4 + "分");
        System.out.println();

        //第九题
        System.out.println("第九题：");
        String[] arr14 = {"黑桃", "红桃", "梅花", "方片"};
        String[] arr15 = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String str = " ";
        for (int i = 0; i < arr14.length; i++) {
            for (int j = 0; j < arr15.length; j++) {
                str = arr14[i] + arr15[j];
                System.out.print(str + " ");
            }
            System.out.println();
        }
        System.out.println();

        //第十题
        System.out.println("第十题：");
        int[] arr16 = {99, 100, 98, 97, 96};
        int max = arr16[0];
        int min2 = arr16[0];
        int sum6 = 0;
        for (int i = 0; i < arr16.length; i++) {
            if (max < arr16[i]) {
                max = arr16[i];
            }
            if (min2 > arr16[i]) {
                min2 = arr16[i];
            }
            sum6 += arr16[i];
        }
        int avg2 = (sum6 - max - min2) / (arr16.length - 2);
        System.out.println("最终的分：" + avg2);
        System.out.println();

    }

    //第四题
    public static void printBall(int[] array) {
        System.out.println("您的双色球号码为：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //第五题
    public static int getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        return avg;
    }

    //第七题
    public static void equals(int[] arr1, int[] arr2) {
        boolean flag = false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i] && arr1.length == arr2.length) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        System.out.println("是否完全一致：" + flag);
    }

}
