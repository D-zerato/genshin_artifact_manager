package dz.game.genshin.gam.player.entity;

import dz.game.genshin.gam.player.vo.Equip;
import dz.game.genshin.gam.player.vo.Weapon;
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
