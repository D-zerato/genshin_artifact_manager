package dz.game.gm.spec.enka.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerInfo {
    private String nickname;
    private String signature;
    private int worldLevel;
    private String namecardId;
    private int finishAchievementNum;
    private String towerFloorIndex;
    private String towerLevelIndex;
    private String showAvatarInfoList; // todo 타입 변경 필요
    private String showNameCardIdList;
    private ProfilePicture profilePicture; // 프로필 사진 캐릭터 ID

    @Getter
    @Setter
    public class ProfilePicture {
        private String id;
    }
}
