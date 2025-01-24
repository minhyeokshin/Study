package Day13.Home;

public class BookMgr {

    private Book[] booklist;

    public BookMgr(Book[] booklist) {
        this.booklist = booklist;
    }

    public void printBooklist(){
        for (int i = 0;i< booklist.length;i++){
            System.out.println(booklist[i].getTitle());
        }

    }

    public void printTotalPrice(){
        int sum = 0;
        for(int i = 0;i<5;i++){
            booklist[i].getPrice();
            sum += booklist[i].getPrice();
        }
        System.out.printf("전체 책 가격의 합 : %d",sum);

    }
}