package com.shape.library.icon;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import vimalcvs.api.ShapeView;import vimalcvs.api.shapeImg;import android.graphics.Paint;import android.graphics.Canvas;import com.vimal.player.Ui;public class bassIcon extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(37f, 0f);			quadTo(50f, 0f, 50f, 13f);			lineTo(50f, 37f);			quadTo(50f, 50f, 37f, 50f);			lineTo(13f, 50f);			quadTo(0f, 50f, 0f, 37f);			lineTo(0f, 13f);			quadTo(0f, 0f, 13f, 0f);			lineTo(37f, 0f);	}}class Path1 extends Path{  	public Path1() {			moveTo(25f, 40f);			quadTo(18.8f, 40f, 14.4f, 35.6f);			quadTo(10f, 31.2f, 10f, 25f);			quadTo(10f, 18.85f, 14.4f, 14.4f);			quadTo(18.8f, 10f, 25f, 10f);			quadTo(31.2f, 10f, 35.6f, 14.4f);			quadTo(40f, 18.85f, 40f, 25f);			quadTo(40f, 31.2f, 35.6f, 35.6f);			quadTo(31.2f, 40f, 25f, 40f);	}}class Path2 extends Path{  	public Path2() {			moveTo(35.6f, 14.4f);			quadTo(40f, 18.85f, 40f, 25f);			quadTo(40f, 31.2f, 35.6f, 35.6f);			quadTo(31.2f, 40f, 25f, 40f);			quadTo(18.8f, 40f, 14.4f, 35.6f);			quadTo(10f, 31.2f, 10f, 25f);			quadTo(10f, 18.85f, 14.4f, 14.4f);			quadTo(18.8f, 10f, 25f, 10f);			quadTo(31.2f, 10f, 35.6f, 14.4f);			moveTo(34.2f, 15.8f);			quadTo(30.4f, 12f, 25f, 12f);			quadTo(19.65f, 12f, 15.85f, 15.8f);			quadTo(12f, 19.6f, 12f, 25f);			quadTo(12f, 30.35f, 15.85f, 34.15f);			quadTo(19.65f, 38f, 25f, 38f);			quadTo(30.4f, 38f, 34.2f, 34.15f);			quadTo(38f, 30.35f, 38f, 25f);			quadTo(38f, 19.6f, 34.2f, 15.8f);	}}class Path3 extends Path{  	public Path3() {			moveTo(17.5f, 12.95f);			quadTo(18.45f, 13.9f, 18.45f, 15.25f);			quadTo(18.45f, 16.6f, 17.5f, 17.5f);			quadTo(16.6f, 18.45f, 15.25f, 18.45f);			quadTo(13.9f, 18.45f, 12.95f, 17.5f);			quadTo(12.05f, 16.6f, 12.05f, 15.25f);			quadTo(12.05f, 13.9f, 12.95f, 12.95f);			quadTo(13.9f, 12.05f, 15.25f, 12.05f);			quadTo(16.6f, 12.05f, 17.5f, 12.95f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0x00695b99); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0xFFc0c0c0); 		public Path1 S1 = new Path1();		public Paint P2 = new Paint(); 		public static int Color2 = (0xFFcecece); 		public Path2 S2 = new Path2();		public Paint P3 = new Paint(); 		public static int Color3 = (0xFFffffff); 		public Path3 S3 = new Path3();		public static float Ht = 50F; 		public static float Wh = 50F;  		public bassIcon(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0x00695b99);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0xFFc0c0c0);			P1.setAntiAlias(true);			S2.transform(matrix);			P2.setColor(0xFFcecece);			P2.setAntiAlias(true);			S3.transform(matrix);			P3.setColor(0xFFffffff);			P3.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);				canvas.drawPath(S2, P2);				canvas.drawPath(S3, P3);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final bassIcon viewImg = new bassIcon(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static bassIcon getShape(){		   final bassIcon viewImg = new bassIcon(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 