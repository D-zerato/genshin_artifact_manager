package dz.game.genshin.gam.spec.enka.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EnkaProfile {
    //
    private PlayerInfo playerInfo;
    private List<AvatarInfo> avatarInfoList;
}
