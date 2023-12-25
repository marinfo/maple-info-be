package org.marinfo.mapleinfobe.nexon.controller;

import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.marinfo.mapleinfobe.nexon.dto.*;
import org.marinfo.mapleinfobe.nexon.service.CharacterService;
import org.marinfo.mapleinfobe.nexon.service.GuildService;
import org.marinfo.mapleinfobe.nexon.service.UnionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nexon")
@RequiredArgsConstructor
public class NexonController {
    private final CharacterService characterService;
    private final GuildService guildService;
    private final UnionService unionService;

    // CHARACTER
    @GetMapping("/character/basic")
    public ResponseEntity<CharacterBasic> getCharacterBasic(@RequestParam @NotBlank String characterName) {
        var result = characterService.getCharacterBasic(characterName);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/character/stat")
    public ResponseEntity<CharacterStat> getCharacterStat(@RequestParam @NotBlank String characterName) {
        var result = characterService.getCharacterStat(characterName);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/character/vmatrix")
    public ResponseEntity<CharacterVmatrix> getCharacterVmatrix(@RequestParam @NotBlank String characterName) {
        var result = characterService.getCharacterVmatrix(characterName);
        return ResponseEntity.ok(result);
    }

    // UNION
    @GetMapping("/union/basic")
    public ResponseEntity<UnionBasic> getUnionBasic(@RequestParam @NotBlank String characterName) {
        var result = unionService.getUnionBasic(characterName);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/union/raider")
    public ResponseEntity<UnionRaider> getUnionRaider(@RequestParam @NotBlank String characterName) {
        var result = unionService.getUnionRaider(characterName);
        return ResponseEntity.ok(result);
    }

    // GUILD
    @GetMapping("/guild/basic")
    public ResponseEntity<GuildBasic> getGuildBasic(@RequestParam @NotBlank String guildName,
                                                    @RequestParam @NotBlank String worldName) {
        var result = guildService.getGuildBasic(guildName, worldName);
        return ResponseEntity.ok(result);
    }


}