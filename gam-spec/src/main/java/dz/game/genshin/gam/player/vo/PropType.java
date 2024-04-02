package dz.game.genshin.gam.player.vo;

import lombok.Getter;

@Getter
public enum PropType {
    _1001("1001") // 경험치
    , _1002("1002") // 돌파 단계
    , _4001("4001") // 레벨
    ;

    private final String code;

    PropType(String code) {
        this.code = code;
    }
}
