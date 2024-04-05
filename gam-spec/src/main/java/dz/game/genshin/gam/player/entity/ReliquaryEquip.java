package dz.game.genshin.gam.player.entity;

import dz.game.genshin.gam.player.vo.Equip;
import dz.game.genshin.gam.player.vo.Reliquary;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReliquaryEquip extends Equip {
    //
    private Reliquary reliquary;
    private ReliquaryFlat flat;

    public boolean isReliquary() {
        //
        return this.reliquary != null;
    }
}
