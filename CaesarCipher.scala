object CaesarCipher extends App{
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	val encrypt = (shift:Int, x:Char, s:String)=> s((s.indexOf(x.toUpper)+shift)) //function for encryption
	val decrypt = (shift:Int, x:Char, s:String)=> s((s.indexOf(x.toUpper)-shift)) //function for decryption
	val CCipher = (alg:(Int,Char,String)=> Char,shift:Int,s:String,a:String)=>s.map(alg(shift,_,a))
	
	val e = CCipher (encrypt,1,"school",alphabet)
	println (e)
	val d = CCipher (decrypt,1,e,alphabet)
	println (d)
}