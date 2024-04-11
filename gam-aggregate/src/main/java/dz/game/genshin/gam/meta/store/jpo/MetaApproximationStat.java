package dz.game.genshin.gam.meta.store.jpo;

import dz.game.genshin.gam.meta.vo.AppendProp;
import dz.game.genshin.gam.meta.vo.StatCategoryType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MetaApproximationStat implements Serializable {
    //
    private AppendProp statType;
    private StatCategoryType statCategoryType;
    private BigDecimal approximationValue;
    private BigDecimal originalValue;
    private List<Integer> enforcePattern;

    public MetaApproximationStat(
            AppendProp statType
            , BigDecimal approximationValue
            , BigDecimal originalValue
    ) {
        this.statType = statType;
        this.statCategoryType = StatCategoryType.MAIN;
        this.approximationValue = approximationValue;
        this.originalValue = originalValue;
        this.enforcePattern = new ArrayList<>();
    }

    public MetaApproximationStat(
            AppendProp statType
            , BigDecimal approximationValue
            , BigDecimal originalValue
            , List<Integer> enforcePattern
    ) {
        this.statType = statType;
        this.statCategoryType = StatCategoryType.SUB;
        this.approximationValue = approximationValue;
        this.originalValue = originalValue;
        this.enforcePattern = enforcePattern;
    }
}
