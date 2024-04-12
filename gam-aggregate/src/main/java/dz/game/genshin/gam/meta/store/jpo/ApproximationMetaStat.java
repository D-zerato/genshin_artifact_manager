package dz.game.genshin.gam.meta.store.jpo;

import dz.game.genshin.gam.meta.vo.AppendProp;
import dz.game.genshin.gam.meta.vo.StatCategory;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Table(schema = "APPROXIMATION_META_STAT")
public class ApproximationMetaStat implements Serializable {
    //
    @Id
    private AppendProp statType;
    @Id
    private BigDecimal approximationValue;

    private StatCategory statCategory;
    private BigDecimal originalValue;
    private List<Integer> reinforcementPattern;

    public ApproximationMetaStat(
            AppendProp statType
            , BigDecimal approximationValue
            , BigDecimal originalValue
    ) {
        this.statType = statType;
        this.statCategory = StatCategory.MAIN;
        this.approximationValue = approximationValue;
        this.originalValue = originalValue;
        this.reinforcementPattern = new ArrayList<>();
    }

    public ApproximationMetaStat(
            AppendProp statType
            , BigDecimal approximationValue
            , BigDecimal originalValue
            , List<Integer> reinforcementPattern
    ) {
        this.statType = statType;
        this.statCategory = StatCategory.SUB;
        this.approximationValue = approximationValue;
        this.originalValue = originalValue;
        this.reinforcementPattern = reinforcementPattern;
    }
}
