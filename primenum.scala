object primenum extends App{
  def isprime(x:Int,y:Int):Boolean={
    if(x<=2){
      if(x==2) return true;
      else return false;
    }
    if(y==x)return true;
    if(x%y==0)return false;
    
    return isprime(x,y+1);
  }
  if(isprime(6,2))println("Prime number");
  else println("Not a prime number");
}
