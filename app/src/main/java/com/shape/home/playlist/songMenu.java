package com.shape.home.playlist;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import vimalcvs.api.ShapeView;import vimalcvs.api.shapeImg;import android.graphics.Paint;import android.graphics.Canvas;import com.vimal.player.Ui;public class songMenu extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(30f, 44f);			lineTo(0f, 44f);			lineTo(0f, 0f);			lineTo(30f, 0f);			lineTo(30f, 44f);	}}class Path1 extends Path{  	public Path1() {			moveTo(30f, 42f);			lineTo(0f, 42f);			lineTo(0f, 0f);			lineTo(30f, 0f);			lineTo(30f, 42f);	}}class Path2 extends Path{  	public Path2() {			moveTo(9.65f, 13.3f);			lineTo(9.65f, 11.3f);			lineTo(20.4f, 11.3f);			lineTo(20.4f, 13.3f);			lineTo(9.65f, 13.3f);	}}class Path3 extends Path{  	public Path3() {			moveTo(7.65f, 19.1f);			lineTo(7.65f, 17.1f);			lineTo(22.4f, 17.1f);			lineTo(22.4f, 19.1f);			lineTo(7.65f, 19.1f);	}}class Path4 extends Path{  	public Path4() {			moveTo(9.65f, 24.9f);			lineTo(9.65f, 22.9f);			lineTo(20.4f, 22.9f);			lineTo(20.4f, 24.9f);			lineTo(9.65f, 24.9f);	}}class Path5 extends Path{  	public Path5() {			moveTo(9.65f, 30.75f);			lineTo(9.65f, 28.75f);			lineTo(20.4f, 28.75f);			lineTo(20.4f, 30.75f);			lineTo(9.65f, 30.75f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0xFF292440); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0xFF2d2846); 		public Path1 S1 = new Path1();		public Paint P2 = new Paint(); 		public static int Color2 = (0xb3d35d69); 		public Path2 S2 = new Path2();		public Paint P3 = new Paint(); 		public static int Color3 = (0xb3d35d69); 		public Path3 S3 = new Path3();		public Paint P4 = new Paint(); 		public static int Color4 = (0xb3d35d69); 		public Path4 S4 = new Path4();		public Paint P5 = new Paint(); 		public static int Color5 = (0xb3d35d69); 		public Path5 S5 = new Path5();		public static float Ht = 44F; 		public static float Wh = 30F;  		public songMenu(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0xFF292440);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0xFF2d2846);			P1.setAntiAlias(true);			S2.transform(matrix);			P2.setColor(0xb3d35d69);			P2.setAntiAlias(true);			S3.transform(matrix);			P3.setColor(0xb3d35d69);			P3.setAntiAlias(true);			S4.transform(matrix);			P4.setColor(0xb3d35d69);			P4.setAntiAlias(true);			S5.transform(matrix);			P5.setColor(0xb3d35d69);			P5.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);				canvas.drawPath(S2, P2);				canvas.drawPath(S3, P3);				canvas.drawPath(S4, P4);				canvas.drawPath(S5, P5);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);			 S4.transform(matrix);			 S5.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);			 S4.transform(matrix);			 S5.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);			 S4.transform(matrix);			 S5.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final songMenu viewImg = new songMenu(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static songMenu getShape(){		   final songMenu viewImg = new songMenu(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 