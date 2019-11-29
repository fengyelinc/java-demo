package com.example.lockdemo.api;

public class Skill_Q extends HeroISkill {
    private String skillName;

    public Skill_Q(Hero timor, String skillName) {
        super(timor);
        this.skillName = skillName;
    }

    public void learnSkill(){
        System.out.println("学习了Q技能"+skillName);
        super.learnSkill();
    }

}
