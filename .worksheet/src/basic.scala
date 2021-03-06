object basic {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(47); 
  val l = List("aaaa", "b", "c");System.out.println("""l  : List[String] = """ + $show(l ));$skip(105); 
 
  /*
   * for block
   */
  for {
  	i <- l // generator, for each element in the list
  } println (i);$skip(67); 
  
  for {
  	i <- l
		if (i.length > 3) // filter
  } println (i);$skip(146); 
  
  
  val result_for = for {
  	i <- l
  	i1 = i.toUpperCase() // variable binding
  	if (i1 != "")
  } yield (i1);System.out.println("""result_for  : List[String] = """ + $show(result_for ));$skip(16); val res$0 =  // generate a new collection
  
  result_for;System.out.println("""res0: List[String] = """ + $show(res$0));$skip(116); 
  
  
  
  // until is often used to loop through strings or arrays
	val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";System.out.println("""randLetters  : String = """ + $show(randLetters ));$skip(113); 
	for (i <- 0 until randLetters.length){
		// Get the letter in the index of the String
		println(randLetters(i))
	};$skip(210); 
    
  
  /*
   * there is no break and continue in Scala loop
   */
  def printPrimes() {
  	val primeList = List(1,2,3,5,7,11)
  	for (i <- primeList) {
  		if (i == 7)
  			return
  		println(i)
  	}
  };System.out.println("""printPrimes: ()Unit""");$skip(17); 
  
  printPrimes;$skip(167); 
    
  /*
   * try catch finally
   */
  val result_try = try {
  	Integer.parseInt("Dog")
  } catch {
  	case _ => 0
  } finally {
  	println("This is finally.")
  };System.out.println("""result_try  : Int = """ + $show(result_try ));$skip(46); 
  
  /*
   * match block
   */
  val code = 1;System.out.println("""code  : Int = """ + $show(code ));$skip(98); 
  val result_match = code match {
  	case 1 => "one"
  	case 2 => "two"
  	case _ => "others"
  };System.out.println("""result_match  : String = """ + $show(result_match ));$skip(43); 
  

	/*
	 * string
	 */
	 var s = "hello ";System.out.println("""s  : String = """ + $show(s ));$skip(7); val res$1 = 
	 s(1);System.out.println("""res1: Char = """ + $show(res$1));$skip(20); val res$2 = 
	 s.concat("world");System.out.println("""res2: String = """ + $show(res$2));$skip(12); val res$3 = 
	 s.toArray;System.out.println("""res3: Array[Char] = """ + $show(res$3));$skip(17); val res$4 = 
	 s.indexOf("o");System.out.println("""res4: Int = """ + $show(res$4))}



}
