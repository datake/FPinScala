
#Chapter1
##1.2
*純粋関数:副作用をもたない関数
*参照透過性(referential transparency):どのようなプログラムでもプログラムの意味を変えることなく式をその結果に置き換えることができる

*eは参照透過:式eが全てのプログラムpでp内の全てのeをeの評価結果と置き換えることができるとき
*fは純粋関数:関数fがあり、式f(x)が参照透過な全てのxに対して参照透過なとき

##1.3

以下のyは参照透過ではない
	val x = new StringBuilder("Hello")
	val y  = x.append(",World")

	val r1 = y.toString
	//Hello.World
	val r2 = y.toString 
	//Hello,World

なぜなら

	val x = new StringBuilder("Hello") 

	val r1 = x.append(",World).toString
	//Hello,World

	val r2 = x.append(",World).toString
	//Hello,World,World


##1.4
*Functional Proframmingによってプログラムの推論が容易(local reasoningのみで済む)
*モジュール性が向上

