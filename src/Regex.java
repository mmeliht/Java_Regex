/**
*
* @another Mustafa Melih Tüfekcioðlu mustafa.tufekcioglu@ogr.sakarya.edu.tr
* @since 29.03.2022
* <p>
* 2.Öðretim b grubu
* </p>
*/
public class Regex {
	public final static String CommentLine = "\\/\\/[^\\n]*|\\/\\*[\\S\\s]*?\\*\\/"; // yorum satiri
	public final static String LogicalOperators = "(&&|\\|\\||\\!^=)"; // mantiksal operatorleri

	
	public final static String NumericOperatorsUnary = "(\\+\\+|\\-\\-)"; 
	public final static String NumericOperatorsBinary = "(\\+|\\-|\\*|\\/|%|&|\\|\\||\\^|=|\\+=|\\-=|\\/=|\\*=|%=|&=|\\|=|^=)";
	

	public final static String RelationalOperators1 = "(<=|>=)"; // 
	public final static String RelationalOperators2 = "(==|!=|<|>)";
}
