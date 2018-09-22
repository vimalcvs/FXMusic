package vimalcvs.home.views;

import android.content.Context;
import android.graphics.Canvas;

import vimalcvs.home.img.songItemsImg;
import vimalcvs.api.FMView;

/**
 * Created by vimal on 9/11/2016.
 */

public class songItemsBtn extends FMView {
    songItemsImg SongItemsImg;
    public songItemsBtn(Context context, int width, int height) {
        super(context, width, height);
        //setBackgroundColor(0xFF000000);
        SongItemsImg = new songItemsImg(width,height,0,0);
        setRipple(true,0.4f);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.postDraw(canvas);
        SongItemsImg.draw(canvas);
        super.afterDraw(canvas,SongItemsImg.S0);
    }
}

