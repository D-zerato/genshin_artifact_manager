package dz.game.genshin.gam.aggregate.meta.store.jpo;

import dz.game.genshin.gam.spec.vo.AppendProp;
import dz.util.domain.JsonSerializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "ARTIFACT_MAIN_STAT_META")
public class ArtifactMainStatMeta implements JsonSerializable {
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

