object oddeven extends App{
    def odd(x:Int){
      if(x<0)println("Negative");
      else if(x==0)println("Even number");
      else if(x==1)println("Odd number");
      else odd(x-2);
    }
    odd(10);
}