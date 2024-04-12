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
@Table(schema = "ARTIFACT_MAIN_STAT_META")
public class ArtifactMainStatMeta implements Serializable {
    //
    @Id
    private int code;
    @Id
    private int rarity;
    @Id
    private int level;
    private AppendProp statType;
    private BigDecimal value;
}