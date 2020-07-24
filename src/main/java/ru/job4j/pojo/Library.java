package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bookClean = new Book("Clean code", 500);
        Book bookMaugli = new Book("Maugli", 300);
        Book bookBlackSwan = new Book("Black Swan", 800);
        Book bookAlroritm = new Book("Algoritm", 200);

        Book[] books = new Book[4];
        books[0] = bookClean;
        books[1] = bookMaugli;
        books[2] = bookBlackSwan;
        books[3] = bookAlroritm;

        for (int index = 0; index < books.length; index++) {
            Book bookInd = books[index];
            System.out.println(bookInd.getName() + " - " + bookInd.getPapers());
        }

        Book bookTmp = books[0];
        books[0] = books[3];
        books[3] = bookTmp;

        for (int index = 0; index < books.length; index++) {
            Book bookInd = books[index];
            System.out.println(bookInd.getName() + " - " + bookInd.getPapers());
        }

        for (int index = 0; index < books.length; index++) {
            Book bookInd = books[index];
            if (bookInd.getName().equals("Clean code")) {
                System.out.println(bookInd.getName() + " - " + bookInd.getPapers());
            }

        }

    }
}
