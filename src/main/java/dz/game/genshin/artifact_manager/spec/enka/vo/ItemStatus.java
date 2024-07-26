package dz.game.genshin.artifact_manager.spec.enka.vo;

import dz.game.genshin.artifact_manager.spec.vo.AppendProp;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ItemStatus {
    private AppendProp mainPropId;
    private AppendProp appendPropId;
    private BigDecimal propValue;
}
