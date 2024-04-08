package dz.game.genshin.gam.enka.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.Optional;

@Getter
@Setter
public class Weapon {
    //
    private int level;
    private int promoteLeve;    // todo 돌파레벨 관련 자료 필요
    private Map<String, Integer> affixMap;

    public int getAffixMap() {
        //
        return Optional.ofNullable(affixMap.get(0)).orElse(0);
    }
}
