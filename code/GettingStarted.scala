/*
 * シングルトンオブジェクトを宣言することでクラスとその唯一のインスタンスを同時に宣言
 *MyModuleが名前空間
 * import MuModule._でimport
 */
object MyModule {
  def abs(n:Int): Int =
    if(n<0) -n
    else n

  private def formatAbs(x:Int) = {
  val msg = "The absolute value of %d is %d"
  msg.format(x,abs(x))
  }
/*
 *再帰ヘルパー関数はgoやloopという関数名にするのが慣例
 *末尾呼び出しである場合、最適化が適用される
 */
  def factorial(n: Int):Int = {
    def go(n:Int, acc:Int): Int =
      if(n<=0) acc
      else go(n-1,n*acc)//<-末尾よびだしである
      // 1+go(n-1,n*acc)である場合、末尾呼び出しではない
    go(n-1, 1)
  }

/*
 *引数として関数を受け取る高階関数
 *高階関数のパラメータにはf,g,hのような名前をつけるのが慣例
 */
 private def formatResult(name:String, n:Int, f:Int => Int)={

   val msg="The %s of %d is %d";
   msg.format(name, n, f(n))
 }

 def main(args:Array[String]):Unit = {
   //println(formatAbs(-42))
   //println(formatResult("absolute val",-42,abs))
   println(formatResult("factorial",7,factorial))
 }

}
