package dz.game.gm.service.meta;

import dz.game.gm.spec.meta.entity.ArtifactMainStatMeta;
import dz.game.gm.spec.meta.entity.ArtifactSubStatMeta;
import dz.game.gm.spec.vo.AppendProp;
import dz.game.gm.repository.meta.store.ArtifactStatMetaStore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ArtifactStatMetaQueryLogic {
    private final ArtifactStatMetaStore artifactStatMetaStore;
    
    public ArtifactMainStatMeta findMainStatMeta(int rarity, int level, AppendProp statType) {
        return artifactStatMetaStore.findMainStatMeta(rarity, level, statType);
    }
    
    public Set<ArtifactMainStatMeta> findMainStatMeta(int rarity, int level) {
        return artifactStatMetaStore.findMainStatMeta(rarity, level);
    }

    public ArtifactSubStatMeta findSubStatMeta(int rarity, int tier, AppendProp statType) {
        return artifactStatMetaStore.findSubStatMeta(rarity, tier, statType);
    }

    public Set<ArtifactSubStatMeta> findSubStatMeta(int rarity, int tier) {
        return artifactStatMetaStore.findSubStatMeta(rarity, tier);
    }
}
