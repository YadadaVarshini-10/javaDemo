enum Status{

  Running,failing,success;

  
}

public class Enumeration {

  public static void main(String[] args) {

    Status s=Status.Running;
    System.out.println(s);

    Status[] s1=Status.values();
    for(Status s2:s1){

      System.out.println(s2);
    }
    Status s3=Status.failing;
    System.out.println(s3.ordinal());

  } 
}
