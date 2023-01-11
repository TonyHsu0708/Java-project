package com.company.Sprite;

import com.company.GameView.DisasterView;
import com.company.GameView.RedSeaGameView;
import com.company.GameView.TenCommandmentsView;
import com.company.Main;
import com.company.Sprite.DisasterViewSprite.Bug;
import com.company.Sprite.DisasterViewSprite.Frog;
import com.company.Sprite.DisasterViewSprite.Ice;
import com.company.Sprite.DisasterViewSprite.Tombstone;
import com.company.Sprite.RedSeaViewSprite.Anubis;
import com.company.Sprite.RedSeaViewSprite.Cat;
import com.company.Sprite.RedSeaViewSprite.Pharoah;
import com.company.Sprite.TenCommandmentsSprite.TenCommandment;

import javax.swing.*;
import java.util.ArrayList;

public class Moses  extends  Sprite{
    public Moses(int x,int y){
    setPosition(x,y);
    img=new ImageIcon("src/com/company/Moses.png");
    }

    @Override
    public String overlap(int x, int y) {
        if(Main.gameView instanceof DisasterView){
            //check for bugs and frogs
            ArrayList<Frog> frogs=((DisasterView)Main.gameView).getFrogs();
            ArrayList<Bug> bugs=((DisasterView)Main.gameView).getBugs();
            for(Frog f:frogs){
                if(f.getRelativePosition()!=null&&x==f.getRelativePosition().x&& y==f.getRelativePosition().y){
                    return "Die";
                }
            }
            for(Bug b:bugs){
                if(b.getRelativePosition()!=null&&x==b.getRelativePosition().x&& y==b.getRelativePosition().y){
                    return "Die";
                }
            }
            //check for ice and tombstones
            ArrayList<Ice> ices=((DisasterView)Main.gameView).getIceCubes();
            ArrayList<Tombstone> tombstones=((DisasterView)Main.gameView).getStones();
            for(Tombstone s:tombstones){
                if(s.getRelativePosition()!=null&&x==s.getRelativePosition().x&& y==s.getRelativePosition().y){
                    return "Cannot move";
                }
            }
            for(Ice i:ices){
                if(i.getRelativePosition()!=null&&x==i.getRelativePosition().x&& y==i.getRelativePosition().y){
                    return "Cannot move";
                }
            }

            //check for door
            Door door=Main.gameView.getDoor();
            if(x==door.getRelativePosition().x&&y==door.getRelativePosition().y){
                return "Next level";
            }
        }else if(Main.gameView instanceof RedSeaGameView){
            //check for cats
            ArrayList<Cat> cats=((RedSeaGameView)Main.gameView).getCats();
            for(Cat s:cats){
                if(s.getRelativePosition()!=null&&x==s.getRelativePosition().x&& y==s.getRelativePosition().y){
                    return "Cannot move";
                }
            }
            //check pharaoh and anubis
            ArrayList<Pharoah> pharoahs=((RedSeaGameView)Main.gameView).getPharoahs();
            ArrayList<Anubis> anubis=((RedSeaGameView)Main.gameView).getAnubis();
            for(Pharoah p:pharoahs){
                if(p.getRelativePosition()!=null&&x==p.getRelativePosition().x&& y==p.getRelativePosition().y){
                    return "Die";
                }
            }
            for(Anubis a:anubis){
                if(a.getRelativePosition()!=null&&x==a.getRelativePosition().x&& y==a.getRelativePosition().y){
                    return "Die";
                }
            }
            //check for door
            Door door=Main.gameView.getDoor();
            if(x==door.getRelativePosition().x&&y==door.getRelativePosition().y){
                return "Next level";
            }
        }else if(Main.gameView instanceof TenCommandmentsView){
            ArrayList<TenCommandment> stone = ((TenCommandmentsView) Main.gameView).getTenCommandments();
            for(TenCommandment t:stone){
                if(t.getRelativePosition()!=null&&x==t.getRelativePosition().x&&y==t.getRelativePosition().y){
                    t.setNullPosition();
                    return "Game over";
                }
            }
        }
        return "none";
    }
}
