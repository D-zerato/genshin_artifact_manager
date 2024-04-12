package dz.game.genshin.gam.aggregate.meta.store.jpo;

import dz.game.genshin.gam.spec.vo.AppendProp;
import dz.game.genshin.gam.spec.vo.StatCategory;
import dz.util.jpa.ListStringConverter;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
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
    @Convert(converter = ListStringConverter.class)
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
