enum status{

  running,success,failure;
}

public class if_enum {
  public static void main(String[] args) {

    status s=status.running;
    switch (s){

      case  running: System.out.println("all good");
      break;

      case failure: System.out.println("try again");
      break;

      default:System.out.println("Done");
      break;

    }
    if (s==status.running){

      System.out.println("All good");
    }
    else if(s==status.failure){

      System.out.println("try again");
    }

    else{

      System.out.println("Done");
    }
    
  }
  
}