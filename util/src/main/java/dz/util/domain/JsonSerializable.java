package dz.util.domain;

import dz.util.string.JsonUtils;

import java.io.Serializable;

public interface JsonSerializable extends Serializable {
    //
    default String toJson() {
        return JsonUtils.toJson(this);
    }
}
