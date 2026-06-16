package org.mogul.main;

import org.mogul.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        //Parrot p = new Parrot();

        Parrot p = context.getBean("parrot2",Parrot.class);
        System.out.println(p.getName());

        Parrot m = context.getBean("Mogul",Parrot.class);
        System.out.println(m.getName());

    }
}