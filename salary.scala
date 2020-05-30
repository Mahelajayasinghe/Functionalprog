object salary extends App{
  def normal(h:Int)=h*150;
  def ot(o:Int)=o*75;
  def amount(l:Int,m:Int)=normal(l)+ot(m);
  def tax(amount:Int)=amount*0.1;
  def totsalary(x:Int,y:Int):Double=amount(x,y)-tax(amount(x,y));
  println(totsalary(40,20));
}
