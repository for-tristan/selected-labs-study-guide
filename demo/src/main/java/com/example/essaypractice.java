package com.example;

interface shape{

    void draw();

}


class circle implements shape{

    @Override 

    public void draw(){


    }

}


class square implements shape {

    
    @Override 

    public void draw(){

        
    }


}

class rectangle implements shape {


    @Override 

    public void draw(){

        
    }


}


class shapefactoru{

    public static shape createshape(String shapecreate){
            switch (shapecreate.toLowerCase()) {
                case "circle" : new circle();
                case "square" : new square();
                case "rectangle" : new rectangle();
                    
                    
                default: return null;
                   
            }




    }



}





class counter{

    private static int counter = 0;
    private static counter instance;

    private static counter getInstance(){

        if (instance == null)
            instance = new counter();

        counter++;
    
        return instance;



    }

    public static int getcounter(){

        return counter;

    }



}





class product{
  String product_id;
 String product_name;
  String product_cost;

}


interface deliver{

void deliver(product product);

}



class driver implements deliver{


@Override 

public void deliver(product product){


    System.out.println("delivering");

}


}


class company{

private deliver ds;
public company(deliver ds){


    this.ds = ds;

}


public void sp (product product){

    this.ds.deliver(product);

}



}



class DatabaseConnection{

    private static DatabaseConnection instance;
    public static DatabaseConnection getInstance(){

        if(instance == null)
            instance = new DatabaseConnection();

        return instance;


    }


    public void connect(){

        System.out.println("connected");

    }

    public void disconnected(){

        System.out.println("disconnected");


    }




}



class customername{

    private String name;


}


class customerdatasave{

    void savetodb(){


    }
}

class customerReport{

    void report(){



    }
}


 class bird{

    void layeggs(){

        System.out.println("i lay eggs");


    }    


}


interface flight{

    void flight();


}


class sparrow extends bird implements flight {

@Override 
public void flight(){
    System.out.println("i can fly");
}


}



class penguine extends bird{





}


interface work{

 void work();



} 




interface eat{

    void eat();

}



class person implements work, eat{

    @Override 
    public void work(){



    }

    @Override 

    public void eat(){


    }


}



class robot implements work{

     @Override 
    public void work(){



    }



}




public class essaypractice {


    
}
