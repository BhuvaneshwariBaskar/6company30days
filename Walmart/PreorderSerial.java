public class PreorderSerial {

        public boolean isValidSerialization(String preorder) {
            int v=1;
            String[] arr=preorder.split(",");
            for(int i=0;i<arr.length;i++){
                if(--v<0)return false;
                if(!arr[i].equals("#"))v+=2;
            }
            return v==0;
        }
    }

