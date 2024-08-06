package dz.game.gm.repository.meta.store;

import dz.game.gm.spec.meta.entity.ArtifactMainStatMeta;
import dz.game.gm.spec.meta.entity.ArtifactSubStatMeta;
import dz.game.gm.spec.vo.AppendProp;
import dz.game.gm.repository.meta.ArtifactMainStatMetaRepository;
import dz.game.gm.repository.meta.ArtifactSubStatMetaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@RequiredArgsConstructor
public class ArtifactStatMetaStore {
    private final ArtifactMainStatMetaRepository artifactMainStatMetaRepository;
    private final ArtifactSubStatMetaRepository artifactSubStatMetaRepository;

    public ArtifactMainStatMeta findMainStatMeta(int rarity, int level, AppendProp statType) {
        return artifactMainStatMetaRepository.findByRarityAndLevelAndStatType(rarity, level, statType);
    }

    public Set<ArtifactMainStatMeta> findMainStatMeta(int rarity, int level) {
        return artifactMainStatMetaRepository.findByRarityAndLevel(rarity, level);
    }

    public ArtifactSubStatMeta findSubStatMeta(int rarity, int tier, AppendProp statType) {
        return artifactSubStatMetaRepository.findByRarityAndTierAndStatType(rarity, tier, statType);
    }

    public Set<ArtifactSubStatMeta> findSubStatMeta(int rarity, int tier) {
        return artifactSubStatMetaRepository.findByRarityAndTier(rarity, tier);
    }
}
