package com.shape.library.btm;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import vimalcvs.api.ShapeView;import vimalcvs.api.shapeImg;import android.graphics.Paint;import android.graphics.Canvas;import com.vimal.player.Ui;public class pauseBtn extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(13.55f, 0.45f);			quadTo(14f, 0.9f, 14f, 1.5f);			lineTo(14f, 23.45f);			lineTo(13.55f, 24.5f);			quadTo(13.1f, 24.95f, 12.5f, 24.95f);			lineTo(11.5f, 24.95f);			quadTo(10.9f, 24.95f, 10.45f, 24.5f);			quadTo(10f, 24.05f, 10f, 23.45f);			lineTo(10f, 1.5f);			quadTo(10f, 0.9f, 10.45f, 0.45f);			quadTo(10.9f, 0f, 11.5f, 0f);			lineTo(12.5f, 0f);			quadTo(13.1f, 0f, 13.55f, 0.45f);	}}class Path1 extends Path{  	public Path1() {			moveTo(3.55f, 0.45f);			quadTo(4f, 0.9f, 4f, 1.5f);			lineTo(4f, 23.45f);			lineTo(3.55f, 24.5f);			quadTo(3.1f, 24.95f, 2.5f, 24.95f);			lineTo(1.5f, 24.95f);			quadTo(0.9f, 24.95f, 0.45f, 24.5f);			quadTo(0f, 24.05f, 0f, 23.45f);			lineTo(0f, 1.5f);			quadTo(0f, 0.9f, 0.45f, 0.45f);			quadTo(0.9f, 0f, 1.5f, 0f);			lineTo(2.5f, 0f);			quadTo(3.1f, 0f, 3.55f, 0.45f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0xFFffffff); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0xFFffffff); 		public Path1 S1 = new Path1();		public static float Ht = 24.95F; 		public static float Wh = 14F;  		public pauseBtn(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0xFFffffff);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0xFFffffff);			P1.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final pauseBtn viewImg = new pauseBtn(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static pauseBtn getShape(){		   final pauseBtn viewImg = new pauseBtn(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 