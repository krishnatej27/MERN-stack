// Book object
function Book(title, author, ISBN) {
  this.title = title;
  this.author = author;
  this.ISBN = ISBN;
  this.isBorrowed = false;

  this.borrow = function() {
    this.isBorrowed = true;
  };

  this.returnBook = function() {
    this.isBorrowed = false;
  };
}

// Library object
function Library() {
  this.books = [];

  this.addBook = function(book) {
    this.books.push(book);
  };

  this.findBookByISBN = function(isbn) {
    return this.books.find(book => book.ISBN === isbn);
  };

  this.listAvailableBooks = function() {
    return this.books.filter(book => !book.isBorrowed);
  };

  this.listBorrowedBooks = function() {
    return this.books.filter(book => book.isBorrowed);
  };
}

// Usage
let library = new Library();
let book1 = new Book("1984", "George Orwell", "1234");
let book2 = new Book("Brave New World", "Aldous Huxley", "5678");

library.addBook(book1);
library.addBook(book2);

book1.borrow();
console.log(library.listAvailableBooks());  // [book2]
console.log(library.listBorrowedBooks());   // [book1]
