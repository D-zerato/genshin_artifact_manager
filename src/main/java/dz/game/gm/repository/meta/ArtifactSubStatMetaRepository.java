package dz.game.gm.repository.meta;

import dz.game.gm.spec.meta.entity.ArtifactSubStatMeta;
import dz.game.gm.spec.vo.AppendProp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ArtifactSubStatMetaRepository extends JpaRepository<ArtifactSubStatMeta, String> {
    ArtifactSubStatMeta findByRarityAndTierAndStatType(int rarity, int tier, AppendProp statType);
    Set<ArtifactSubStatMeta> findByRarityAndTier(int rarity, int tier);
}
