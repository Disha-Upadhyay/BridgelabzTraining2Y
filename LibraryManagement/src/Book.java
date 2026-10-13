public class Book {
    int bookId;
    String title;
    String author;
    double price;
    public Book(int bookId,String title,String author,double price){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.price=price;
    }
}

class LibrarySystemManagement{
    public static int removeDuplicates(Book[] books,int n) {
        if (n == 0) {
            return 0;
        }
        int j = 0;
        for(int i=0;i<n;i++){
            if(books[i].bookId!=books[j].bookId){
                j++;
                books[j]=books[i];
            }
        }
        return j+1;
    }

    public static void searchByTitle(Book[] books,int count,String query){
        boolean found = false;

        for(int i=0;i<count;i++){
            if(books[i].title.toLowerCase().contains(query.toLowerCase())){
                System.out.println("-Found:["+books[i].bookId+"]"+books[i].title +"(Rs." +books[i].price +")");
                found = true;
            }
        }
        if(!found){
            System.out.println("No book found.");
        }
    }

    public static void sortByPrice(Book[] books,int count ){
        int swaps =0;
        for(int i=0;i<count-1;i++) {
            int minIndex = i;
            for (int j = i + 1; j < count; j++) {
                if (books[j].price < books[minIndex].price) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Book temp = books[i];
                books[i] = books[minIndex];
                books[minIndex] = temp;
                swaps++;
            }
        }
                System.out.println("Total swap count:"+swaps);
    }

    public static int searchByPrice(Book[] books,int count ,double targetPrice){
        int low=0;
        int high =count-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(books[mid].price==targetPrice){
                return mid;
            }else if(books[mid].price<targetPrice){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }

    public static int minBooksForTargetCost(Book[] books,int count,double targetCost) {
        double currentSum = 0;
        int left = 0;
        int minLength = count + 1;
        for (int right = 0; right < count; right++) {
            currentSum += books[right].price;
            while (currentSum >= targetCost) {
                int length = right - left + 1;
                if (length < minLength) {
                    minLength = length;
                }
                currentSum -=books[left].price;
                left++;
            }
        }
        if (minLength == count+1) {
            return 0;
        }
        return minLength;
    }

    public static void main(String[] args) {
        Book[] books ={
                new Book(101,"Data Structures","Mark",400.0),
                new Book(101,"Data Structures","Mark",400.0),
                new Book(102,"Java Basic","James",300.0),
                new Book(103,"Python Guide","Guido",600.0),
                new Book(104,"Database System","Raghu",500.0),
                new Book(105,"Computer Networks","Andrew",700.0)
        };
        int count =books.length;
        count=removeDuplicates(books,count);
        System.out.println("Unique Book Count: " +count);
        for(int i=0;i<count;i++){
            System.out.println("[" + books[i].bookId +"]" + books[i].title + "- Rs." + books[i].price);
        }
        System.out.println("\nSearch Result for 'data':");
        searchByTitle(books,count,"data");

        System.out.println("\nSorting books by price:");
        sortByPrice(books,count);

        for(int i=0;i<count;i++){
            System.out.println((i+1) + ".[" + books[i].bookId +"]" + books[i].title + "- Rs." + books[i].price);
        }
        double targetPrice =500.0;
        System.out.println("\nSearching for price Rs. " + targetPrice);

        int index = searchByPrice(books,count,targetPrice);
        if(index!=-1){
            System.out.println("Book found at index " + index + ":" +books[index].title);
        }
        else{
            System.out.println("Book not found.");
        }

        double targetCost = 1000.0;
        int result = minBooksForTargetCost(books,count,targetCost);
        System.out.println("\nTarget Cost: Rs. " + targetCost);
        System.out.println("Minimum consecutive Books Needed: " + result);
    }
}
