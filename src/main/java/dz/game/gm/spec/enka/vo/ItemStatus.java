package dz.game.gm.spec.enka.vo;

import dz.game.gm.spec.vo.AppendProp;
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
