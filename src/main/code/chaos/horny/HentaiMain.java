package chaos.horny;

//owned by horny part of cumunity

import arc.audio.Sound;
import chaos.horny.interfaces.HentaiInterfaces;
import mindustry.game.Schematic;

import java.util.*;

import static mindustry.Vars.ui;

public class HentaiMain{

    protected static Map<String, Sound> hornySoundsMap = new HashMap<>();
    protected static Map<String, Schematic> hornySchemaMap = new HashMap<>();

    public HentaiMain(){
        if(showHornyConfirm()){
            loadAssets();
            new HentaiEvents();
            new HentaiInterfaces();
        }
    }

    public void loadAssets(){
        //coming soon, assets in active search. If you can help with search send any content to misakacha2545@gmail.com or сестрёнка#8227
    }

    private boolean showHornyConfirm(){
        try{
        ui.showConfirm("@confirm", "Are you 18+ older?", () -> {
            throw new RuntimeException("Hentai is confirmed");
        });
        }catch (Exception confirmed){
            return true;
        }
        return false;
    }
}