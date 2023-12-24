package org.marinfo.mapleinfobe.api.guild.vo;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OguildId {
    @JsonAlias({"oguild_id"})
    private String oguildId;
}
