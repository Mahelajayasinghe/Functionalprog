object fib extends App{
    def fibonacci(x:Int):Int= x match{
      case 0 => 0;
      case 1 => 1;
      case _ => fibonacci(x-1)+fibonacci(x-2);
    }
    def fibseries(y:Int){
      if(y>0) fibseries(y-1);
      println(fibonacci(y));
    }
    fibseries(10);
}