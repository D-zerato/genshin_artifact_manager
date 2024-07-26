package dz.game.genshin.artifact_manager.spec.enka.entity;

import dz.game.genshin.artifact_manager.spec.enka.vo.Flat;
import dz.game.genshin.artifact_manager.spec.enka.vo.ItemStatus;
import dz.game.genshin.artifact_manager.spec.vo.ReliquaryType;
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
