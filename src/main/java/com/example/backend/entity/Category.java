package com.example.backend.entity;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@EqualsAndHashCode
@NoArgsConstructor
@Setter
@Getter
public class Category {
    private Long id;
    private String title;
    private Long completedCount;
    private Long uncompletedCount;

    // СѓРєР°Р·С‹РІР°РµРј, С‡С‚Рѕ РїРѕР»Рµ Р·Р°РїРѕР»РЅСЏРµС‚СЃСЏ РІ Р‘Р”
    // РЅСѓР¶РЅРѕ, РєРѕРіРґР° РґРѕР±Р°РІР»СЏРµРј РЅРѕРІС‹Р№ РѕР±СЉРµРєС‚ Рё РѕРЅ РІРѕР·РІСЂР°С‰Р°РµС‚СЃСЏ СѓР¶Рµ СЃ РЅРѕРІС‹Рј id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }


    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }


    @Basic
    @Column(name = "completed_count")
    public Long getCompletedCount() {
        return completedCount;
    }


    @Basic
    @Column(name = "uncompleted_count")
    public Long getUncompletedCount() {
        return uncompletedCount;
    }


}