package vimalcvs.library;


import android.content.Context;
import android.graphics.Color;

import com.vimal.player.Ui;
import com.shape.library.btm.nextBtn;
import com.shape.library.btm.pauseBtn;
import com.shape.library.btm.playBtn;
import com.shape.library.btm.prevBtn;

import vimalcvs.api.FMView;
import vimalcvs.api.FMlyt;

public class btmViewNew extends FMlyt {

    FMView playbtn;
    playBtn playIcon;
    pauseBtn pauseIcon;

    FMView nextbtn;
    nextBtn nextIcon;

    FMView prevbtn;
    prevBtn prevIcon;

    int iconSize;

    public btmViewNew(Context context, int width, int height) {
        super(context, width, height);
        setBackgroundColor(com.shape.library.allsong.itemRect.Color0);
        iconSize = height - Ui.cd.getHt(10);

        playIcon = playBtn.getShape();
        pauseIcon = pauseBtn.getShape();
        playbtn = new FMView(getContext(),iconSize,height);
        playIcon.InCenter(playbtn.width,playbtn.height);
        pauseIcon.InCenter(playbtn.width,playbtn.height);
        playbtn.setBackgroundColor(Color.argb(150,0xD3,0x5D,0x69));
        playbtn.setX(playbtn.width);
        playbtn.addShape(playIcon);
        playbtn.addShape(pauseIcon);
        pauseIcon.setDrawing(false);
        addView(playbtn);


        nextIcon = nextBtn.getShape();
        nextbtn = new FMView(getContext(),iconSize,height);
        nextIcon.InCenter(nextbtn.width,nextbtn.height);
        nextbtn.setBackgroundColor(Color.argb(0,0xD3,0x5D,0x69));
        nextbtn.addShape(nextIcon);
        nextbtn.setX(nextbtn.width * 2);
        addView(nextbtn);


        prevIcon = prevBtn.getShape();
        prevbtn = new FMView(getContext(),iconSize,height);
        prevIcon.InCenter(prevbtn.width,prevbtn.height);
        prevbtn.setBackgroundColor(Color.argb(0,0xD3,0x5D,0x69));
        prevbtn.addShape(prevIcon);
        addView(prevbtn);
    }

}
