package dz.game.genshin.gam.spec.enka.entity;

import dz.game.genshin.gam.spec.enka.vo.Equip;
import dz.game.genshin.gam.spec.enka.vo.Prop;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.collections4.CollectionUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@Setter
public class AvatarInfo {
    //
    private String avatarID;
    private List<String> talentIdList;
    private Map<String, Prop> propMap;
    private Map<String, BigDecimal> fightMap;
    private int skillDepotId;   // 스킬셋 id
    private List<Integer> inherentProudSkillList;   // 해금된 특성 목록
    private Map<String, Integer> skillLevelMap; // 스킬 레벨 맵
    private List<Equip> equipList; // 무기, 성유물 정보
    private Fetter fetterInfo; // 호감도 레벨

    public int getExpLevel() {
        //
        if (fetterInfo == null) {
            return 0;
        }

        return this.fetterInfo.expLevel;
    }

    @Getter
    @Setter
    public class Fetter {
        //
        private int expLevel;
    }

    public Equip getWeapon() {
        //
        if (CollectionUtils.isEmpty(this.equipList)) {
            return null;
        }

        return equipList.stream().filter(equip -> ((WeaponEquip) equip).isWeapon()).findFirst().orElse(null);
    }

    public List<Equip> getReliquaries() {
        //
        if (CollectionUtils.isEmpty(this.equipList)) {
            return new ArrayList<>();
        }

        return equipList.stream().filter(equip -> ((ReliquaryEquip) equip).isReliquary()).collect(Collectors.toList());
    }
}
