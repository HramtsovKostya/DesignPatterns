package patterns.structural;

import patterns.creational.factoryMethod.Developer;
import patterns.creational.factoryMethod.cppDevelopment.CppDeveloper;
import patterns.creational.factoryMethod.javaDevelopment.JavaDeveloper;

import patterns.structural.adapter.*;
import patterns.structural.bridge.*;
import patterns.structural.composite.*;
import patterns.structural.decorator.*;
import patterns.structural.facade.*;
import patterns.structural.flyweight.DeveloperFactory;
import patterns.structural.proxy.Project;
import patterns.structural.proxy.ProxyProject;

import java.util.ArrayList;
import java.util.List;

public class StructuralPatterns {
    public static void main(String[] args) {
        // Адаптер
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();

        System.out.println();

        // Мост
        Program [] programs = {
            new BankSystem(new JavaDeveloper()),
            new StockExchange(new CppDeveloper())
        };

        for (Program program : programs)
            program.developProgram();
        System.out.println();

        // Компоновщик
        TeamOfDevelopers team = new TeamOfDevelopers();

        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);
        team.removeDeveloper(secondJavaDeveloper);

        team.createProject();
        System.out.println();

        // Декоратор
        Developer seniorDeveloper = new SeniorJavaDeveloper(new JavaDeveloper());
        Developer teamLeadDeveloper = new JavaTeamLead(seniorDeveloper);

        teamLeadDeveloper.writeCode();
        System.out.println();

        // Фасад
        Workflow workflow = new Workflow();
        workflow.solveProblems();
        System.out.println();

        // Приспособленец
        DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            developers.add(developerFactory.getDeveloperBySpecialty("java"));
            developers.add(developerFactory.getDeveloperBySpecialty("c++"));
        }

        for (Developer developer : developers)
            developer.writeCode();
        System.out.println();

        // Прокси
        Project project = new ProxyProject("https://www.github.com/HramtsovKostya/realProject");
        project.run(); // loading and running project
    }
}