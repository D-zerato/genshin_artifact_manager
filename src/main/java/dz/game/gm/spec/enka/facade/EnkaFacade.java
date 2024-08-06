package dz.game.gm.spec.enka.facade;

import dz.game.gm.spec.enka.entity.EnkaProfile;

public interface EnkaFacade {
    EnkaProfile findEnkaProfile(String uuid);
}
