public class ImageSmoother {

        public int[][] imageSmoother(int[][] img) {
            int m=img.length;
            int n=img[0].length;
          
            int[][] res=new int[m][n];
            
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                      int total=0;
            int count=0;
                    for(int x=Math.max(i-1,0);x<Math.min(m,i+2);x++){
                         for(int y=Math.max(j-1,0);y<Math.min(n,j+2);y++){
                        total+=img[x][y];
                             count++;
                    }
                    }
                    res[i][j]=total/count;
                }
            }
            return res;
        }
    }

