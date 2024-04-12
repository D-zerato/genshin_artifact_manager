package dz.game.genshin.gam.aggregate.meta.store.jpo;

import dz.game.genshin.gam.spec.vo.AppendProp;
import dz.game.genshin.gam.spec.vo.StatCategory;
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
@Table(schema = "ARTIFACT_META_STAT")
public class ArtifactMetaStat implements Serializable {
    //
    @Id
    private int code;
    private int rarity;
    private int level;
    private StatCategory statCategory;
    private AppendProp statType;
    private Integer subStatTier;
    private BigDecimal value;
}
