package dz.game.genshin.gam.aggregate.meta.store.jpo;

import dz.game.genshin.gam.spec.vo.AppendProp;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Table(schema = "ARTIFACT_SUB_STAT_META")
public class ArtifactSubStatMeta implements Serializable {
    //
    @Id
    private int code;
    private int rarity;
    private AppendProp statType;
    private Integer tier;
    private BigDecimal value;
}
