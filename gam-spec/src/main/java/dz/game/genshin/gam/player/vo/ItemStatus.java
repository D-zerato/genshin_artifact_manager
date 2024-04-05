package dz.game.genshin.gam.player.vo;

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
