package dz.game.genshin.gam.player.entity;

import dz.game.genshin.gam.player.vo.Prop;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class AvatarInfo {
    //
    private String avatarID;
    private List<String> talentIdList;
    private Map<String, Prop> propMap;
    private Map<String, BigDecimal> fightMap;
}
