package com.shape.library.icon;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import vimalcvs.api.ShapeView;import vimalcvs.api.shapeImg;import android.graphics.Paint;import android.graphics.Canvas;import com.vimal.player.Ui;public class addNextIcon extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(37f, 0f);			quadTo(50f, 0f, 50f, 13f);			lineTo(50f, 37f);			quadTo(50f, 50f, 37f, 50f);			lineTo(13f, 50f);			quadTo(0f, 50f, 0f, 37f);			lineTo(0f, 13f);			quadTo(0f, 0f, 13f, 0f);			lineTo(37f, 0f);	}}class Path1 extends Path{  	public Path1() {			moveTo(28.65f, 27.55f);			lineTo(18.65f, 34.8f);			lineTo(18.65f, 20.3f);			lineTo(28.65f, 27.55f);	}}class Path2 extends Path{  	public Path2() {			moveTo(31.35f, 34.8f);			lineTo(29.35f, 34.8f);			lineTo(29.35f, 20.3f);			lineTo(31.35f, 20.3f);			lineTo(31.35f, 34.8f);	}}class Path3 extends Path{  	public Path3() {			moveTo(40.95f, 17.05f);			lineTo(9.05f, 17.05f);			lineTo(9.05f, 15.05f);			lineTo(40.95f, 15.05f);			lineTo(40.95f, 17.05f);			moveTo(41.05f, 40.05f);			lineTo(9f, 40.05f);			lineTo(9f, 38.05f);			lineTo(41.05f, 38.05f);			lineTo(41.05f, 40.05f);			moveTo(40.85f, 12f);			lineTo(8.95f, 12f);			lineTo(8.95f, 10f);			lineTo(40.85f, 10f);			lineTo(40.85f, 12f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0x00695b99); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0xFFffffff); 		public Path1 S1 = new Path1();		public Paint P2 = new Paint(); 		public static int Color2 = (0xFFffffff); 		public Path2 S2 = new Path2();		public Paint P3 = new Paint(); 		public static int Color3 = (0xFFd6d6d6); 		public Path3 S3 = new Path3();		public static float Ht = 50F; 		public static float Wh = 50F;  		public addNextIcon(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0x00695b99);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0xFFffffff);			P1.setAntiAlias(true);			S2.transform(matrix);			P2.setColor(0xFFffffff);			P2.setAntiAlias(true);			S3.transform(matrix);			P3.setColor(0xFFd6d6d6);			P3.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);				canvas.drawPath(S2, P2);				canvas.drawPath(S3, P3);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final addNextIcon viewImg = new addNextIcon(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static addNextIcon getShape(){		   final addNextIcon viewImg = new addNextIcon(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 