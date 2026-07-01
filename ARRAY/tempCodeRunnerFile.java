for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                for(int j=0;j<arr.length;j++){
                    if(arr[j]>smax){
                        smax=arr[j];
                    }
                }
            }
        }