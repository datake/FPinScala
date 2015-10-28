object polymorphicFuction {

  /*
   *Aを要素にもつArray[A]から要素を探索
   */

  def findFirst[A](as:Array[A],p:A=>Boolean):Int={
    @annotation.tailrec     //末尾再帰に成功したかどうか
    def loop(n:Int):Int =
      if(n>=as.length) -1   //終了条件
      else if (p(as(n))) n  //asのn番目をfに食わせてtrue = 発見
      else loop(n+1)        //次を探索

    loop(0)
  }

  def main(args:Array[String]):Unit={
   val arr = Array("fuga","hoge","var")
   println(findFirst[String](arr,"hoge".equals))

   val arr2 = Array(1,2,3,4,5)
   println(findFirst[Int](arr2,5.equals))

   /*Array(6,7,8,9,10)は配列リテラル
    *(x:Int)=>x==9は関数リテラル(無名関数)
    *
    */
   println(findFirst(Array(6,7,8,9,10),(x:Int)=>x==9))

  }
}
