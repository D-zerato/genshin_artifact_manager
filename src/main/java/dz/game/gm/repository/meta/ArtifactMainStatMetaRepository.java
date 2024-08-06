package dz.game.gm.repository.meta;

import dz.game.gm.spec.meta.entity.ArtifactMainStatMeta;
import dz.game.gm.spec.vo.AppendProp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ArtifactMainStatMetaRepository extends JpaRepository<ArtifactMainStatMeta, String> {
    ArtifactMainStatMeta findByRarityAndLevelAndStatType(int rarity, int level, AppendProp statType);
    Set<ArtifactMainStatMeta> findByRarityAndLevel(int rarity, int level);
}
