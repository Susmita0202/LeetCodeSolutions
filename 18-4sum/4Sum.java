class Solution {
    public List<List<Integer>> fourSum(int[] arr, int tar) {
        List<List<Integer>>li=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int a=arr[i];
                int b=arr[j];
                long sum=(long)tar-((long)a+(long)b);
                int l=j+1,k=n-1;
                while(l<k){
                    int c=arr[l];
                    int d=arr[k];
                    long summ=c+d;
                    if(summ==sum){
                        List<Integer>temp=new ArrayList<>();
                        temp.add(a);temp.add(b);temp.add(c);temp.add(d);
                        li.add(temp);
                        while(l<k && arr[l]==arr[l+1])l++;
                        while(k>l && arr[k]==arr[k-1])k--;
                        l++;k--;
                    }
                    else if(summ<sum)l++;
                    else k--;
                }
                while(j<n-2 && arr[j]==arr[j+1])j++;
            }
            while(i<n-3 && arr[i]==arr[i+1])i++;
        }
        return li;
    }
}
