package dz.game.gm.spec.enka.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flat {
    private ItemType itemType;
    private int rankLevel;  // 3 ~ 5
    private String icon;
}
