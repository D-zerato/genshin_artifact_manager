package dz.game.genshin.gam.enka.entity;

import dz.game.genshin.gam.enka.vo.Flat;
import dz.game.genshin.gam.meta.vo.ReliquaryType;
import dz.game.genshin.gam.enka.vo.ItemStatus;
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
