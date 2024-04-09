package dz.game.genshin.gam.enka.vo;

import dz.game.genshin.gam.meta.vo.AppendProp;
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
