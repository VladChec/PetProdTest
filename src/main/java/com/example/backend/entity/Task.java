package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@Setter
@EqualsAndHashCode
public class Task {
    private Long id;
    private String title;
    private Integer completed;
    private Date date;
    private Priority priority;
    private Category category;

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
    @Column(name = "completed")
    public Integer getCompleted() {
        return completed;
    }


    @Basic
    @Column(name = "date")
    public Date getDate() {
        return date;
    }


    @ManyToOne
    @JoinColumn(name = "priority_id", referencedColumnName = "id")
    public Priority getPriority() {
        return priority;
    }


    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    public Category getCategory() {
        return category;
    }
}