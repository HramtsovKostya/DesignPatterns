package patterns.creational;

import patterns.creational.abstractFactory.*;
import patterns.creational.abstractFactory.banking.BankingTeamFactory;
import patterns.creational.abstractFactory.website.WebsiteTeamFactory;

import patterns.creational.builder.Director;
import patterns.creational.builder.website.Website;
import patterns.creational.builder.websiteBuilder.VisitCardWebsiteBuilder;

import patterns.creational.factoryMethod.*;
import patterns.creational.factoryMethod.javaDevelopment.JavaDeveloperFactory;
import patterns.creational.factoryMethod.cppDevelopment.CppDeveloperFactory;
import patterns.creational.factoryMethod.phpDevelopment.PhpDeveloperFactory;

import patterns.creational.prototype.project.*;
import patterns.creational.singleton.ProgramLogger;

public class CreationalPatterns {
    public static void main(String[] args) {
        // Фабричный метод
        DeveloperFactory developerFactory = createDeveloperBySpecialty("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
        System.out.println();

        // Абстрактная фабрика
        ProjectTeamFactory projectTeamFactory = createTeamForDevelopmentProject("banking system");
        Developer javaDeveloper = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating project...");
        javaDeveloper.writeCode();
        tester.testCode();
        projectManager.manageProject();
        System.out.println();

        // Одиночка
        ProgramLogger.getProgramLogger().addLogInfo("First log...");
        ProgramLogger.getProgramLogger().addLogInfo("Second log...");
        ProgramLogger.getProgramLogger().addLogInfo("Third log...");
        ProgramLogger.getProgramLogger().showLogFile();

        // Строитель
        Director director = new Director();
        director.setBuilder(new VisitCardWebsiteBuilder());

        Website website = director.buildWebsite();
        System.out.println(website + "\n");

        // Прототип
        Project master = new Project(1, "SuperProject",
        "SourceCode sourceCode = new SourceCode();");
        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println(masterClone);
    }

    public static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else throw new RuntimeException(specialty + "is unknown specialty.");
    }

    public static ProjectTeamFactory createTeamForDevelopmentProject(String project) {
        if (project.equalsIgnoreCase("banking system")) {
            return new BankingTeamFactory();
        } else if (project.equalsIgnoreCase("auction website")) {
            return new WebsiteTeamFactory();
        } else throw new RuntimeException(project + "is unknown project.");
    }
}