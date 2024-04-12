package dz.game.genshin.gam.aggregate.meta.store.jpo;

import dz.game.genshin.gam.spec.vo.AppendProp;
import dz.util.domain.JsonSerializable;
import dz.util.jpa.ListStringConverter;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "APPROXIMATION_SUB_STAT_META")
public class ApproximationSubStatMeta implements JsonSerializable {
    //
    @Id
    private AppendProp statType;
    @Id
    private BigDecimal approximationValue;

    private BigDecimal originalValue;
    @Convert(converter = ListStringConverter.class)
    private List<Integer> reinforcementPattern;
}
