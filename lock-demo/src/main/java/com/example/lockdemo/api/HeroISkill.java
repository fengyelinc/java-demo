package com.example.lockdemo.api;

public class HeroISkill implements Hero {
   public Hero timor;

    public HeroISkill(Hero timor) {
        this.timor = timor;
    }

    @Override
    public void learnSkill() {
        timor.learnSkill();
    }
}
