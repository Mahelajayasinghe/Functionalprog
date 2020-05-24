object TotCost extends App{
  def copyBook(x:Int):Unit={
    if(x<50) 
    println(24.95 *60/100*x +3); 
    else 
    println(24.95* 60/100*x +3+0.75*(x-50));
  }
  copyBook(60);
}
