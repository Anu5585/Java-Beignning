//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ReadingMatterial reading = new ReadingMatterial("Java :","251522515");
        Book book= new Book("Programming :","651256056","Annas");
        Megazine magzinee = new Megazine("JavaScript :","95105165", "Anas");
        Novel novel = new Novel("Best :", "5249489","Anas","600");
        TextBook textBook = new TextBook("HTML :","481520","Annas");


//        System.out.println(reading);
//        System.out.println(book);
//        System.out.println(magzinee);
//        System.out.println(novel);
//        System.out.println(textBook);
        ReadingMatterial [] ak = new ReadingMatterial[5];
        ak[0]= reading;
        ak[1] =  book;
        ak[2] =  magzinee;
        ak[3] =  novel;
        ak[4] =  textBook;
        for (int i=0 ; i< ak.length;i++)
        {
            System.out.println(ak[i].getTitle() + ak[i].getIsbn() );
        }
        }
    }
