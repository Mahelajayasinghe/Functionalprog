object primeseq extends App{
  def isprime(x:Int,y:Int):Boolean={
    if(x<=2){
      if(x==2) return true;
      else return false;
    }
    if(y==x)return true;
    if(x%y==0)return false;
    
    return isprime(x,y+1);
  }

  def primeseqense(x:Int):Int= {
    if(x==1) return 0;
    else{
      if(isprime(x-1,2)){
      println(x-1);
      
      }
      primeseqense(x-1);
    }
  }
  
  primeseqense(25);
}