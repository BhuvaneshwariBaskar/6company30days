public class circleRect {

        public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
            if(sqroot(xCenter,yCenter,x1,y1)<=radius*radius)return true;
            if(sqroot(xCenter,yCenter,x2,y2)<=radius*radius)return true;
            if(sqroot(xCenter,yCenter,x1,y2)<=radius*radius)return true;
            if(sqroot(xCenter,yCenter,x2,y1)<=radius*radius)return true;
    
            if(xCenter>=x1-radius && xCenter<=x2+radius && yCenter>= y1&& yCenter<=y2)return true;
            if(xCenter>=x1 && xCenter<=x2 && yCenter>= y1-radius && yCenter<=y2+radius)return true;
    
    
            return false;
            
        }
        public int sqroot(int x1, int y1, int x2, int y2){
            return (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
        }
    }
