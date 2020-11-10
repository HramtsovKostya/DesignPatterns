package patterns.behavioral;

import patterns.behavioral.chainOfResponsibility.*;
import patterns.behavioral.chainOfResponsibility.notifiers.*;

import patterns.behavioral.command.*;
import patterns.behavioral.command.commands.*;

import patterns.behavioral.interpreter.Expression;
import patterns.behavioral.interpreter.expressions.*;

import patterns.behavioral.iterator.*;

import patterns.behavioral.mediator.TextChat;
import patterns.behavioral.mediator.User;
import patterns.behavioral.mediator.Users.*;

import patterns.behavioral.memento.*;
import patterns.behavioral.observer.*;

import patterns.behavioral.state.activities.*;

import patterns.behavioral.templateMethod.WebsiteTemplate;
import patterns.behavioral.templateMethod.pages.*;

import patterns.behavioral.visitor.developers.*;

public class BehaviorPatterns {
    public static void main(String[] args) {
        // Цепочка ответственности
        Notifier reportNotifier = new ReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is OK.", Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong!", Priority.IMPORTANT);
        reportNotifier.notifyManager("Houston, we've had a problems here!!!!", Priority.ASAP);

        System.out.println();

        // Команда
        Database database = new Database();

        patterns.behavioral.command.Developer developer =
                new patterns.behavioral.command.Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();

        System.out.println();

        // Интерпретатор
        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEEExpression();

        System.out.println("Does developer knows Java Core: "
                + isJava.interpret("Java Core"));

        System.out.println("Does developer knows Java EE: "
                + isJavaEE.interpret("Java Spring"));

        System.out.println();

        // Итератор
        String [] skills = { "Java", "Spring", "Hibernate", "Maven", "PostgreSQL"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Ivanov Ivan", skills);
        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.print("Skills: ");

        while (iterator.hasNext())
            System.out.print(iterator.next().toString() + " ");

        System.out.println("\n");

        // Посредник
        TextChat chat = new TextChat();
        User admin = new Admin("Admin", chat);
        User user1 = new SimpleUser("User1", chat);
        User user2 = new SimpleUser("User2", chat);

        chat.addUserToChat(user1);
        chat.addUserToChat(user2);
        chat.setAdmin(admin);

        user1.sendMessage("Hello, I'm User 1!!!");
        admin.sendMessage("Roger that. I'm admin!!!");

        System.out.println();

        // Хранитель
        patterns.behavioral.memento.Project project =
                new patterns.behavioral.memento.Project();

        GithubRepository repository = new GithubRepository();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");
        System.out.println(project);

        System.out.println("Saving current version to Github...");
        repository.setSave(project.save());

        System.out.println("Updating project to Version 1.1");
        System.out.println("Writing poor code..");

        try { Thread.sleep(5000); }
        catch (InterruptedException e) { e.printStackTrace(); }

        project.setVersionAndDate("Version 1.1");
        System.out.println(project);

        System.out.println("Something went wrong...");
        System.out.println("Rolling back to Version 1.0");
        project.load(repository.getSave());

        System.out.println("Project after rollback:");
        System.out.println(project);

        System.out.println();

        // Наблюдатель
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Ivanov Ivan");
        Observer secondSubscriber = new Subscriber("Petr Petrov");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Position");
        jobSite.removeVacancy("First Java Position");

        System.out.println();

        // Состояние
        patterns.behavioral.state.Developer developer1 =
                new patterns.behavioral.state.Developer();

        developer1.setActivity(new Sleeping());

        for (int i = 0; i < 10; i++) {
            developer1.justDoIt();
            developer1.changeActivity();
        }
        System.out.println();

        // Стратегия
        patterns.behavioral.strategy.Developer developer2 =
                new patterns.behavioral.strategy.Developer();

        developer2.setActivity(new Sleeping());
        developer2.executeActivity();

        developer2.setActivity(new Training());
        developer2.executeActivity();

        developer2.setActivity(new Coding());
        developer2.executeActivity();

        developer2.setActivity(new Reading());
        developer2.executeActivity();

        System.out.println();

        // Шаблонный метод
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println();

        newsPage.showPage();
        System.out.println();

        // Посетитель
        patterns.behavioral.visitor.elements.Project project1 =
                new patterns.behavioral.visitor.elements.Project();

        patterns.behavioral.visitor.Developer junior = new JuniorDeveloper();
        patterns.behavioral.visitor.Developer senior = new SeniorDeveloper();

        System.out.println("Junior In Action");
        project1.beWritten(junior);
        System.out.println();

        System.out.println("Senior In Action");
        project1.beWritten(senior);
    }

    private static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");
        return new OrExpression(java, javaCore);
    }

    private static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");
        return new AndExpression(java, spring);
    }
}