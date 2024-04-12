package dz.game.genshin.gam.aggregate.meta.store.jpo;

import dz.game.genshin.gam.spec.vo.AppendProp;
import dz.util.jpa.ListStringConverter;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(schema = "APPROXIMATION_SUB_STAT_META")
public class ApproximationSubStatMeta implements Serializable {
    //
    @Id
    private AppendProp statType;
    @Id
    private BigDecimal approximationValue;

    private BigDecimal originalValue;
    @Convert(converter = ListStringConverter.class)
    private List<Integer> reinforcementPattern;

    public ApproximationSubStatMeta(
            AppendProp statType
            , BigDecimal approximationValue
            , BigDecimal originalValue
            , List<Integer> reinforcementPattern
    ) {
        this.statType = statType;
        this.approximationValue = approximationValue;
        this.originalValue = originalValue;
        this.reinforcementPattern = reinforcementPattern;
    }
}