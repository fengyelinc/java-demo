package com.example.lockdemo;

import com.example.lockdemo.api.Hero;
import com.example.lockdemo.api.HeroISkill;
import com.example.lockdemo.api.Skill_Q;
import com.example.lockdemo.api.Timor;
import com.example.lockdemo.entity.Book;
import com.example.lockdemo.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LockDemoApplicationTests {
    @Test
    public  void test() {
        Hero hero = new Timor("提莫");
        HeroISkill skill = new HeroISkill(hero);

        HeroISkill q = new Skill_Q(hero,"致盲吹剪");

        System.out.println("---------------------------"+q.toString());

    }

}
