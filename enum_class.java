enum  lapp{

  Macbook(2000),XPS(2200),Surface;

  private int price;

  private lapp(){

    price=500;
  }

  private lapp(int price){

    this.price=price;
    System.out.println("in laptop : "+this.name());
  }

  public  int getPrice(){

    return price;
  }

  public void setPrice(int price){

    this.price=price;
  }
}

public class enum_class {

  public static void main(String[] args) {

    //lapp lap=lapp.Macbook;
    //System.out.println(lap +" : "+lap.getPrice());

    for(lapp la:lapp.values()){

      System.out.println(la+" : "+la.getPrice());
    }
    
  }
  
}
