class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer> l=new ArrayList<>();
         int n = mountain.length;

        for(int i=0; i<n; i++){
            
            // if(i==0 && mountain[i]>mountain[i+1]){
            //     l.add(i);
            // }

            // else if(i==n-1 && mountain[i]>mountain[i-1]){
            //     l.add(i);
            // }

            if(i!=0 && i!=n-1 && mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
                l.add(i);
            }
        
    }
    return l;
    }

        
    }
