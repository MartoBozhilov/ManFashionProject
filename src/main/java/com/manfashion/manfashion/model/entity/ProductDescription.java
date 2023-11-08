package com.manfashion.manfashion.model.entity;

import com.manfashion.manfashion.model.enums.StyleEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "products_description")
public class ProductDescription extends BaseEntity {

    @Column(nullable = false)
    private String material;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StyleEnum Style;

    @Column(columnDefinition = "TEXT")
    private String description;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public StyleEnum getStyle() {
        return Style;
    }

    public void setStyle(StyleEnum style) {
        Style = style;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
