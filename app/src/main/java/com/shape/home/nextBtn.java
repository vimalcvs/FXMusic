package com.shape.home;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import vimalcvs.api.ShapeView;import vimalcvs.api.shapeImg;import android.graphics.Paint;import android.graphics.Canvas;import com.vimal.player.Ui;public class nextBtn extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(0f, 13f);			quadTo(0f, 0f, 13f, 0f);			lineTo(35f, 0f);			quadTo(48f, 0f, 48f, 13f);			lineTo(48f, 40f);			quadTo(48f, 53f, 35f, 53f);			lineTo(13f, 53f);			quadTo(0f, 53f, 0f, 40f);			lineTo(0f, 13f);	}}class Path1 extends Path{  	public Path1() {			moveTo(2f, 13f);			quadTo(2f, 2f, 13f, 2f);			lineTo(35f, 2f);			quadTo(46f, 2f, 46f, 13f);			lineTo(46f, 40f);			quadTo(46f, 51f, 35f, 51f);			lineTo(13f, 51f);			quadTo(2f, 51f, 2f, 40f);			lineTo(2f, 13f);	}}class Path2 extends Path{  	public Path2() {			moveTo(27.25f, 24.35f);			quadTo(29.6f, 26.35f, 27.25f, 28.3f);			lineTo(20.3f, 35.3f);			quadTo(19.8f, 35.85f, 19.05f, 35.85f);			quadTo(18.3f, 35.85f, 17.7f, 35.3f);			quadTo(17.25f, 34.8f, 17.2f, 34.2f);			lineTo(17.2f, 18.7f);			lineTo(17.25f, 18.7f);			quadTo(17.35f, 18.15f, 17.7f, 17.7f);			quadTo(18.3f, 17.15f, 19.05f, 17.15f);			quadTo(19.8f, 17.15f, 20.3f, 17.7f);			lineTo(27.25f, 24.35f);	}}class Path3 extends Path{  	public Path3() {			moveTo(28.85f, 18.3f);			quadTo(28.85f, 17.9f, 29.15f, 17.6f);			quadTo(29.45f, 17.3f, 29.85f, 17.3f);			quadTo(30.25f, 17.3f, 30.55f, 17.6f);			lineTo(30.85f, 18.3f);			lineTo(30.85f, 34.75f);			lineTo(30.55f, 35.45f);			lineTo(29.85f, 35.75f);			lineTo(29.15f, 35.45f);			quadTo(28.85f, 35.15f, 28.85f, 34.75f);			lineTo(28.85f, 18.3f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0xFFd35d69); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0xFF54497c); 		public Path1 S1 = new Path1();		public Paint P2 = new Paint(); 		public static int Color2 = (0xFFffffff); 		public Path2 S2 = new Path2();		public Paint P3 = new Paint(); 		public static int Color3 = (0xFFffffff); 		public Path3 S3 = new Path3();		public static float Ht = 53F; 		public static float Wh = 48F;  		public nextBtn(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0xFFd35d69);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0xFF54497c);			P1.setAntiAlias(true);			S2.transform(matrix);			P2.setColor(0xFFffffff);			P2.setAntiAlias(true);			S3.transform(matrix);			P3.setColor(0xFFffffff);			P3.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);				canvas.drawPath(S2, P2);				canvas.drawPath(S3, P3);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final nextBtn viewImg = new nextBtn(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static nextBtn getShape(){		   final nextBtn viewImg = new nextBtn(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 