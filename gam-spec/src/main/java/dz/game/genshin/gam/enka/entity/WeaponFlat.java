package dz.game.genshin.gam.enka.entity;

import dz.game.genshin.gam.enka.vo.Flat;
import dz.game.genshin.gam.enka.vo.ItemStatus;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WeaponFlat extends Flat {
    //
    private String nameTextMapHash;     // 장비 이름 코드
    private ItemStatus weaponStats;     // 무기 능력치 목록
}
