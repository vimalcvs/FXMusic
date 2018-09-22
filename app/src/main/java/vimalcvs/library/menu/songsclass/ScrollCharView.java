package vimalcvs.library.menu.songsclass;

import android.content.Context;

import com.vimal.player.Ui;
import com.shape.library.icon.selectBack;

import vimalcvs.api.FMText;
import vimalcvs.api.FMlyt;
import vimalcvs.api.ShapeView;
import vimalcvs.textImg;

public class ScrollCharView extends FMlyt{
    FMText txt;
    ShapeView stick;
    public ScrollCharView(Context context ) {
        super(context);

        stick = selectBack.getFMview(getContext(),false);
        addView(stick);

        txt = textImg.getFMText(getContext(),"A", Ui.cd.getHt(22));
        txt.InCenter(stick);
        txt.img.P0.setColor(0xFFFFFFFF);
        addView(txt);

        setSize(stick.width,stick.height);
        setClickable(false);
    }

    String aChar = "";
    public void setChar(String aChar) {
        if(!this.aChar.equals(aChar)){
            this.aChar = aChar;
            txt.setText(aChar);
            txt.InCenter(stick);
            txt.invalidate();
        }
    }
}
