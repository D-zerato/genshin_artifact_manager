package dz.game.genshin.gam.meta.store.jpo;

import dz.game.genshin.gam.meta.vo.AppendProp;
import dz.game.genshin.gam.meta.vo.StatCategoryType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class MetaArtifactStat implements Serializable {
    //
    private StatCategoryType statCategoryType;
    private AppendProp statType;
    private int level;
    private int rarity;
    private Integer tier;
    private BigDecimal value;
}
