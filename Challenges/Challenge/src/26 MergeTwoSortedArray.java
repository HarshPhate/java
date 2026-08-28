 class MergeTwoSortedArray {
    public static void main(String[] arg){
        int[] farr = arrayutility.inputarray();
        int[] sarr = arrayutility.inputarray();

        int[] f = sorted(farr);
        int[] s = sorted(sarr);
        System.out.print("first sored array :");

        arrayutility.displayarr(f);
        System.out.println();

        System.out.print( "Second sored array :");

        arrayutility.displayarr(s);
        System.out.println();
     int[] merge = merge(f,s);
        System.out.print( "merge sored array :");

        arrayutility.displayarr(merge);

    }

    public static int[] sorted(int[] arr){
        int i,j;
        int n = arr.length-1;
        for( i = 0; i<n; i++){
            for( j= 0; j<n-i; j++){
                if(arr[j] >  arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }


    public  static int[] merge(int[] a, int[] b){
        int newsize = a.length + b.length;
        int[] newarr = new int[newsize];
        int i=0, j=0, k=0;

        while(i < a.length && j<  b.length){
            if(a[i] < b[j]){
                newarr[k] = a[i];
                k++;
                i++;
            }else{
                newarr[k] = b[j];
                k++;
                j++;
            }

            while(i < a.length){
                newarr[k++] = a[i++];
            }

            while(j < b.length){
                newarr[k++] = b[j++];
            }
        }
        return newarr;
    }
}
