package vimalcvs.library.menu.artistclass;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Color;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ListView;

import com.vimal.api.call;
import com.vimal.player.Ui;
import com.shape.library.icon.artistIcon;
import com.shape.library.allsong.menucloseBtn;
import com.shape.home.menu.backgroundImg;
import com.shape.home.menu.itemMenu;
import com.shape.home.menu.playBtn;
import com.shape.home.menu.playTItleback;

import vimalcvs.ContentHome;
import vimalcvs.api.FMText;
import vimalcvs.api.FMView;
import vimalcvs.api.FMlyt;
import vimalcvs.api.ShapeView;
import vimalcvs.api.animLis;
import vimalcvs.radiusSqure;
import vimalcvs.squre;
import vimalcvs.textImg;

public class songsPopup extends FMlyt {

    FMlyt Menu;
    AnimatorSet Set;
    String val;
    ShapeView MainIcon;
    public radiusSqure back;
    public squre imSqure;
    public squre playSqure;
    FMView background;


    boolean backGround = false;
    String[] data;

    public songsPopup(Context context, int width, int height, String[] data) {
        super(context, width, height);
        setEnableCatch();
        setBackgroundColor(0x00000000);
        this.data = data;
        background = new FMView(getContext(), Ui.cd.DPW, Ui.cd.DPH){
            @Override
            protected void onDraw(Canvas canvas) {
                if(backGround){
                    canvas.drawBitmap(ContentHome.This.MenuHome.bm,0,0,null);
                }
            }
        };
        background.setBackgroundColor(Color.argb((int) (0.5f*255),0,0,0));
        addView(background);

        Menu = new FMlyt(context, Ui.cd.DPW - Ui.cd.getHt(30), height - Ui.cd.getHt(30)){
            @Override
            protected void onDraw(Canvas canvas){
                back.draw(canvas);
                canvas.clipPath(back.S0);
                super.onDraw(canvas);
            }
        };

        back = new radiusSqure(Menu.width,Menu.height,0,0, Ui.cd.getHt(13));
        back.setColor(backgroundImg.Color0);
        Menu.InCenter(width,height);
        Menu.setBackgroundColor(0x00000000);
        addView(Menu);
        setAlpha(0);

        MainIcon = artistIcon.getFMview(context,true);
        MainIcon.setSize(Ui.cd.getHt(40), Ui.cd.getHt(40));
        MainIcon.setX(Ui.cd.getHt(5));
        MainIcon.setY(Ui.cd.getHt(5));
        Menu.addView(MainIcon);

        final ShapeView cb = menucloseBtn.getFMview(getContext(),true);
        cb.setRipple(true,0.3f);
        cb.onClick(new call(){
            @Override
            public void onCall(boolean bl) {
                Ui.bk.back();
            }
        });
        cb.setX(Menu.width - cb.width);
        Menu.addView(cb);

        FMText title = textImg.getFMText(getContext(),data[0], Ui.cd.getHt(18));
        title.InCenter(MainIcon);
        title.setX(MainIcon.width + Ui.cd.getHt(10));
        title.setSize(Menu.width  - MainIcon.width - Ui.cd.getHt(70),title.height);
        title.img.setEfects(new int[]{0xFFFFFFFF,0xFFFFFFFF,0x00FFFFFF});
        Menu.addView(title);

        FMText forText = textImg.getFMText(getContext(),"ADD TO PLAYLIST BY CLICK", Ui.cd.getHt(12));
        forText.img.setColor(0x66ffffff);
        forText.setX(MainIcon.width + Ui.cd.getHt(20));
        forText.setY(title.getY() + title.height + Ui.cd.getHt(10));
       // Menu.addView(forText);

        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Ui.bk.back();
            }
        });

        imSqure = new squre(Menu.width, Ui.cd.getHt(150),0, Ui.cd.getHt(50));
        imSqure.setColor(0x55000000);
        Menu.addShape(imSqure);


        playSqure = new squre(Menu.width, Ui.cd.getHt(2),0,imSqure.y + imSqure.height);
        playSqure.setColor(playTItleback.Color0);
        Menu.addShape(playSqure);

        Set = new AnimatorSet();
        Set.setInterpolator(Ui.cd.TH);
        Set.setDuration(200);
        Set.playTogether(
                ObjectAnimator.ofFloat(this, "Alpha", 1.0F)
        );
        Set.addListener(new animLis(){
            @Override
            public void onAnimationEnd(Animator animation) {
                //ContentHome.This.MenuHome.setAlpha(0.5f,true);
                ContentHome.This.MenuHome.cn.drawColor(Color.argb((int) (0.5f*255),0,0,0));
                ContentHome.This.MenuHome.cn.translate((int)Menu.getX(),(int)Menu.getY());
                back.draw(ContentHome.This.MenuHome.cn);
                ContentHome.This.MenuHome.cn.translate(-(int)Menu.getX(),-(int)Menu.getY());
                back.setDrawing(false);
                backGround = true;
                background.setBackgroundResource(0);
                background.invalidate();
                ContentHome.This.MenuHome.setVisibility(GONE);
                Menu.invalidate();
                //removeView(background);
            }
        });
        Set.start();


        pb = playBtn.getFMview(getContext(),true);
        pb.setRipple(true);
        pb.setX(Ui.cd.getHt(10));
        pb.setY(Menu.height - pb.height - Ui.cd.getHt(10));
        Menu.addView(pb);

        pb.onClick(new call(){
            @Override
            public void onCall(boolean bl) {
                Ui.ef.MusicPlayer.handler.playALlSong(0, getArtistsAIDs(),"ARTIST : " + songsPopup.this.data[0]);
                Ui.bk.back();
            }
        });

        textImg play = textImg.getText("PLAY ARTIST", Ui.cd.getHt(16));
        play.setX(pb.width + Ui.cd.getHt(20));
        play.setY((int) pb.getY());
        Menu.addShape(play);

        textImg songCount = textImg.getText(data[2] + " SONGS", Ui.cd.getHt(14));
        songCount.setX(pb.width + Ui.cd.getHt(20));
        songCount.setY((int) pb.getY());
        Menu.addShape(songCount);

        play.setY((int)(pb.getY() +  ((pb.height - (play.height + Ui.cd.getHt(10) + songCount.height)) / 2f)));
        songCount.setY((int)(play.y + play.height + Ui.cd.getHt(10)));
        songCount.setColor(0x66FFFFFF);

        ShapeView aMenu = itemMenu.getFMview(getContext(),true);
        aMenu.setRipple(true,0.3f);
        aMenu.setX(Menu.width - Ui.cd.getHt(5) -  aMenu.width);
        aMenu.setY(Menu.height - Ui.cd.getHt(5) - aMenu.height);
        Menu.addView(aMenu);

        aMenu.onClick(new call(){
            @Override
            public void onCall(boolean bl) {
                songsPopup.this.drawCatch();
                final artitstBtns mn = new artitstBtns(getContext(), Ui.cd.DPW, Ui.cd.DPH,songsPopup.this.data);
                mn.fromHtml = true;
                ContentHome.This.addPopup(mn);
                mn.setClickable(true);
                Ui.bk.add(new call() {
                    @Override
                    public void onCall(boolean bl) {
                        ContentHome.This.removePopup(mn);
                        songsPopup.this.removeCatch();
                    }
                });
            }
        });

        ListView listview = new ListView(getContext());
        listview.setLayoutParams(new LayoutParams(Menu.width,Menu.height - Ui.cd.getHt(52 + 70)));
        listview.setY(Ui.cd.getHt(52));
        listview.setDivider(null);
        listview.setBackgroundColor(com.shape.home.slider.backgroundImg.Color0);
        adapter = new popupAdapter(){
            @Override
            public int getWidth() {
                return Menu.width;
            }

            @Override
            public String getId() {
                String str = super.getId() + songsPopup.this.data[1];
                return str;
            }

            @Override
            public String getName() {
                return songsPopup.this.data[0];
            }

            @Override
            public String[] getAlbumData() {
                return songsPopup.this.data;
            }

            @Override
            public void onMenu() {
                songsPopup.this.drawCatch();
            }

            @Override
            public void onBack() {
                songsPopup.this.removeCatch();
            }
        };
        listview.setAdapter(adapter);
        Menu.addView(listview,0);

        /*ShapeView imTop = albumBack.getFMview(getContext(),false);
        imTop.setSize((int) imSqure.width,(int) imSqure.height);
        imTop.setY(imSqure.y);
        Menu.addView(imTop,0);*/
    }


    int[] getArtistsAIDs(){

        String searchString = MediaStore.Audio.Media.IS_MUSIC + "=?" + "AND " + MediaStore.Audio.Media.ARTIST_ID + " = " + data[1];
        String[] searchPram = new String[]{"1"};
        String[] cols = new String[] {MediaStore.Audio.Media._ID};
        Cursor cursor = Ui.ef.getBaseContext().getContentResolver().query( MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,cols, searchString  ,searchPram,null);
        int[] AIDs = new int[cursor.getCount()];
        int count = 0;
        for (int i = 0; i < cursor.getCount(); i++) {
            cursor.moveToNext();
            AIDs[count] = cursor.getInt(0);
            count++;
        }
        cursor.close();
        return  AIDs;

    }


    popupAdapter adapter;
    FMView pb;


    public void onBtn(String name){

    }

    public void onSelect(String id){

    }

    public boolean onEnter(String str){
        return false;
    }
}
