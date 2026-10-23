class BookNotAvailableException extends Exception {
        BookNotAvailableException(String title) {
            super("'" + title + "' is already borrowed");
        }
    }

    class Book {
        private String title;
        private boolean borrowed;

        Book(String title) { this.title = title; }

        void borrow() throws BookNotAvailableException {
            if (borrowed) throw new BookNotAvailableException(title);
            borrowed = true;
            System.out.println("You borrowed '" + title + "'");
        }
    }

    public class librarybook {
        public static void main(String[] args) {
            Book b = new Book("Clean Code");
            try {
                b.borrow();
                b.borrow();
            } catch (BookNotAvailableException e) {
                System.out.println("Sorry: " + e.getMessage());
            } finally {
                System.out.println("Thank you for visiting the library");
            }
        }
}
