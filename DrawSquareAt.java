package com.sd.point2D;
import ch.aplu.turtle.*;
import java.awt.geom.*;

class DrawSquareAt {
   Turtle t1 = new Turtle();
   Point2D.Double p = new Point2D.Double(100,100);
   void drawSquareAt(int size){
      t1.setPos(p);

      for(int i=0; i<4; i++) {
         t1.forward(size);
         t1.right(90);
      }
   }
   public static void main(String[] args){
      DrawSquareAt d1 = new DrawSquareAt();
      d1.drawSquareAt(50);
   }
}