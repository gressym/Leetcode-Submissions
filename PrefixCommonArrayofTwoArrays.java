public class PrefixCommonArrayofTwoArrays {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
         int n=A.length;
         int []ans=new int[n];
         for(int i=0;i<n;i++){
            int count=0;
             for(int k=0;k<=i;k++){
                int ele=A[k];
                int j=0;
                while(j<=i){
                    if(B[j]==ele){
                        count++;
                    }
                    j++;
             }
            }
           ans[i]=count;
         }

         return ans;
    }
    public static void main(String[] args) {
        int A[]={1,3,2,4};
        int B[]={3,1,2,4};
        int ans[]=findThePrefixCommonArray(A,B);
        for(int i=0;i<A.length;i++){
            System.out.print(ans[i]+" ");
        }
       
    }
}