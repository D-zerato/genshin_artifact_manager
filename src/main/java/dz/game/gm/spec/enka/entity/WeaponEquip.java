package dz.game.gm.spec.enka.entity;

import dz.game.gm.spec.enka.vo.Equip;
import dz.game.gm.spec.enka.vo.Weapon;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeaponEquip extends Equip {
    private Weapon weapon;
    private WeaponFlat flat;

    public boolean isWeapon() {
        return this.weapon != null;
    }
}
