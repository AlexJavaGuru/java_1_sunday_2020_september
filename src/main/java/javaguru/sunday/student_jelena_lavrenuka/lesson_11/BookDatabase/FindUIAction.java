package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

import java.util.List;
import java.util.Scanner;

class FindUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. author and title");
        System.out.println("2. year of the issue and title");
        System.out.println("3. author and year of the issue");
        System.out.println("4. author or year of the issue");
        System.out.println("5. author or title");
        System.out.println("6. year of the issue or title");
        System.out.println("");
        System.out.println("Please choose search criteria and enter number of your criteria");
        int number = scanner.nextInt();
        switch (number) {
            case 1 -> {
                System.out.println("Please enter author");
                String author = scanner.nextLine();
                System.out.println("Please enter title");
                String title = scanner.nextLine();
                SearchCriteria authorSearchCriteria = new AuthorSearchCriteria(author);
                SearchCriteria titleSearchCriteria = new TitleSearchCriteria(title);
                SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
                List<Book> resultList = bookDatabase.find(searchCriteria);
                for (Book book : resultList) {
                    System.out.println(book.toString());
                }
            }
            case 2 -> {
                System.out.println("Please enter year of the issue");
                String yearOfTheIssue = scanner.nextLine();
                System.out.println("Please enter title");
                String title = scanner.nextLine();
                SearchCriteria yearOfTheIssueSearchCriteria = new YearOfIssueSearchCriteria(yearOfTheIssue);
                SearchCriteria titleSearchCriteria = new TitleSearchCriteria(title);
                SearchCriteria searchCriteria = new AndSearchCriteria(yearOfTheIssueSearchCriteria, titleSearchCriteria);
                List<Book> resultList = bookDatabase.find(searchCriteria);
                for (Book book : resultList) {
                    System.out.println(book.toString());
                }
            }
            case 3 -> {
                System.out.println("Please enter author");
                String author = scanner.nextLine();
                System.out.println("Please enter year of the issue");
                String yearOfTheIssue = scanner.nextLine();
                SearchCriteria yearOfTheIssueSearchCriteria = new YearOfIssueSearchCriteria(yearOfTheIssue);
                SearchCriteria authorSearchCriteria = new AuthorSearchCriteria(author);
                SearchCriteria searchCriteria = new AndSearchCriteria(yearOfTheIssueSearchCriteria, authorSearchCriteria);
                List<Book> resultList = bookDatabase.find(searchCriteria);
                for (Book book : resultList) {
                    System.out.println(book.toString());
                }
            }
            case 4 -> {
                System.out.println("Please enter author");
                String author = scanner.nextLine();
                System.out.println("Please enter year of the issue");
                String yearOfTheIssue = scanner.nextLine();
                SearchCriteria yearOfTheIssueSearchCriteria = new YearOfIssueSearchCriteria(yearOfTheIssue);
                SearchCriteria authorSearchCriteria = new AuthorSearchCriteria(author);
                SearchCriteria searchCriteria = new OrSearchCriteria(yearOfTheIssueSearchCriteria, authorSearchCriteria);
                List<Book> resultList = bookDatabase.find(searchCriteria);
                for (Book book : resultList) {
                    System.out.println(book.toString());
                }
            }
            case 5 -> {
                System.out.println("Please enter author");
                String author = scanner.nextLine();
                System.out.println("Please enter title");
                String title = scanner.nextLine();
                SearchCriteria authorSearchCriteria = new AuthorSearchCriteria(author);
                SearchCriteria titleSearchCriteria = new TitleSearchCriteria(title);
                SearchCriteria searchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
                List<Book> resultList = bookDatabase.find(searchCriteria);
                for (Book book : resultList) {
                    System.out.println(book.toString());
                }
            }
            case 6 -> {
                System.out.println("Please enter year of the issue");
                String yearOfTheIssue = scanner.nextLine();
                System.out.println("Please enter title");
                String title = scanner.nextLine();
                SearchCriteria yearOfTheIssueSearchCriteria = new YearOfIssueSearchCriteria(yearOfTheIssue);
                SearchCriteria titleSearchCriteria = new TitleSearchCriteria(title);
                SearchCriteria searchCriteria = new OrSearchCriteria(yearOfTheIssueSearchCriteria, titleSearchCriteria);
                List<Book> resultList = bookDatabase.find(searchCriteria);
                for (Book book : resultList) {
                    System.out.println(book.toString());
                }
            }
            default -> System.out.println("Please choose search criteria and enter number of your criteria");
        }

    }
}
