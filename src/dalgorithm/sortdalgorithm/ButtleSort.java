package dalgorithm.sortdalgorithm;

/**
 * @author TanChengQi
 * @date 2019-12-12 19:35
 * @description 冒泡算法
 */
public class ButtleSort {
    /**
     * 冒泡排序的实现
     */
    public static void buttleSort(){
        int[] arr = new int[]{93,68,42,57,59,23,45,68,102,33};
          int arrLength  = arr.length;
          int temp;//临时变量
           boolean isSort = true;// 是否已经是排序好的
          for(int i=0; i<arrLength-1;i++){
              for(int j=0;j<arrLength-i-1;j++){
                  if(arr[j]>arr[j+1]){
                      temp=arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
                      isSort=false;
                  }
              }
              if(isSort){
                  break;
              }
          }
          //遍历arry
        for (int i : arr) {
            System.out.print(i+"  ");
        }
    }

    public static void main(String[] args) {
        buttleSort();
    }
}
