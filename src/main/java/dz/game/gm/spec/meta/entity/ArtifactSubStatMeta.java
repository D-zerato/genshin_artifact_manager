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
@Table(schema = "ARTIFACT_SUB_STAT_META")
public class ArtifactSubStatMeta implements JsonSerializable {
    @Id
    private int rarity;
    @Id
    private int tier;
    @Id
    @Enumerated(EnumType.STRING)
    private AppendProp statType;
    private BigDecimal value;
}
