package com.shape.notification;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import vimalcvs.api.ShapeView;import vimalcvs.api.shapeImg;import android.graphics.Paint;import android.graphics.Canvas;import com.vimal.player.Ui;public class roundBtn extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(64f, 64f);			lineTo(0f, 64f);			lineTo(0f, 0f);			lineTo(64f, 0f);			lineTo(64f, 64f);	}}class Path1 extends Path{  	public Path1() {			moveTo(52f, 2f);			quadTo(62f, 2f, 62f, 12f);			lineTo(62f, 52f);			quadTo(62f, 62f, 52f, 62f);			lineTo(12f, 62f);			quadTo(2f, 62f, 2f, 52f);			lineTo(2f, 12f);			quadTo(2f, 2f, 12f, 2f);			lineTo(52f, 2f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0x0054497c); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0xFF352e4d); 		public Path1 S1 = new Path1();		public static float Ht = 64F; 		public static float Wh = 64F;  		public roundBtn(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0x0054497c);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0xFF352e4d);			P1.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final roundBtn viewImg = new roundBtn(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static roundBtn getShape(){		   final roundBtn viewImg = new roundBtn(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 