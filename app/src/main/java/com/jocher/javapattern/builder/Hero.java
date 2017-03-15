package com.jocher.javapattern.builder;

/**
 * Created by wubin on 2017/3/15.
 */

public class Hero {

  private  Profession profession;
  private  String name;
  private  HairType hairType;
  private  HairColor hairColor;
  private  Armor armor;
  private  Weapon weapon;

  private Hero(Builder builder) {
    setProfession(builder.profession);
    setName(builder.name);
    setHairType(builder.hairType);
    setHairColor(builder.hairColor);
    setArmor(builder.armor);
    setWeapon(builder.weapon);
  }

  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();
    sb.append("This is a ")
        .append(profession)
        .append(" named ")
        .append(name);
    if (hairColor != null || hairType != null) {
      sb.append(" with ");
      if (hairColor != null) {
        sb.append(hairColor).append(' ');
      }
      if (hairType != null) {
        sb.append(hairType).append(' ');
      }
      sb.append(hairType != HairType.BALD ? "hair" : "head");
    }
    if (armor != null) {
      sb.append(" wearing ").append(armor);
    }
    if (weapon != null) {
      sb.append(" and wielding a ").append(weapon);
    }
    sb.append('.');
    return sb.toString();
  }



  public Profession getProfession() {
    return profession;
  }

  public void setProfession(Profession profession) {
    this.profession = profession;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HairType getHairType() {
    return hairType;
  }

  public void setHairType(HairType hairType) {
    this.hairType = hairType;
  }

  public HairColor getHairColor() {
    return hairColor;
  }

  public void setHairColor(HairColor hairColor) {
    this.hairColor = hairColor;
  }

  public Armor getArmor() {
    return armor;
  }

  public void setArmor(Armor armor) {
    this.armor = armor;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public static final class Builder {

    private Profession profession;
    private String name;
    private HairType hairType;
    private HairColor hairColor;
    private Armor armor;
    private Weapon weapon;

    public Builder(Profession profession, String name) {
      if (profession == null || name == null) {
        throw new IllegalArgumentException("profession and name can not be null");
      }
      this.profession = profession;
      this.name = name;
    }

    public Builder profession(Profession val) {
      profession = val;
      return this;
    }

    public Builder name(String val) {
      name = val;
      return this;
    }

    public Builder hairType(HairType val) {
      hairType = val;
      return this;
    }

    public Builder hairColor(HairColor val) {
      hairColor = val;
      return this;
    }

    public Builder armor(Armor val) {
      armor = val;
      return this;
    }

    public Builder weapon(Weapon val) {
      weapon = val;
      return this;
    }

    public Hero build() {
      return new Hero(this);
    }
  }
}
