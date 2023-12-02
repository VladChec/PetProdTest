package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@EqualsAndHashCode
public class Priority {
    private Long id;
    private String title;
    private String color;

    // СѓРєР°Р·С‹РІР°РµРј, С‡С‚Рѕ РїРѕР»Рµ Р·Р°РїРѕР»РЅСЏРµС‚СЃСЏ РІ Р‘Р”
    // РЅСѓР¶РЅРѕ, РєРѕРіРґР° РґРѕР±Р°РІР»СЏРµРј РЅРѕРІС‹Р№ РѕР±СЉРµРєС‚ Рё РѕРЅ РІРѕР·РІСЂР°С‰Р°РµС‚СЃСЏ СѓР¶Рµ СЃ РЅРѕРІС‹Рј id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }


    @Basic
    @Column(name = "color")
    public String getColor() {
        return color;
    }


}