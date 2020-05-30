object addeven extends App{
    def even(x:Int):Int={
    
      if(x==0) return 0
      else if(x==1) return 1
      else even(x-2);
    }
    def total(x:Int):Int={
    if(x==1)return 1;
    else{ 
      x+total(x-2);
    }
  }
    def evenseries(y:Int){
      if(even(y)==0){
        println(total(y-2));
      }
      else println(total(y-1));
      
    }

    evenseries(5);
}