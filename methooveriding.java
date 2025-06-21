class parent{

  void property(){

    System.out.println("property");
  }

  void main(){

    System.out.println("method");
  }
}

class child extends parent{

  void marry(){

    System.out.println("marry");
  }
}

public class methooveriding {

  public static void main(String[] args) {
    
    parent p=new child();
    
    
    
  }
  
}
