package vimalcvs.library.menu.folderclass;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Canvas;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.vimal.api.call;
import com.vimal.player.Ui;
import com.vimalcvs.music.player.playlistHandler;
import com.shape.library.icon.addNextIcon;
import com.shape.library.icon.fileInfoIcon;
import com.shape.library.icon.folderIcon;
import com.shape.library.icon.ringToneIcon;
import com.shape.library.icon.shareFileIcon;
import com.shape.library.allsong.menucloseBtn;
import com.shape.home.menu.backgroundImg;
import com.shape.home.menu.btmBack;

import java.io.File;
import java.util.ArrayList;

import vimalcvs.ContentHome;
import vimalcvs.home.menu.Item;
import vimalcvs.library.menu.genersclass.songsPopup;
import vimalcvs.library.menu.songsclass.playListsAdapter;
import vimalcvs.api.FMText;
import vimalcvs.api.FMlyt;
import vimalcvs.api.ShapeView;
import vimalcvs.radiusSqure;
import vimalcvs.textImg;


public class folderBtns extends FMlyt {

    FMlyt Menu;
    AnimatorSet Set;
    String val;
    ShapeView MainIcon;
    public static radiusSqure back;
    String[] data;


    public folderBtns(Context context, int width, int height, String[] data) {
        super(context, width, height);
        setBackgroundColor(0x99000000);
        this.data = data;

        Menu = new FMlyt(context, Ui.cd.DPW - Ui.cd.getHt(40), Ui.cd.getHt(500 - 110)){
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

        MainIcon = folderIcon.getFMview(context,true);
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

        FMText title = textImg.getFMText(getContext(),"ARTISTS OPTIONS", Ui.cd.getHt(16));
        title.InCenter(MainIcon);
        title.img.setColor(0x99ffffff);
        title.setX(MainIcon.width + Ui.cd.getHt(20));
        Menu.addView(title);

        FMText forText = textImg.getFMText(getContext(),"ADD TO PLAYLIST BY CLICK", Ui.cd.getHt(12));
        forText.img.setColor(0x66ffffff);
        forText.setX(MainIcon.width + Ui.cd.getHt(20));
        forText.setY(title.getY() + title.height + Ui.cd.getHt(10));
        Menu.addView(forText);

        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Ui.bk.back();
            }
        });

        Set = new AnimatorSet();
        Set.setInterpolator(Ui.cd.TH);
        Set.setDuration(200);
        Set.playTogether(
                ObjectAnimator.ofFloat(this, "Alpha", 1.0F)
        );
        Set.start();
        setList();
    }




    void setList(){
        ListView listview;
        listview = new ListView(getContext()){
            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                //canvas.clipPath(squre.S0);
                //squre.draw(canvas);
            }
        };
        listview.setBackgroundColor(btmBack.Color0);
        listview.setLayoutParams(new LayoutParams(Menu.width,Menu.height - Ui.cd.getHt(70+120)));
        listview.setY(Ui.cd.getHt(50));
        listview.setDivider(null);
        listview.setX(0);
        listview.setY(Ui.cd.getHt(70));
        listview.setAdapter(new playListsAdapter(Menu){
            @Override
            public void onSelect(String Id) {
                folderBtns.this.onSelect(Id);
            }
        });
        Menu.addView(listview);
        init((int) (Menu.height - Ui.cd.getHt(70+120) + listview.getY()));
    }

    void init(int top){
        int len = 4;
        int line = 1;
        int spaceWidth = Ui.cd.getHt(15);
        int paddingWidth = Ui.cd.getHt(15);
        int itemWidth = (int)(((float)Menu.width - Ui.cd.getHt(15 * (len + 1))) / len);
        int itemHeight = (int)(itemWidth * 1.5f);
        int iconSize = (int)(itemWidth * 0.7f);

        for(int i = 0;i < len;i++){
            for(int j = 0;j < line;j++){
                if((j*len) + i < 3){
                    final Item item = new Item(getContext(),itemWidth,itemHeight);
                    item.onClick(new call(){
                        @Override
                        public void onCall(boolean bl) {
                            onBtn(item.name.Text);
                        }
                    });

                    //item.setBackgroundColor(0xFFCCCCCC);
                    item.setX((i * itemWidth) + (i * spaceWidth) + spaceWidth);
                    item.setY(top + (j * itemHeight) + (spaceWidth * (j + 1)));
                    Menu.addView(item);
                    Log.i("My","(i*len) + j = " + ((i*len) + j));
                    switch ((j*len) + i){
                        case 0:
                            item.setData("PLAY", new com.shape.library.icon.playAllIcon(iconSize,iconSize,0,0));
                            break;
                        case 1:
                            item.setData("ADD NEXT",new addNextIcon(iconSize,iconSize,0,0));
                            break;
                        case 6:
                            item.setData("SHOW FILE",new folderIcon(iconSize,iconSize,0,0));
                            break;
                        case 2:
                            item.setData("SHARE",new shareFileIcon(iconSize,iconSize,0,0));
                            break;
                        case 4:
                            item.setData("RINGTONE",new ringToneIcon(iconSize,iconSize,0,0));
                            break;
                        case 5:
                            item.setData("INFO",new fileInfoIcon(iconSize,iconSize,0,0));
                            break;
                    }
                }

            }
        }

       //Menu.setSize(Menu.width,Menu.height - Ui.cd.getHt(110));
    }

    public boolean fromHtml = false;
    public void onBtn(String name){
        if(name.equals("PLAY")){
            Ui.ef.MusicPlayer.handler.playALlSong(0, getArtistsAIDs(),"ALBUM : " + data[0]);
            Ui.bk.back();
        } else if(name.equals("ADD NEXT")){
            Ui.ef.MusicPlayer.handler.addSongsNext(getArtistsAIDs());
            Ui.bk.back();
        }else if(name.equals("SHOW FILE")){
            Ui.bk.back();
            if(fromHtml){
                Ui.bk.back();
            }
            Ui.bk.add(new call(){
                @Override
                public void onCall(boolean bl) {
                    ContentHome.This.MenuHome.goingBack();
                    ContentHome.This.MenuHome.openPage(4);
                    if(fromHtml){
                        ContentHome.This.MenuHome.drawCatch();
                        final songsPopup mn = new songsPopup(getContext(), Ui.cd.DPW, Ui.cd.DPH,folderBtns.this.data);
                        ContentHome.This.addPopup(mn);
                        mn.setClickable(true);
                        Ui.bk.add(new call() {
                            @Override
                            public void onCall(boolean bl) {
                                ContentHome.This.removePopup(mn);
                                ContentHome.This.MenuHome.setVisibility(VISIBLE);
                                ContentHome.This.MenuHome.removeCatch();
                                ContentHome.This.MenuHome.setAlpha(1,true);
                            }
                        });
                    }
                }
            });
            String path = getFirstPath();
            if(path != null){
                ContentHome.This.MenuHome.openFolder(path);
            }
        }else if(name.equals("SHARE")){
            Ui.bk.back();

            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND_MULTIPLE);
            intent.putExtra(Intent.EXTRA_SUBJECT, "All Songs from this Albums...");
            intent.setType("image/jpeg"); /* This example is sharing jpeg images. */

            intent.putParcelableArrayListExtra(Intent.EXTRA_STREAM, getAlbumsFiles());
            Ui.ef.startActivity(intent);
        }
    }

    int[] getArtistsAIDs(){

        String searchString = MediaStore.Audio.Genres.Members.IS_MUSIC+"=?";
        String[] searchPram = new String[]{"1"};
        String[] cols = new String[] {  MediaStore.Audio.Genres.Members.AUDIO_ID };
        Cursor cursor = Ui.ef.getBaseContext().getContentResolver().query(MediaStore.Audio.Genres.Members.getContentUri("external", Long.parseLong(data[1])),cols, searchString,searchPram, MediaStore.Audio.Media.TITLE +" COLLATE NOCASE ASC");


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

    String getFirstPath(){

        String searchString = MediaStore.Audio.Genres.Members.IS_MUSIC+"=?";
        String[] searchPram = new String[]{"1"};
        String[] cols = new String[] {  MediaStore.Audio.Genres.Members.DATA };
        Cursor cursor = Ui.ef.getBaseContext().getContentResolver().query(MediaStore.Audio.Genres.Members.getContentUri("external", Long.parseLong(data[1])),cols, searchString,searchPram, MediaStore.Audio.Media.TITLE +" COLLATE NOCASE ASC");


        for (int i = 0; i < cursor.getCount(); i++) {
            cursor.moveToNext();
            return  cursor.getString(0);
        }
        cursor.close();
        return  null;

    }


    ArrayList<Uri> getAlbumsFiles(){

        String searchString = MediaStore.Audio.Genres.Members.IS_MUSIC+"=?";
        String[] searchPram = new String[]{"1"};
        String[] cols = new String[] {  MediaStore.Audio.Genres.Members.DATA };
        Cursor cursor = Ui.ef.getBaseContext().getContentResolver().query(MediaStore.Audio.Genres.Members.getContentUri("external", Long.parseLong(data[1])),cols, searchString,searchPram, MediaStore.Audio.Media.TITLE +" COLLATE NOCASE ASC");


        ArrayList<Uri> files = new ArrayList<Uri>();
        for (int i = 0; i < cursor.getCount(); i++) {
            cursor.moveToNext();
            File file = new File(cursor.getString(0));
            Uri uri = Uri.fromFile(file);
            files.add(uri);
        }
        cursor.close();

        return  files;

    }

    public void onSelect(String id){
        Log.i("My","Id : " + id);
        Ui.bk.back();
        int[] AIDs = getArtistsAIDs();
        if(Integer.parseInt(id) != -1){
            playlistHandler.addTOPlaylistByID(Ui.ef.getContentResolver(),Integer.parseInt(id),AIDs);
        }
        if(Integer.parseInt(id) == (Ui.ef.MusicPlayer.handler.playlist.id)){
            Ui.ef.MusicPlayer.handler.addSongs(AIDs);
        }
    }

    public boolean onEnter(String str){
        return false;
    }
}
