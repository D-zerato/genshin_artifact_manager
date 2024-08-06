package dz.game.gm.spec.meta.entity;

import dz.game.gm.spec.vo.AppendProp;
import dz.shared.util.json.JsonSerializable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "ARTIFACT_MAIN_STAT_META")
public class ArtifactMainStatMeta implements JsonSerializable {
    @Id
    private int rarity;
    @Id
    private int level;
    @Id
    @Enumerated(EnumType.STRING)
    private AppendProp statType;
    private BigDecimal value;
}

