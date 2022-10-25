import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
class Flower {
    public String whatsYourName(){
        String result = "I hava many names and types";
        return result;
    }
}

class Jasmine extends Flower {
    @Override
    public String whatsYourName(){
        String result = "Jasmine";
        return result;
    }
    
}

class Lotus extends Flower{
    @Override
    public String whatsYourName(){
        String result = "Lotus";
        return result;
    }
}

class Region {

    public Flower yourNationalFlower(){
        return new Flower();
    }
}

class WestBengal extends Region{
    @Override
    public Jasmine yourNationalFlower(){
        return new Jasmine();

    }
}

class AndhraPradesh extends Region {
    @Override
    public Lotus yourNationalFlower(){
        return new Lotus(); 

    }
}


public class Covariant {
  public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.readLine().trim();
      Region region = null;
      switch (s) {
        case "WestBengal":
          region = new WestBengal();
          break;
        case "AndhraPradesh":
          region = new AndhraPradesh();
          break;
      }
      Flower flower = region.yourNationalFlower();
      System.out.println(flower.whatsYourName());
    }
}