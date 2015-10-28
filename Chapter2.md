#Chapter2

##Chapter2.2
* シングルトンオブジェクトを宣言することでクラスとその唯一のインスタンスを同時に宣言
* MyModuleが名前空間
* import MuModule._でimport

```GettingStarted.scala
	object MyModule {
	  def abs(n:Int): Int =
	    if(n<0) -n
	    else n

	  private def formatAbs(x:Int) = {
	  val msg = "The absolute value of %d is %d"
	  msg.format(x,abs(x))
	  }

	  def main(args:Array[String]):Unit =
	    println(formatAbs(-42))
	}
```
