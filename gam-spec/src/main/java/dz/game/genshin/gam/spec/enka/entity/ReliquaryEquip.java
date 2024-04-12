package dz.game.genshin.gam.spec.enka.entity;

import dz.game.genshin.gam.spec.enka.vo.Equip;
import dz.game.genshin.gam.spec.enka.vo.Reliquary;
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
