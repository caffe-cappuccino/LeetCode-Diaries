class Solution {
    static int inversionCount(int arr[]) {
        
        if(arr==null||arr.length<2) return 0;
        return sortAndCount(arr,0,arr.length-1);
        
    }
    public static int sortAndCount(int[] arr,int left,int right){
        int count=0;
        if(left<right){
            int mid=(left+right)/2;
            count+=sortAndCount(arr,left,mid);0
            
            count+=sortAndCount(arr,mid+1,right);
            count+=mergeAndCount(arr,left,mid,right);
        }
        return count;
    }
    public static int mergeAndCount(int[] arr,int left,int mid,int right){
        int[] first=Arrays.copyOfRange(arr,left,mid+1);
        int[] second=Arrays.copyOfRange(arr,mid+1,right+1);
        int i=0;
        int j=0;
        int k=left;
        int counti=0;
        while( i<first.length&&j<second.length){
            if(first[i]<=second[j]){
                arr[k]=first[i];
                i++;
            }else{
                arr[k]=second[j];
                j++;
                counti+=first.length-i;
            }
            k++;
        }
        while(i<first.length){
            arr[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            arr[k]=second[j];
            j++;
            k++;
        }
        return counti;
    }
}
