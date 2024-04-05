package dz.game.genshin.gam.player.entity;

import dz.game.genshin.gam.player.vo.Flat;
import dz.game.genshin.gam.player.vo.ReliquaryType;
import dz.game.genshin.gam.player.vo.ItemStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ReliquaryFlat extends Flat {
    //
    private String setNameTextMapHash;              // 성유물 이름 코드
    private ReliquaryType equipType;
    private ItemStatus reliquaryMainstat;           // 성유물 주옵션
    private List<ItemStatus> reliquarySubstats;     // 성유물 부옵션
}
