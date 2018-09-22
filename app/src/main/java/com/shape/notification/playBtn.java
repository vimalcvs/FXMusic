package com.shape.notification;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import vimalcvs.api.ShapeView;import vimalcvs.api.shapeImg;import android.graphics.Paint;import android.graphics.Canvas;import com.vimal.player.Ui;public class playBtn extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(64f, 64f);			lineTo(0f, 64f);			lineTo(0f, 0f);			lineTo(64f, 0f);			lineTo(64f, 64f);	}}class Path1 extends Path{  	public Path1() {			moveTo(56f, 0f);			quadTo(64f, 0f, 64f, 8f);			lineTo(64f, 56f);			quadTo(64f, 64f, 56f, 64f);			lineTo(8f, 64f);			quadTo(0f, 64f, 0f, 56f);			lineTo(0f, 8f);			quadTo(0f, 0f, 8f, 0f);			lineTo(56f, 0f);			moveTo(56f, 2f);			lineTo(8f, 2f);			quadTo(2f, 2f, 2f, 8f);			lineTo(2f, 56f);			quadTo(2f, 62f, 8f, 62f);			lineTo(56f, 62f);			quadTo(62f, 62f, 62f, 56f);			lineTo(62f, 8f);			quadTo(62f, 2f, 56f, 2f);	}}class Path2 extends Path{  	public Path2() {			moveTo(40.8f, 35.35f);			lineTo(28.4f, 47.65f);			quadTo(27.6f, 48.65f, 26.25f, 48.65f);			quadTo(24.85f, 48.65f, 23.85f, 47.65f);			quadTo(22.95f, 46.8f, 22.9f, 45.6f);			lineTo(22.9f, 18.2f);			lineTo(22.95f, 18.2f);			quadTo(23.05f, 17.2f, 23.85f, 16.3f);			quadTo(24.85f, 15.35f, 26.25f, 15.35f);			quadTo(27.6f, 15.35f, 28.4f, 16.3f);			lineTo(40.8f, 28.3f);			quadTo(45f, 31.9f, 40.8f, 35.35f);	}}class Path3 extends Path{  	public Path3() {			moveTo(38f, 34.3f);			lineTo(29.3f, 42.95f);			quadTo(28.75f, 43.65f, 27.8f, 43.65f);			quadTo(26.8f, 43.65f, 26.1f, 42.95f);			quadTo(25.5f, 42.3f, 25.45f, 41.5f);			lineTo(25.45f, 22.3f);			lineTo(25.5f, 22.3f);			quadTo(25.55f, 21.6f, 26.1f, 21f);			quadTo(26.8f, 20.35f, 27.8f, 20.35f);			quadTo(28.75f, 20.35f, 29.3f, 21f);			lineTo(38f, 29.4f);			quadTo(40.95f, 31.9f, 38f, 34.3f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0x0054497c); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0xFF000000); 		public Path1 S1 = new Path1();		public Paint P2 = new Paint(); 		public static int Color2 = (0x7fffffff); 		public Path2 S2 = new Path2();		public Paint P3 = new Paint(); 		public static int Color3 = (0xFF000000); 		public Path3 S3 = new Path3();		public static float Ht = 64F; 		public static float Wh = 64F;  		public playBtn(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0x0054497c);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0xFF000000);			P1.setAntiAlias(true);			S2.transform(matrix);			P2.setColor(0x7fffffff);			P2.setAntiAlias(true);			S3.transform(matrix);			P3.setColor(0xFF000000);			P3.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);				canvas.drawPath(S2, P2);				canvas.drawPath(S3, P3);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final playBtn viewImg = new playBtn(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static playBtn getShape(){		   final playBtn viewImg = new playBtn(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 