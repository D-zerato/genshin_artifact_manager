package dz.game.genshin.gam.player.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Reliquary {
    //
    private int level;  // 1 ~ 21
    private int mainPropId;
    private List<Integer> appendPropIdList;

    public int getDisplayLevel() {
        //
        return this.level - 1;
    }
}
