package dz.game.genshin.gam.enka.entity;

import dz.game.genshin.gam.enka.vo.Equip;
import dz.game.genshin.gam.enka.vo.Reliquary;
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
