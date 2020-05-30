object addinum extends App{
  def total(x:Int):Int={
    if(x==1)return 1;
    else{ 
      x+total(x-1);
    }
  }
  println(total(5));
}