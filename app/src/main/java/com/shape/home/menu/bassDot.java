package com.shape.home.menu;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import vimalcvs.api.ShapeView;import vimalcvs.api.shapeImg;import android.graphics.Paint;import android.graphics.Canvas;import com.vimal.player.Ui;public class bassDot extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(150f, 150f);			lineTo(0f, 150f);			lineTo(0f, 0f);			lineTo(150f, 0f);			lineTo(150f, 150f);	}}class Path1 extends Path{  	public Path1() {			moveTo(132.25f, 52.85f);			quadTo(136.2f, 63.1f, 136.2f, 75f);			quadTo(136.2f, 100.4f, 118.25f, 118.3f);			quadTo(106.8f, 129.7f, 92.35f, 133.85f);			quadTo(84.15f, 136.2f, 75f, 136.2f);			quadTo(65.85f, 136.2f, 57.65f, 133.85f);			quadTo(43.2f, 129.7f, 31.7f, 118.3f);			quadTo(13.8f, 100.4f, 13.8f, 75f);			quadTo(13.8f, 63.1f, 17.8f, 52.85f);			quadTo(22.15f, 41.25f, 31.7f, 31.75f);			quadTo(49.65f, 13.8f, 75f, 13.8f);			quadTo(100.35f, 13.8f, 118.25f, 31.75f);			quadTo(127.75f, 41.25f, 132.25f, 52.85f);	}}class Path2 extends Path{  	public Path2() {			moveTo(81.9f, 27.45f);			lineTo(75.15f, 27f);			lineTo(74.85f, 27f);			lineTo(67.7f, 27.5f);			lineTo(66.5f, 27.7f);			lineTo(66.15f, 27.7f);			quadTo(63.65f, 27.7f, 61.85f, 25.9f);			quadTo(60.15f, 24.2f, 60.15f, 21.7f);			quadTo(60.15f, 19.25f, 61.85f, 17.45f);			quadTo(63.15f, 16.2f, 64.85f, 15.8f);			lineTo(65.35f, 15.7f);			lineTo(74.85f, 15f);			lineTo(75.15f, 15f);			lineTo(83.5f, 15.55f);			lineTo(83.55f, 15.55f);			lineTo(85.25f, 15.8f);			quadTo(86.6f, 16.3f, 87.7f, 17.4f);			quadTo(89.5f, 19.2f, 89.5f, 21.65f);			quadTo(89.5f, 24.15f, 87.7f, 25.85f);			quadTo(85.95f, 27.65f, 83.5f, 27.65f);			lineTo(83.2f, 27.65f);			lineTo(81.9f, 27.45f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0x00ffffff); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0x00d35d69); 		public Path1 S1 = new Path1();		public Paint P2 = new Paint(); 		public static int Color2 = (0xFFf35d69); 		public Path2 S2 = new Path2();		public static float Ht = 150F; 		public static float Wh = 150F;  		public bassDot(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0x00ffffff);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0x00d35d69);			P1.setAntiAlias(true);			S2.transform(matrix);			P2.setColor(0xFFf35d69);			P2.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);				canvas.drawPath(S2, P2);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final bassDot viewImg = new bassDot(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static bassDot getShape(){		   final bassDot viewImg = new bassDot(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 