package dz.game.genshin.gam.enka.entity;

import dz.game.genshin.gam.enka.vo.Equip;
import dz.game.genshin.gam.enka.vo.Weapon;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeaponEquip extends Equip {
    //
    private Weapon weapon;
    private WeaponFlat flat;

    public boolean isWeapon() {
        //
        return this.weapon != null;
    }
}
